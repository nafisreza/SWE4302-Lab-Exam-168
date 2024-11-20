public class ToppingItem {
    private Topping topping;
    private int quantity;

    public ToppingItem(Topping topping, int quantity) {
        this.topping = topping;
        this.quantity = quantity;
    }

    public double getPrice() {
        return topping.getPrice() * quantity;
    }

    public String getDescription() {
        return String.format("%s - %d time%s: $%.2f",
                topping.getName(),
                quantity,
                quantity > 1 ? "s" : "",
                getPrice());
    }
}
