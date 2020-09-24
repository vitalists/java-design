package node05_builder;

/**
 * @date 2020-09-24 17:51
 **/
public class BuilderManager {
    private Builder builder;

    BuilderManager(Builder builder) {
        this.builder = builder;
    }

    public Product getResult() {
        builder.productA();
        builder.productB();
        builder.productC();
        return builder.productC();
    }
}
