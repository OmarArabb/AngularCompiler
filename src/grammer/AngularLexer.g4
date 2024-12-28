lexer grammar AngularLexer;

// Keywords
LET: 'let';
CONST: 'const';
VAR: 'var';

// Data types
NUMBER_TYPE: 'number';
STRING_TYPE: 'string';
BOOLEAN_TYPE: 'boolean';

// Identifiers
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

// Literals
NUMBER: [0-9]+;
STRING_LITERAL: '"' (~["\\] | '\\' .)* '"'
              | '\'' (~['\\] | '\\' .)* '\'' ;

// Operators and Symbols
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
ASSIGN: '=';
LT: '<';
GT: '>';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
COLON: ':';
COMMA: ',';
DOT: '.';
ARROW: '->';

// Whitespace and Comments
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
