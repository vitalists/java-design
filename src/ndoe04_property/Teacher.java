package ndoe04_property;

import java.io.Serializable;

/**
 * @date 2020-09-23 09:50
 **/
public class Teacher implements Serializable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {
    }
}
