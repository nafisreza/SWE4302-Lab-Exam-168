import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> iceCreamItems;
    private List<ToppingItem> toppingItems;
    private Container container;
    private static final double TAX_RATE = 0.08;

    public Order(Container container) {
        this.container = container;
        this.iceCreamItems = new ArrayList<>();
        this.toppingItems = new ArrayList<>();
    }

    public void addIceCream(Flavor flavor, int scoops) {
        iceCreamItems.add(new OrderItem(flavor, scoops));
    }

    public void addTopping(Topping topping, int quantity) {
        toppingItems.add(new ToppingItem(topping, quantity));
    }

    public double getSubtotal() {
        double subtotal = container.getPrice();
        for (OrderItem item : iceCreamItems) {
            subtotal += item.getPrice();
        }
        for (ToppingItem item : toppingItems) {
            subtotal += item.getPrice();
        }

        return subtotal;
    }

    public double getTax() {
        return getSubtotal() * TAX_RATE;
    }

    public double getTotal() {
        return getSubtotal() + getTax();
    }

    public String generateInvoice() {
        StringBuilder invoice = new StringBuilder();
        invoice.append("Ice Cream Shop Invoice\n");

        if (container == Container.WAFFLE_CONE) {
            invoice.append(String.format("%s: $%.2f\n", container.getName(), container.getPrice()));
        }

        for (OrderItem item : iceCreamItems) {
            invoice.append(item.getDescription()).append("\n");
        }

        for (ToppingItem item : toppingItems) {
            invoice.append(item.getDescription()).append("\n");
        }

        invoice.append(String.format("\nSubtotal: $%.2f", getSubtotal()));
        invoice.append(String.format("\nTax (8%%): $%.2f", getTax()));
        invoice.append(String.format("\nTotal Amount Due: $%.2f", getTotal()));

        return invoice.toString();
    }
}


