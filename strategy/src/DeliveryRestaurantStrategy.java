public class DeliveryRestaurantStrategy implements DeliveryStrategy {

    @Override
    public double calc(double distance, double volume) {
        return (0.2 * distance) + 2 * Math.ceil(volume);
    }

}
