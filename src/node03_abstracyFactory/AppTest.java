package node03_abstracyFactory;

/**
 * @date 2020-09-22 13:29
 **/
public class AppTest {
    public static void main(String[] args) {
        //江苏农场 生产 的产品
        FarmFactory jsfarm = new JsFarmFactory();
        Animal jsfarmAnimal = jsfarm.createAnimal();
        Plant jsfarmPlant = jsfarm.createPlant();
        jsfarmAnimal.show();
        jsfarmPlant.show();
        //上海农场生产的产品
        FarmFactory shFarmFactory = new ShFarmFactory();
        Plant shPlant = shFarmFactory.createPlant();
        Animal shAnimal = shFarmFactory.createAnimal();
        shPlant.show();
        shAnimal.show();
    }
}
