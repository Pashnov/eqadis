public class Input implements HtmlForm {

    private final String id;

    public Input(String id) {
        this.id = id;
    }

    @Override
    public String getHtmlElement() {
        return "<input id="+id+"/>\n";
    }

}
