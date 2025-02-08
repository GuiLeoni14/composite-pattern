package model;

abstract public class ProductComponent {
    abstract public double getPrice();

    public void add(ProductComponent product) {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    public void remove(ProductComponent product) {
        throw new UnsupportedOperationException("Operação não suportada");
    }
}
