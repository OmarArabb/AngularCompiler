parser grammar Parser;

import HtmlParser;

options {
  tokenVocab=Lexer;
}

program : statement+;

statement
  :

      classDeclaration
  | doWhileStatement
  | forEachStatement
  | variableDeclaration
  | functionDeclaration
  | ifStatement
  | forStatement
  | whileStatement
  | returnStatement
  | expressionStatement
  | arrayDeclaration
  | arrayMethodCall
;

expressionStatement
   : (IDENTIFIER EQUAL expression
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
     | BOOLEAN
     ) SEMICOLON?
   ;



// TypeScript
variableDeclaration
 : (VAR | LET | CONST) IDENTIFIER (COLON TYPE)? EQUAL expression SEMICOLON
  ;



functionDeclaration
  : FUNCTION IDENTIFIER LPAREN parameters RPAREN COLON TYPE LBRACE statement+ RBRACE
  ;
  parameters
    : (IDENTIFIER COLON TYPE (COMMA IDENTIFIER COLON TYPE)*)?
    ;

  ifStatement
    : IF LPAREN expression RPAREN LBRACE statement* RBRACE
      (ELSE IF LPAREN expression RPAREN LBRACE statement* RBRACE)*  // for multiple "else if" cases
      (ELSE LBRACE statement* RBRACE)?
    ;

  forStatement
    : FOR LPAREN initializationExpression SEMICOLON conditionExpression SEMICOLON iterationExpression RPAREN LBRACE statement+ RBRACE
    ;

  forEachStatement
    : IDENTIFIER DOT FOREACH LPAREN LPAREN IDENTIFIER RPAREN ARROW LBRACE statement+ RBRACE RPAREN
    ;


  initializationExpression
    : VARIABLE_TYPE IDENTIFIER EQUAL expression
    | IDENTIFIER EQUAL expression
    ;

  conditionExpression
    : expression
    ;

  iterationExpression
    : IDENTIFIER (INCREMENT | DECREMENT | (PLUS EQUAL NUMBER | MINUS EQUAL NUMBER | MUL_ASSIGN NUMBER | DIV_ASSIGN NUMBER | MOD_ASSIGN NUMBER))
    ;

  whileStatement
    : WHILE LPAREN strictEqualityExpression RPAREN LBRACE statement+ RBRACE
    ;

  doWhileStatement
    : DO LBRACE statement+ RBRACE WHILE LPAREN strictEqualityExpression RPAREN SEMICOLON
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
      : IDENTIFIER (DOT IDENTIFIER)*   // member accesses
      | IDENTIFIER LBRACKET expression RBRACKET  // array access
      | IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN  // function calls like console.log()
      | IDENTIFIER INCREMENT           // j++
      | IDENTIFIER DECREMENT           // j--
      | IDENTIFIER MUL_ASSIGN expression  // *=
      | IDENTIFIER DIV_ASSIGN expression  // /=
      | IDENTIFIER MOD_ASSIGN expression  // %=
      | IDENTIFIER EQUAL expression  // =
      | IDENTIFIER PLUS EQUAL expression  // +=
      | IDENTIFIER MINUS EQUAL expression  // -=
      | IDENTIFIER MUL_ASSIGN expression  // *=
      | IDENTIFIER DIV_ASSIGN expression  // /=
      | IDENTIFIER MOD_ASSIGN expression  // %=
      | IDENTIFIER PLUS expression     // Allowed for simple addition
      | IDENTIFIER MINUS expression    // Allowed for simple subtraction
      | IDENTIFIER EQUAL_EQUAL expression   // Strict equality check (==)
      | NUMBER
      | STRING
      | BOOLEAN
      | expression TIMES expression
      | expression DIVIDE expression
      | expression AND expression       // AND (&&)
      | expression OR expression
      | expression PLUS expression
      | expression MINUS expression
      | expression NOT_EQUAL expression
      | expression GREATER expression
      | expression GREATER_EQUAL expression
      | expression LESS expression
      | expression LESS_EQUAL expression
      ;

    arrayDeclaration
      : VARIABLE_TYPE IDENTIFIER LBRACKET RBRACKET COLON TYPE  EQUAL LBRACKET arrayElements? RBRACKET SEMICOLON
      ;

    arrayElements
      : expression (COMMA expression)*  // استخدم الفواصل للفصل بين العناصر
      ;

    arrayMethodCall
      : IDENTIFIER DOT FOREACH LPAREN LPAREN IDENTIFIER RPAREN ARROW LBRACE statement+ RBRACE RPAREN SEMICOLON
      ;


  classDeclaration : CLASS IDENTIFIER LBRACE classBody* RBRACE ;
  classBody :
  functionDeclaration #functionDeclaratin
  | variableDeclaration #variableDeclartion
  ;


