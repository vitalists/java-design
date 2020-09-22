package node01_simpleFactory;

/**
 * @description
 * @date 2020-09-21 14:20
 **/
public class TestApp {
    public static void main(String[] args) {
        OrderFood orderFood = new OrderFood();
        orderFood.orderFood("fish");
        System.out.println("-----------------");
        orderFood.orderFood("chicken");
    }
}
