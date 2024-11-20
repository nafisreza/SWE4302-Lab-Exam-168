import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        Order order = new Order(Container.WAFFLE_CONE);

        order.addIceCream(Flavor.CHOCOLATE_FUDGE, 1);
        order.addIceCream(Flavor.MINT_CHOCOLATE_CHIP, 1);

        order.addTopping(Topping.CHOCOLATE_CHIPS, 1);
        order.addTopping(Topping.FRESH_STRAWBERRIES, 2);

        System.out.println(order.generateInvoice());

        try {
            InvoiceWriter.writeInvoice(order, "ice_cream_order");
        } catch (IOException e) {
            System.err.println("Error writing invoice: " + e.getMessage());
        }
    }
}