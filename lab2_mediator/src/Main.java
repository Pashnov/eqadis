import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world! Starting....");
        OnlineFormPage onlineFormPage = new OnlineFormPage();

        DateFieldComponent dateFieldComponent = new DateFieldComponent();
        TimeFieldComponent timeFieldComponent = new TimeFieldComponent();
        CheckboxOtherReceiverComponent checkboxOtherReceiverComponent = new CheckboxOtherReceiverComponent();
        NameComponent nameComponent = new NameComponent();
        PhoneComponent phoneComponent = new PhoneComponent();
        PickUpInStoreComponent pickUpInStoreComponent = new PickUpInStoreComponent();
        DeliveryAddressComponent deliveryAddressComponent = new DeliveryAddressComponent();

        OnlineFormMediator mediator = new OnlineFormMediator(onlineFormPage, dateFieldComponent, timeFieldComponent,
                checkboxOtherReceiverComponent, nameComponent, phoneComponent, pickUpInStoreComponent, deliveryAddressComponent);

        System.out.println("Click date field");
        dateFieldComponent.setDate(LocalDate.now());

        System.out.println("Click time field");
        timeFieldComponent.setIndex(1);
        System.out.println("page: " + onlineFormPage);

        System.out.println("Click checkbox other receiver field");
        checkboxOtherReceiverComponent.click();
        System.out.println("page: " + onlineFormPage);
        System.out.println("Click checkbox other receiver field");
        checkboxOtherReceiverComponent.click();
        System.out.println("page: " + onlineFormPage);


        System.out.println("Click name field");
        nameComponent.setName("name");

        System.out.println("Click phone field");
        phoneComponent.setPhone("phone");
        System.out.println("page: " + onlineFormPage);

        System.out.println("Click puis field");
        pickUpInStoreComponent.click();
        System.out.println("Click puis field");
        pickUpInStoreComponent.click();
        System.out.println("page: " + onlineFormPage);

        System.out.println("Click delivery address field");
        deliveryAddressComponent.setAddress("address");
        System.out.println("page: " + onlineFormPage);



    }

}