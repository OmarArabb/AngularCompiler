parser grammar HtmlParser;

import TypeParser;

options {
  tokenVocab=HtmlLexer;
}

htmlContent
    : doctypeDeclaration htmlElement
  ;

doctypeDeclaration
  : DOCTYPE ;

htmlElement
  : doctypeDeclaration htmlElement
  | anchorTag
  | imgTag
  | unorderedList
  | orderedList
  | HTML_OPEN headContent bodyContent HTML_CLOSE
  | htmlComment   // السماح بالتعليقات داخل العناصر
  | angularDirectiveStatement
  ;


angularDirectiveStatement
  : NG_IF expression; // لدعم *ngIf

  htmlComment
    : HTML_COMMENT
    ;


formElement
    : FORM_OPEN formContent* FORM_CLOSE
    ;

formContent
    : inputElement
    | textareaElement
    | buttonElement
    ;

inputElement
    : INPUT_TAG
    ;

textareaElement
    : TEXTAREA_OPEN IDENTIFIER? TEXTAREA_CLOSE
    ;

buttonElement
    : BUTTON_OPEN textContent? BUTTON_CLOSE
    ;


tableElement
    : TABLE_OPEN tableRow* TABLE_CLOSE
    ;

tableRow
    : TR_OPEN (tableHeader | tableCell)* TR_CLOSE
    ;

tableHeader
    : TH_OPEN (IDENTIFIER | (WHITESPACE? NUMBER WHITESPACE?))* TH_CLOSE
    ;

tableCell
    : TD_OPEN (IDENTIFIER | (WHITESPACE? NUMBER WHITESPACE?))* TD_CLOSE
    ;


listitem
    : LISTITEM_OPEN (IDENTIFIER | (WHITESPACE? NUMBER WHITESPACE?))* LISTITEM_CLOSE
    ;



unorderedList
  :UNORDER_OPEN listitem+ UNORDER_CLOSE
  ;

// قاعدة القائمة المرتبة (Ordered List)
orderedList
  :ORDER_OPEN listitem+ ORDER_CLOSE
  ;

anchorTag
  : ANCHORTAG
  ;

imgTag
  : IMGTAG
  ;
headContent
  : HEAD_OPEN headElement* HEAD_CLOSE
  | anchorTag
  | imgTag
  ;

headElement
  : META
  | LESS META_NAME_CONTENT  GREATER  // Added rule for <meta name="viewport" content="...">
  | titleTag
  ;



titleTag
  : TITLE_OPEN textContent TITLE_CLOSE
  ;

bodyContent
  : BODY_OPEN bodyElement* BODY_CLOSE
  ;

bodyElement
  : h1Element
  | h2Element
  | h3Element
  | h4Element
  | h5Element
  | h6Element
  | pElement
  | tableElement  // إضافة دعم الجداول
  | formElement  // دعم النماذج
  | boldTextElement        // دعم النصوص الغامقة
  | italicTextElement      // دعم النصوص المائلة
  | underlineTextElement   // دعم النصوص التي تحتها خط
  | breakLineElement
  | spanElement            // دعم عناصر الـ span
  | htmlElement  // allowing nested html elements inside body
  ;


boldTextElement
    : BOLD_OPEN textContent BOLD_CLOSE COMMA*
    ;

italicTextElement
    : ITALIC_OPEN textContent ITALIC_CLOSE COMMA*
    ;

underlineTextElement
    : UNDERLINE_OPEN textContent UNDERLINE_CLOSE COMMA*
    ;

breakLineElement
    : BR_TAG
    ;

spanElement
    : SPAN_OPEN textContent SPAN_CLOSE COMMA*
    ;

textContent
    : (IDENTIFIER | WHITESPACE | DOT | COMMA)+         // النصوص داخل العناصر مع دعم المسافات
    | boldTextElement     // دعم النصوص الغامقة داخل النصوص
    | italicTextElement   // دعم النصوص المائلة داخل النصوص
    | underlineTextElement // دعم النصوص التي تحتها خط داخل النصوص
    | spanElement         // السماح بتداخل عناصر span
    | breakLineElement    // دعم السطر الجديد
    ;




h1Element
  : H1_OPEN textContent H1_CLOSE
  ;

h2Element
  : H2_OPEN textContent H2_CLOSE
  ;

h3Element
  : H3_OPEN textContent H3_CLOSE
  ;

h4Element
  : H4_OPEN textContent H4_CLOSE
  ;

h5Element
  : H5_OPEN textContent H5_CLOSE
  ;

h6Element
  : H6_OPEN textContent H6_CLOSE
  ;

pElement
  : P_OPEN textContent P_CLOSE
  ;


