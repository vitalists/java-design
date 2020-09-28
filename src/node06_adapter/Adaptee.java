package node06_adapter;

/**
 * @date 2020-09-28 09:31
 **/
public class Adaptee {
    public int hight() {
        return 220;
    }
}

interface Adapter{
    public int low();
}

class low extends Adaptee implements Adapter{

    @Override
    public int low() {
        return hight() / 4;
    }
}
