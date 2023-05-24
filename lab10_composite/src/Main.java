public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world! Composite");
        Fieldset html = new Fieldset();
        Input input1 = new Input("in1");
        Select select1 = new Select("s1");
        html.add(input1).add(select1);

        Fieldset fieldset1 = new Fieldset();
        Fieldset fieldset2 = new Fieldset();

        Input input1_1 = new Input("in1_1");
        Input input1_2 = new Input("in1_2");
        Input input1_3 = new Input("in1_3");
        Select select1_1 = new Select("s1_1");

        Input input2_1 = new Input("in2_1");
        Select select2_1 = new Select("s2_1");
        Select select2_2 = new Select("s2_2");
        Select select2_3 = new Select("s2_2");

        fieldset1.add(input1_1).add(input1_2).add(input1_3).add(select1_1);
        fieldset2.add(input2_1).add(select2_1).add(select2_2).add(select2_3);

        html.add(fieldset1).add(fieldset2);

        System.out.println(html.getHtmlElement());
    }

}