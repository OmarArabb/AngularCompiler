lexer grammar HtmlLexer;

import TypeLexer;

DOCTYPE: '<!DOCTYPE' [ \t\r\n]* 'html' '>';

HTML_OPEN: '<html' [ \t\r\n]* 'lang' '=' '"' 'ar' '"' [ \t\r\n]* '>' -> pushMode(HTML_MODE);

mode HTML_MODE;

HEAD_OPEN: '<head' [ \t\r\n]* '>';
HEAD_CLOSE: '</head>' ;
BODY_OPEN: '<body' [ \t\r\n]* '>';
BODY_CLOSE: '</body>' ;

META_NAME_CONTENT: 'meta' [ \t\r\n]* 'name' '=' ATTRIBUTE_VALUE [ \t\r\n]* 'content' '=' ATTRIBUTE_VALUE [ \t\r\n]* ;
META: '<meta' [ \t\r\n]* 'charset' '=' '"' 'UTF-8' '"' [ \t\r\n]* '>';

// Title Tags
TITLE_OPEN: '<title' [ \t\r\n]* '>';
TITLE_CLOSE: '</title>' ;
ATTRIBUTE_VALUE: '"' (~[\r\n])* '"';

// Headers
H1_OPEN: '<h1' [ \t\r\n]* '>';
H1_CLOSE: '</h1>' ;
H2_OPEN: '<h2' [ \t\r\n]* '>';
H2_CLOSE: '</h2>' ;
H3_OPEN: '<h3' [ \t\r\n]* '>';
H3_CLOSE: '</h3>' ;
H4_OPEN: '<h4' [ \t\r\n]* '>';
H4_CLOSE: '</h4>' ;
H5_OPEN: '<h5' [ \t\r\n]* '>';
H5_CLOSE: '</h5>' ;
H6_OPEN: '<h6' [ \t\r\n]* '>';
H6_CLOSE: '</h6>' ;

P_OPEN: '<p' [ \t\r\n]* '>';
P_CLOSE: '</p>' ;
SPAN_OPEN: '<span' [ \t\r\n]* '>';
SPAN_CLOSE: '</span>' ;

// Formatting Tags
BOLD_OPEN: ('<b' [ \t\r\n]* '>' | '<strong' [ \t\r\n]* '>');
BOLD_CLOSE: ('</b>' | '</strong>') ;
ITALIC_OPEN: ('<i' [ \t\r\n]* '>' | '<em' [ \t\r\n]* '>');
ITALIC_CLOSE: ('</i>' | '</em>') ;
UNDERLINE_OPEN: '<u' [ \t\r\n]* '>';
UNDERLINE_CLOSE: '</u>' ;
BR_TAG: '<br' [ \t\r\n]* '>' ;

IMGTAG: '<img' [ \t\r\n]* 'src' '=' ATTRIBUTE_VALUE [ \t\r\n]* 'alt' '=' ATTRIBUTE_VALUE '>';
ANCHORTAG: '<a' [ \t\r\n]* 'href' '=' ATTRIBUTE_VALUE '>' [ \t\r\n]* IDENTIFIER [ \t\r\n]* '</a>';

// Lists
UNORDER_OPEN: '<ul'[ \t\r\n]*'>';
UNORDER_CLOSE: '</ul>' ;
ORDER_OPEN: '<ol'[ \t\r\n]*'>';
ORDER_CLOSE: '</ol>' ;
LISTITEM_OPEN: '<li' [ \t\r\n]* '>';
LISTITEM_CLOSE: '</li>' ;

// Tables
TABLE_OPEN: '<table' [ \t\r\n]* '>';
TABLE_CLOSE: '</table>' ;
TR_OPEN: '<tr' [ \t\r\n]* '>';
TR_CLOSE: '</tr>' ;
TH_OPEN: '<th' [ \t\r\n]* '>';
TH_CLOSE: '</th>' ;
TD_OPEN: '<td' [ \t\r\n]* '>';
TD_CLOSE: '</td>' ;

// Forms
FORM_OPEN: '<form' [ \t\r\n]* 'action' '=' ATTRIBUTE_VALUE [ \t\r\n]* 'method' '=' ('"get"' | '"post"') [ \t\r\n]* '>';
FORM_CLOSE: '</form>' ;
INPUT_TAG: '<input' [ \t\r\n]* 'type' '=' ('"text"' | '"password"' | '"email"' | '"number"' | '"submit"') [ \t\r\n]* 'name' '=' ATTRIBUTE_VALUE '>';

TEXTAREA_OPEN : '<textarea' [ \t\r\n]* 'name' '=' ATTRIBUTE_VALUE [ \t\r\n]* '>';
TEXTAREA_CLOSE: '</textarea>';
BUTTON_OPEN   : '<button' [ \t\r\n]* 'type' '=' ('"submit"' | '"button"' | '"reset"') [ \t\r\n]* '>';
BUTTON_CLOSE  : '</button>';


INTERPOLATION: '\\{\\{.*?\\}\\}' ;
NG_IF: '*ngIf' ;

// Comments and Whitespace

HTML_COMMENT: '<!--' ~[\r\n]* '-->' ->skip;
HTML_CLOSE: '</html>' -> popMode;