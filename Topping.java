public enum Topping {
    SPRINKLES(0.30, "Sprinkles"),
    MARSHMALLOW(0.70, "Marshmallow"),
    CRUSHED_OREO(0.85, "Crushed Oreo"),
    FRESH_STRAWBERRIES(1.00, "Fresh Strawberries"),
    CHOCOLATE_CHIPS(0.50, "Chocolate Chips");

    private final double price;
    private final String name;

    Topping(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}