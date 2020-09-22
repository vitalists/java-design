package node01_simpleFactory;

public abstract class BaseFood {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void cookFood() {
        System.out.println("烹饪：" + name);
    }

    abstract void foodMaterial();
}