lexer grammar ProgramLexer;

IF: 'if';
ELSE: 'else';
FOR: 'for';
DO: 'do';
WHILE: 'while';
FUNCTION: 'function';
RETURN: 'return';
TYPE: 'number' | 'string' | 'boolean' | 'void' | 'any';
VARIABLE_TYPE : 'var' | 'let' | 'const';
ACCESS_TYPE : 'public' | 'private' | 'protected';
NEW : 'new';
IMPORT : 'import';
EXPORT: 'export';

FROM : 'from';
THIS:'this';
CLASS: 'class' [ \t\r\n]*;
BOOLEAN: 'true' | 'false';
INTERFACE : 'interface';
EXTEND : 'extends';
IMPLEMENT : 'implement';


AT : '@';


// Operators and Symbols
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDE: '/';
EQUAL: '=';

GREATER: '>';
GREATER_EQUAL: '>=';
LESS     :'< ';
FIRST_TAG: '<' -> pushMode(HTML);
LESS_EQUAL: '<=';
INCREMENT: '++';
DECREMENT: '--';
PLUS_EQUAL : '+=';
MINUS_EQUAL : '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
LBRACE: '{' [ \t\r\n]*;
RBRACE: '}' [ \t\r\n]*;
SEMICOLON: ';';
COMMA: ',';
COLON: ':';
DOT: '.';
ARROW: '=>';



// Logical Operators
AND: '&&';
OR: '||';
EQUAL_EQUAL: '==';
NOT_EQUAL: '!=';

// Identifiers and Literals
IDENTIFIER: [*a-zA-Z_$][.a-zA-Z0-9_$]*;
NUMBER: [0-9]+;
STRING: '"' (~["\r\n])* '"' | '\'' (~["\r\n])* '\'' | '`' (~["\r\n])* '`' ;
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[ \r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;



fragment ESC : '\\'[nt"];

mode HTML;
// الرموز الأخرى
DOCTYPE                 : '!DOCTYPE html>';
META                    : 'meta ';
SCRIPT                  : 'script';
STYLE                   : 'style' -> pushMode(CSS_MODE);


OPEN_TAG_START          : '<';
SLASH                   : '/';
TAG_CLOSE               : '>' -> pushMode(HTML_TEXT_MODE);
SELF_CLOSING_TAG_CLOSE  : '/>' -> popMode;
ATTRIBUTE_VALUE         : '"' (~["\r\n])* '"';
BINDING_OPEN            : '{{';
BINDING_CLOSE           : '}}' -> pushMode(HTML_TEXT_MODE);
EVENT_BINDING           : '(';
EVENT_BINDING_CLOSE     : ')';
PROPRETY_BINDING        : '[';
PROPRETY_BINDING_CLOSE  : ']';
DIRECTIVE_PREFIX        : '#';
TEXT                    : [#*+a-zA-Z0-9\-!.,:]+ ;
COMMENTH                : '<!--' .*? '-->' ->skip;
EQUALH                  :'=';
WS                      : [ \n\t\r]+ -> skip;


mode HTML_TEXT_MODE;
TEXT_HTML               : (ESC| ~[<>{}])+ ;
OPEN_TAG_HTML           : '<' -> popMode;
OPEN_BINDING            : '{{' -> popMode;


mode CSS_MODE;
CLOSE_TAG               : '>';
CSS_TEXT                : [-#,a-zA-Z0-9]+;
CSS_COLON               : ':';
DOTH                    : '.';
LBRACE_CSS              : '{';
RBRACE_CSS              : '}';
STYLE_CLOSE             : '</style>'->popMode;
SEMECOLON               : ';';
WS_CSS                  : [ \n\t\r]+ -> skip;
