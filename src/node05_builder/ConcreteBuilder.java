package node05_builder;

/**
 * @date 2020-09-24 17:48
 **/
public class ConcreteBuilder extends Builder {
    @Override
    Product productA() {
        product.setParA("A");
        return product;
    }

    @Override
    Product productB() {
        product.setPartB("B");
        return product;
    }

    @Override
    Product productC() {
        product.setPartC("C");
        return product;
    }
}
