package Ast.HTML;

public class HtmlElementNode extends Node {
    private OpenTagNode openTag;
    private ContentNode content;
    private CloseTagNode closeTag;
    private SelfClosingTagNode selfClosingTag;
    private ScriptNode scriptTag;
    private StyleNode styleTag;
    private String tagType; // This can be "script", "style", "selfClosing" or "normal"

    public HtmlElementNode(OpenTagNode openTag, ContentNode content, CloseTagNode closeTag, SelfClosingTagNode selfClosingTag, ScriptNode scriptTag, StyleNode styleTag, String tagType) {
        this.openTag = openTag;
        this.content = content;
        this.closeTag = closeTag;
        this.selfClosingTag = selfClosingTag;
        this.scriptTag = scriptTag;
        this.styleTag = styleTag;
        this.tagType = tagType;
    }

    @Override
    public String toString() {
        return "HtmlElementNode{ " +
                (openTag != null ? " openTag=" + openTag : "" )+
                (closeTag != null ? " closeTag=" + closeTag : "") +
                (content != null ? "\ncontent=" + content :"" )+
                (selfClosingTag!= null ? " selfClosingTag=" + selfClosingTag : "") +
                (scriptTag != null ? " scriptTag=" + scriptTag :"") +
                (styleTag != null ? " styleTag=" + styleTag : "") +
//                (tagType != null ? " tagType='" + tagType +'\'' : "")+
                '}';
    }
}
