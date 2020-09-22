package node03_abstracyFactory;

/**
 * 抽象工厂：农场
 * 农场可以生产多个产品族
 * 可以生产 动物 蔬菜
 */
public interface FarmFactory {

    Animal createAnimal();

    Plant createPlant();
}
