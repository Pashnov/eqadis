import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public abstract class BaseComponent {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void click() {
        mediator.notify(this, "click");
    }

    public void show() {
        mediator.notify(this, "show");
    }

    public void hide() {
        mediator.notify(this, "hide");
    }

    public void highlight() {
        mediator.notify(this, "highlight");
    }

}

class DateFieldComponent extends BaseComponent {

    public void setDate(LocalDate ld) {
        mediator.notify(this, ld.toString());
    }

}

class TimeFieldComponent extends BaseComponent {

    private List<LocalTime> times;
    private int index;

    @Override
    public void click() {
        mediator.notify(this, index+"");
    }

    @Override
    public void show() {
        System.out.println("next times available");
        for (int i = 0; i < times.size(); i++) {
            System.out.println("   " + (i) + " - " +times.get(i));
        }
    }

    public void setTimes(List<LocalTime> times) {
        this.times = times;
    }

    public List<LocalTime> getTimes() {
        return times;
    }

    public void setIndex(int index) {
        this.index = index;
        mediator.notify(this, index+"");
    }
}

class CheckboxOtherReceiverComponent extends BaseComponent {

    private boolean status = false;

    @Override
    public void click() {
        status = !status;
        mediator.notify(this, !status+"");
    }

}

class NameComponent extends BaseComponent {

    private String name;

    @Override
    public void click() {
        mediator.notify(this, name);
    }

    public void setName(String name) {
        this.name = name;
        mediator.notify(this, name);
    }

}

class PhoneComponent extends BaseComponent {

    private String phone;

    @Override
    public void click() {
        mediator.notify(this, phone);
    }

    public void setPhone(String phone) {
        this.phone = phone;
        mediator.notify(this, phone);
    }
}

class PickUpInStoreComponent extends BaseComponent {

    private boolean status = false;

    @Override
    public void click() {
        status = !status;
        mediator.notify(this, !status+"");
    }

}

class DeliveryAddressComponent extends BaseComponent {

    private String address;

    @Override
    public void click() {
        mediator.notify(this, address);
    }

    public void setAddress(String address) {
        this.address = address;
        mediator.notify(this, address);
    }

}