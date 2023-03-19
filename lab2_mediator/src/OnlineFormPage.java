import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class OnlineFormPage {

    private LocalDate date;
    private LocalTime time;
    private boolean otherReceiver = false;
    private String name = "";
    private String phone = "";
    private boolean pickUpInStore = false;
    private String deliveryAddress = "";

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public boolean isOtherReceiver() {
        return otherReceiver;
    }

    public void setOtherReceiver(boolean otherReceiver) {
        this.otherReceiver = otherReceiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isPickUpInStore() {
        return pickUpInStore;
    }

    public void setPickUpInStore(boolean pickUpInStore) {
        this.pickUpInStore = pickUpInStore;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "OnlineFormPage{" +
                "date=" + date +
                ", time=" + time +
                ", otherReceiver=" + otherReceiver +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", pickUpInStore=" + pickUpInStore +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}
