parser grammar AngularParser;

options { tokenVocab=AngularLexer; }

// Root rule
program
 : statement* EOF ;


// Statement rule
statement
    : variableDeclaration
    | expressionStatement
    ;

// Variable declaration rule
variableDeclaration
    : (LET | CONST | VAR) IDENTIFIER (COLON type)? ASSIGN expression SEMICOLON
    ;

// Type rule
type
    : NUMBER_TYPE
    | STRING_TYPE
    | BOOLEAN_TYPE
    ;

// Expression statement rule
expressionStatement
    : expression SEMICOLON
    ;

// Expression rule
expression
    : primary
    | expression (PLUS | MINUS | MULT | DIV) expression
    ;

// Primary rule
primary
    : IDENTIFIER
    | NUMBER
    | STRING_LITERAL
    | LPAREN expression RPAREN
    ;
