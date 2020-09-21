package factory.cap1;

class OrderFood {
     void orderFood(String name) {
        BaseFood food = null;
        if ("chicken".equals(name)) {
            food = new Food2();
            food.setName("红烧鲫鱼");
        } else if ("fish".equals(name)) {
            food = new Food1();
            food.setName("老母鸡汤");
        }
        if (food != null) {
            food.foodMaterial();
            food.cookFood();
        }
    }
}