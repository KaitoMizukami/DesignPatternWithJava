package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Hiroshi");
        Product card2 = factory.create("Kaito");
        Product card3 = factory.create("Masaki");

        card1.use();
        card2.use();
        card3.use();
    }
}
