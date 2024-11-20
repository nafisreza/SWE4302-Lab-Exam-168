public enum Flavor {
    MINT_CHOCOLATE_CHIP(2.80, "Mint Chocolate Chip"),
    CHOCOLATE_FUDGE(3.00, "Chocolate Fudge"),
    STRAWBERRY_SWIRL(2.75, "Strawberry Swirl"),
    PISTACHIO_DELIGHT(3.25, "Pistachio Delight");

    private final double price;
    private final String name;

    Flavor(double price, String name) {
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
