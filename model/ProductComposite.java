package model;

import java.util.ArrayList;
import java.util.List;

// Composto: pode conter vários produtos (folhas ou compostos)
public class ProductComposite extends ProductComponent {
    private List<ProductComponent> components = new ArrayList<>();

    @Override
    public void add(ProductComponent product) {
        components.add(product);
    }

    @Override
    public void remove(ProductComponent product) {
        components.remove(product);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (ProductComponent component : components) {
            total += component.getPrice(); // Chamada recursiva
        }
        return total;
    }
}
