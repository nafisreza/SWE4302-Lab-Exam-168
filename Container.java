public enum Container {
    PAPER_CUP(0.00, "Paper Cup"),
    WAFFLE_CONE(5.00, "Waffle Cone");

    private final double price;
    private final String name;

    Container(double price, String name) {
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
