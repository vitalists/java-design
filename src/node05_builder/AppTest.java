package node05_builder;

/**
 * @date 2020-09-24 19:29
 **/
public class AppTest {
    public static void main(String[] args) {
        BuilderManager builderManager = new BuilderManager(new ConcreteBuilder());
        Product result = builderManager.getResult();
        System.out.println(result);
    }
}
