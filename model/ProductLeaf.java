package model;

// Produto individual (folha)
public class ProductLeaf extends ProductComponent {
    private String name;
    private double price;

    public ProductLeaf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - R$ " + price;
    }
}
