package view;

import model.*;

public class Main {
    public static void main(String[] args) {
        // Produtos individuais
        ProductComponent item1 = new ProductLeaf("Mouse", 50.0);
        ProductComponent item2 = new ProductLeaf("Teclado", 100.0);
        ProductComponent item3 = new ProductLeaf("Monitor", 500.0);

        // Pacote de periféricos
        ProductComposite peripherals = new ProductComposite();
        peripherals.add(item1);
        peripherals.add(item2);

        // Pacote de setup completo
        ProductComposite setup = new ProductComposite();
        setup.add(peripherals);
        setup.add(item3);

        // Testando os preços
        System.out.println("Preço do mouse: R$ " + item1.getPrice());
        System.out.println("Preço do teclado: R$ " + item2.getPrice());
        System.out.println("Preço dos periféricos: R$ " + peripherals.getPrice());
        System.out.println("Preço do monitor: R$ " + item3.getPrice());
        System.out.println("Preço do setup completo: R$ " + setup.getPrice());
    }
}
