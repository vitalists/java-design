package node05_builder;

/**
 * 复杂的产品
 * @date 2020-09-24 17:21
 **/
public class Product {

    private String parA;

    private String partB;

    private String partC;

    public String getParA() {
        return parA;
    }

    public void setParA(String parA) {
        this.parA = parA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "parA='" + parA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }
}
