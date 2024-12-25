lexer grammar Lexer;

// Keywords and Identifiers

IF: 'if';
ELSE: 'else';
FOR: 'for';
DO: 'do';
WHILE: 'while';
FUNCTION: 'function';
RETURN: 'return';
FOREACH: 'forEach';
ARROW: '=>';
TYPE: 'number' | 'string' | 'boolean' | 'void' | 'any';



VARIABLE_TYPE : 'var' | 'let' | 'const';

// Operators and Symbols
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDE: '/';
EQUAL: '=';
EQUAL_EQUAL: '==';
NOT_EQUAL: '!=';
GREATER: '>';
GREATER_EQUAL: '>=';
LESS: '<';
LESS_EQUAL: '<=';
INCREMENT: '++';
DECREMENT: '--';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
SEMICOLON: ';';
COMMA: ',';
COLON: ':';
DOT: '.';
IMPORT : 'import';
EXPORT: 'export';
FROM : 'from';
// Logical Operators
AND: '&&';
OR: '||';

// Identifiers and Literals
IDENTIFIER: [a-zA-Z_$][a-zA-Z0-9_$]*;
NUMBER: [0-9]+(.[0-9]+)?;
STRING: '"' (~["\r\n])* '"'; BOOLEAN: 'true' | 'false';
WHITESPACE: [ \t\r\n]+ -> skip; COMMENT: '//' ~[ \r\n]* -> skip; BLOCK_COMMENT: '/*' .*? '*/' -> skip;




CLASS: 'class' [ \t\r\n]*;
LBRACE: '{' [ \t\r\n]*;
RBRACE: '}' [ \t\r\n]*;
