import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fieldset implements HtmlForm {

    private List<HtmlForm> items = new ArrayList<>();

    public Fieldset add(HtmlForm item) {
        items.add(item);
        return this;
    }

    public void remove(HtmlForm item) {
        items.remove(item);
    }

    public List<HtmlForm> getItems() {
        return new ArrayList<>(items);
    }

    @Override
    public String getHtmlElement() {
        String content =  items.stream()
                            .map(HtmlForm::getHtmlElement)
                            .collect(Collectors.joining("\n"));

        return "<fieldset>\n" + content + "</fieldset>\n\n";
    }

}
