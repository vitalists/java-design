package node03_abstracyFactory;

/**
 * 具体工厂可以生产多种产品蔬菜（芹菜） 和肉类（鸡肉）
 * @date 2020-09-22 11:25
 **/
public class JsFarmFactory implements FarmFactory {
    @Override
    public Animal createAnimal() {
        return new Chicken();
    }

    @Override
    public Plant createPlant() {
        return new Celery();
    }
}
