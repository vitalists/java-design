package node03_abstracyFactory;

/**
 * 具体工厂：上海农场 可以生产 植物（土豆） 肉（牛、羊）
 * @date 2020-09-22 11:27
 **/
public class ShFarmFactory implements FarmFactory {
    @Override
    public Animal createAnimal() {
        return new Cow();
    }

    @Override
    public Plant createPlant() {
        return new Potato();
    }

}
