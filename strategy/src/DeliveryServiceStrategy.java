public class DeliveryServiceStrategy implements DeliveryStrategy {

    @Override
    public double calc(double distance, double volume) {
        return 5 + (0.1 * distance) + 2 * Math.ceil(volume);
    }

}
