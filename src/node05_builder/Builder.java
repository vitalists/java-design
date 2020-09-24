package node05_builder;

/**
 * 抽象的建造者
 */
public abstract class Builder {
    protected Product product = new Product();

    abstract Product productA();

    abstract Product productB();

    abstract Product productC();

}
