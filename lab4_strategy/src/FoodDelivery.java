import java.util.Objects;

public class FoodDelivery {

    private DeliveryStrategy strategy = new DeliveryServiceStrategy();
    private double distanceDelivery;
    private double foodVolume;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        FoodDelivery foodDelivery = new FoodDelivery();
        // add some item foods
        foodDelivery.setFoodVolume(1.35);
        foodDelivery.setDistanceDelivery(3.3);
        System.out.println("Default(service) delivery: " + foodDelivery.calculateDeliveryPrice());
        foodDelivery.setStrategy(new PickupStrategy());
        System.out.println("pick delivery: " + foodDelivery.calculateDeliveryPrice());
        foodDelivery.setStrategy(new DeliveryRestaurantStrategy());
        System.out.println("restaurant delivery: " + foodDelivery.calculateDeliveryPrice());

    }

    public double calculateDeliveryPrice() {
        return strategy.calc(distanceDelivery, foodVolume);
    }

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void setDistanceDelivery(double distanceDelivery) {
        this.distanceDelivery = distanceDelivery;
    }

    public void setFoodVolume(double foodVolume) {
        this.foodVolume = foodVolume;
    }
}