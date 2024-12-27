parser grammar TypeParser;

options {
  tokenVocab=TypeLexer;
}

program : line+;

line :
      importStatement         #importState
    | classDeclaration        #class
    | statement               #statementt
;


statement:
    iterationStatement      #iteration
  | declaration             #declarationStatement
  | ifStatement             #if
  | returnStatement         #return
  | expression              #express
  | expressionStatement     #expressionState
  | arrayMethodCall         #arrayCall
;

iterationStatement :
      doWhileStatement        #dowhile
    | forEachStatement        #forEach
    | forStatement            #for
    | whileStatement          #while

;

declaration :
    variableDeclaration     #variable
  | functionDeclaration     #function
  | arrayDeclaration        #array
;


expressionStatement
   :
       (IDENTIFIER EQUAL expression
     | IDENTIFIER PLUS EQUAL expression
     | IDENTIFIER MINUS EQUAL expression
     | IDENTIFIER MUL_ASSIGN expression
     | IDENTIFIER DIV_ASSIGN expression
     | IDENTIFIER MOD_ASSIGN expression
     | IDENTIFIER INCREMENT  // j++
     | IDENTIFIER DECREMENT  // j--
     | IDENTIFIER (DOT IDENTIFIER)* LPAREN (expression (COMMA expression)*)? RPAREN  // function calls
     | IDENTIFIER (DOT IDENTIFIER)*  // member accesses
     | NUMBER
     | STRING
     | BOOLEAN)
     SEMICOLON

   ;


classDeclaration :
       EXPORT? CLASS IDENTIFIER LBRACE declaration* RBRACE ;

// TypeScript
variableDeclaration
 : EXPORT? VARIABLE_TYPE IDENTIFIER (COLON TYPE)? EQUAL expression SEMICOLON
  ;



functionDeclaration
  : FUNCTION IDENTIFIER LPAREN parameters RPAREN COLON TYPE block
  ;
  parameters : (parameter (COMMA parameter)* COMMA?)? ;

  parameter : IDENTIFIER COLON TYPE ;

  ifStatement
    : IF LPAREN expression RPAREN block
      (ELSE IF LPAREN expression RPAREN block)*  // for multiple "else if" cases
      (ELSE block)?
    ;

  forStatement
    : FOR LPAREN initializationExpression SEMICOLON expression SEMICOLON iterationExpression RPAREN block
    ;

  forEachStatement
    : IDENTIFIER DOT FOREACH LPAREN LPAREN IDENTIFIER RPAREN ARROW block RPAREN
    ;


block :
    LBRACE statement* RBRACE
;

importStatement : IMPORT ( LBRACE IDENTIFIER (COMMA IDENTIFIER)* COMMA? RBRACE | TIMES) FROM  IDENTIFIER SEMICOLON;

  initializationExpression
    : VARIABLE_TYPE IDENTIFIER EQUAL expression
    | IDENTIFIER EQUAL expression
    ;

  iterationExpression
    : IDENTIFIER (INCREMENT | DECREMENT | (PLUS_EQUAL NUMBER | MINUS_EQUAL NUMBER | MUL_ASSIGN NUMBER | DIV_ASSIGN NUMBER | MOD_ASSIGN NUMBER))
    ;

  whileStatement
    : WHILE LPAREN strictEqualityExpression RPAREN block
    ;

  doWhileStatement
    : DO block WHILE LPAREN strictEqualityExpression RPAREN SEMICOLON
    ;



  strictEqualityExpression
    : expression EQUAL_EQUAL expression  // Strict equality (===)
    | expression NOT_EQUAL expression  // Keep regular '!=' for now
    | expression GREATER expression
    | expression GREATER_EQUAL expression
    | expression LESS expression
    | expression LESS_EQUAL expression
    | BOOLEAN
    ;

  returnStatement
    : RETURN expression SEMICOLON
    ;

    expression
      :
        expression TIMES expression
      | expression DIVIDE expression
      | IDENTIFIER MUL_ASSIGN expression  // *=
      | IDENTIFIER DIV_ASSIGN expression  // /=
      | IDENTIFIER  LPAREN (expression (COMMA expression)*)? RPAREN  // function calls like console.log()
      | expression AND expression       // AND (&&)
      | expression OR expression
      | expression PLUS expression
      | expression MINUS expression
      | expression NOT_EQUAL expression
      | expression GREATER expression
      | expression GREATER_EQUAL expression
      | expression LESS expression
      | expression LESS_EQUAL expression
      | IDENTIFIER INCREMENT           // j++
      | IDENTIFIER DECREMENT           // j--
      | IDENTIFIER MUL_ASSIGN expression  // *=
      | IDENTIFIER MOD_ASSIGN expression  // %=
      | IDENTIFIER EQUAL expression  // =
      | IDENTIFIER PLUS_EQUAL expression  // +=
      | IDENTIFIER MINUS_EQUAL expression  // -=
      | IDENTIFIER DIV_ASSIGN expression  // /=
      | IDENTIFIER MOD_ASSIGN expression  // %=
      | IDENTIFIER PLUS expression     // Allowed for simple addition
      | IDENTIFIER MINUS expression    // Allowed for simple subtraction
      | IDENTIFIER EQUAL_EQUAL expression   // Strict equality check (==)
      | IDENTIFIER (DOT IDENTIFIER)*   // member accesses
      | IDENTIFIER LBRACKET expression RBRACKET  // array access
      | NUMBER
      | STRING
      | BOOLEAN
      ;

    arrayDeclaration
      : IDENTIFIER LBRACKET RBRACKET COLON TYPE  EQUAL LBRACKET arrayElements? RBRACKET SEMICOLON
      ;

    arrayElements
      : expression (COMMA expression)*  // استخدم الفواصل للفصل بين العناصر
      ;

    arrayMethodCall
      : IDENTIFIER DOT FOREACH LPAREN LPAREN IDENTIFIER RPAREN ARROW block RPAREN SEMICOLON
      ;
