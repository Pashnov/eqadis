public class Select implements HtmlForm {

    private final String id;

    public Select(String id) {
        this.id = id;
    }

    @Override
    public String getHtmlElement() {
        return "<select id="+id+"></select>\n";
    }

}
