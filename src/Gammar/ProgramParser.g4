parser grammar ProgramParser;

options {
  tokenVocab=ProgramLexer;
}

program : line+ | htmlDoc;

line :
      importStatement         #importState
    | classDeclaration        #class
    | angularType             #angular
    | statement               #statementt
    | interface               #interfaceStatement
;


statement:
    iterationStatement      #iteration
  | declaration             #declarationStatement
  | ifStatement             #if
  | returnStatement         #return
  | expression              #express
;

iterationStatement :
      doWhileStatement        #dowhile
    | forStatement            #for
    | whileStatement          #while

;

declaration :
    variableDeclaration     #variable
  | functionDeclaration     #function
  | arrayDeclaration        #array
  | inputStatement          #input
  | outputStatement         #output
;


// angular start

angularType : AT IDENTIFIER LPAREN map RPAREN classDeclaration
              ;

map : LBRACE
      (passedParameter)*
      RBRACE;

passedParameter : (IDENTIFIER COLON)? (IDENTIFIER | NUMBER | BOOLEAN | STRING | arrayRightSide | arrowFunction) COMMA;

inputStatement  :   AT IDENTIFIER LPAREN
                    (LBRACE parameters RBRACE)?
                    RPAREN (IDENTIFIER COLON TYPE)? SEMICOLON;

outputStatement : AT IDENTIFIER LPAREN RPAREN (IDENTIFIER COLON)? variableDeclaration;

// end



classDeclaration :
       EXPORT? CLASS IDENTIFIER (EXTEND IDENTIFIER)? LBRACE (ACCESS_TYPE? declaration)* RBRACE ;

variableDeclaration
 : EXPORT? VARIABLE_TYPE? IDENTIFIER (COLON TYPE)? (EQUAL (NEW)? expression)? SEMICOLON?
  ;

functionDeclaration
  : FUNCTION? IDENTIFIER LPAREN parameters RPAREN (COLON TYPE)? block
  ;

parameters : (parameter (COMMA parameter)* COMMA?)? ;

parameter : IDENTIFIER COLON TYPE ;

ifStatement
  : IF LPAREN expression RPAREN block
    (elseIfStatement)*  // for multiple "else if" cases
    (ELSE block)?
  ;

elseIfStatement : ELSE IF LPAREN expression RPAREN block;

forStatement
    : FOR LPAREN variableDeclaration SEMICOLON expression SEMICOLON expression RPAREN block
    ;

whileStatement
    : WHILE LPAREN expression RPAREN block
    ;

doWhileStatement
    : DO block WHILE LPAREN expression RPAREN SEMICOLON
    ;



block :
    LBRACE statement* RBRACE
;

importStatement : IMPORT ( LBRACE IDENTIFIER (COMMA IDENTIFIER)* COMMA? RBRACE | TIMES) FROM  STRING SEMICOLON;

returnStatement
    : RETURN (expression | arrayRightSide) SEMICOLON
    ;


expression :
              LPAREN expression RPAREN
            | expression SEMICOLON
            | expression logicalOperations expression // Logical operations
            | expression arithmeticOperations expression // Arithmetic operations
            | expression assignmentOperation expression // Assignment operations
            | expression comparsionOperation expression // Comparison operations
            | IDENTIFIER LBRACKET expression RBRACKET // Array access
            | memberAccess (INCREMENT | DECREMENT) // Increment/Decrement
            | memberAccess // Member accesses
            | map
            | NUMBER
            | STRING
            | BOOLEAN
       ;

logicalOperations :    (AND | OR);

arithmeticOperations : (TIMES | DIVIDE | PLUS | MINUS);

assignmentOperation : (MUL_ASSIGN | DIV_ASSIGN | PLUS_EQUAL | MINUS_EQUAL | MOD_ASSIGN | EQUAL);

comparsionOperation :  (NOT_EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | EQUAL_EQUAL);

memberAccess : (THIS DOT)?
               (IDENTIFIER | functionCall)
               (DOT (functionCall | IDENTIFIER))*
               ;

arrowFunction : LPAREN parameters RPAREN (COLON TYPE)? ARROW block;

functionCall : IDENTIFIER LPAREN passedParameter* RPAREN;

arrayDeclaration
  : IDENTIFIER COLON TYPE LBRACKET RBRACKET  (EQUAL arrayRightSide)? SEMICOLON
  ;

arrayRightSide :  LBRACKET arrayElements? RBRACKET;

arrayElements
      : expression  (COMMA expression)*  // استخدم الفواصل للفصل بين العناصر
  ;

interface : INTERFACE IDENTIFIER LBRACE (parameter SEMICOLON)* RBRACE;



//================== Html
htmlDoc         : doctype?  htmlElement+ EOF;
doctype         : (FIRST_TAG | OPEN_TAG_START | OPEN_TAG_HTML)DOCTYPE;

htmlElement     :   openTag content closeTag
                  | metaTag
                  | scriptTag
                  | styleTag
                  | selfClosingTag;

metaTag         : (FIRST_TAG  | OPEN_TAG_HTML) META tagContent TAG_CLOSE ;
scriptTag       : (FIRST_TAG  | OPEN_TAG_HTML) SCRIPT
                  tagContent
                  TAG_CLOSE content (OPEN_TAG_START | OPEN_TAG_HTML) SLASH SCRIPT TAG_CLOSE;

styleTag        : (FIRST_TAG | OPEN_TAG_HTML) STYLE
                  CLOSE_TAG styleContent*  STYLE_CLOSE;

styleContent    : DOTH? CSS_TEXT* (LBRACE_CSS) cssElement* RBRACE_CSS
                ;
cssElement      : CSS_TEXT CSS_COLON (NUMBER | CSS_TEXT)+ SEMECOLON
                ;

openTag         : (FIRST_TAG | OPEN_TAG_START | OPEN_TAG_HTML) TEXT tagContent TAG_CLOSE;
closeTag        : (FIRST_TAG | OPEN_TAG_START | OPEN_TAG_HTML) SLASH TEXT TAG_CLOSE;
selfClosingTag  : (FIRST_TAG | OPEN_TAG_START | OPEN_TAG_HTML) TEXT tagContent SELF_CLOSING_TAG_CLOSE;
attribute       : TEXT EQUALH ATTRIBUTE_VALUE;
binding         : (BINDING_OPEN | OPEN_BINDING) TEXT BINDING_CLOSE;
eventBinding    : EVENT_BINDING TEXT EVENT_BINDING_CLOSE EQUALH ATTRIBUTE_VALUE;
propertyBinding : PROPRETY_BINDING TEXT PROPRETY_BINDING_CLOSE EQUALH ATTRIBUTE_VALUE;
directive       : DIRECTIVE_PREFIX TEXT (attribute)*;

tagContent      : (attribute | binding | eventBinding | propertyBinding | directive)*;
content         : (TEXT_HTML | htmlElement | comment | binding)*;
comment         : COMMENTH;
