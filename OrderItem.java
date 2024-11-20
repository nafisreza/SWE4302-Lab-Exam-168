public class OrderItem {
    private Flavor flavor;
    private int scoops;

    public OrderItem(Flavor flavor, int scoops) {
        this.flavor = flavor;
        this.scoops = scoops;
    }

    public double getPrice() {
        return flavor.getPrice() * scoops;
    }

    public String getDescription() {
        return String.format("%s - %d scoop%s: $%.2f",
                flavor.getName(),
                scoops,
                scoops > 1 ? "s" : "",
                getPrice());
    }
}
