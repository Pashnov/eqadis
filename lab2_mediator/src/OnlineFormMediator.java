import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class OnlineFormMediator implements Mediator {

    private OnlineFormPage onlineFormPage;
    private BaseComponent dateField;
    private BaseComponent timeField;
    private BaseComponent checkboxOtherReceiver;
    private BaseComponent name;
    private BaseComponent phone;
    private BaseComponent pickUpInStore;
    private BaseComponent deliveryAddress;

    public OnlineFormMediator(OnlineFormPage onlineFormPage, BaseComponent dateField, BaseComponent timeField, BaseComponent checkboxOtherReceiver, BaseComponent name, BaseComponent phone, BaseComponent pickUpInStore, BaseComponent deliveryAddress) {
        this.onlineFormPage = onlineFormPage;
        this.dateField = dateField;
        this.timeField = timeField;
        this.checkboxOtherReceiver = checkboxOtherReceiver;
        this.name = name;
        this.phone = phone;
        this.pickUpInStore = pickUpInStore;
        this.deliveryAddress = deliveryAddress;
        dateField.setMediator(this);
        timeField.setMediator(this);
        checkboxOtherReceiver.setMediator(this);
        name.setMediator(this);
        phone.setMediator(this);
        pickUpInStore.setMediator(this);
        deliveryAddress.setMediator(this);
    }

    @Override
    public void notify(BaseComponent sender, String event) {
        System.out.println(sender.getClass() + " sent " + event);
        if ("highlight".equals(event) || "show".equals(event)) {
            return;
        }

        if (sender instanceof DateFieldComponent) {
            onlineFormPage.setDate(LocalDate.parse(event));
            // check available times
            List<LocalTime> times = Arrays.asList(LocalTime.MIDNIGHT, LocalTime.of(10, 30));
            ((TimeFieldComponent)timeField).setTimes(times);
            timeField.show();
            timeField.highlight();
        } else if (sender instanceof TimeFieldComponent) {
            LocalTime localTime = ((TimeFieldComponent) timeField).getTimes().get(Integer.valueOf(event));
            onlineFormPage.setTime(localTime);
            checkboxOtherReceiver.highlight();
        } else if (sender instanceof CheckboxOtherReceiverComponent) {
            onlineFormPage.setOtherReceiver(Boolean.valueOf(event));
            if (onlineFormPage.isOtherReceiver()) {
                name.show();
                phone.show();
                name.highlight();
            } else {
                name.hide();
                phone.hide();
                onlineFormPage.setName("");
                onlineFormPage.setPhone("");
            }
        } else if (sender instanceof NameComponent) {
            onlineFormPage.setName(event);
            phone.highlight();
        } else if (sender instanceof PhoneComponent) {
            onlineFormPage.setPhone(event);
            pickUpInStore.highlight();
        } else if (sender instanceof PickUpInStoreComponent) {
            onlineFormPage.setPickUpInStore(Boolean.valueOf(event));
            if (onlineFormPage.isPickUpInStore()) {
                deliveryAddress.hide();
                onlineFormPage.setDeliveryAddress("");
            } else {
                deliveryAddress.show();
                deliveryAddress.highlight();
            }
        } else if (sender instanceof DeliveryAddressComponent) {
            onlineFormPage.setDeliveryAddress(event);
        }
    }

}
