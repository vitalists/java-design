package node04_property;

import java.io.Serializable;
import java.util.List;

/**
 * @date 2020-09-23 09:45
 **/
public class Person implements Cloneable,Serializable {
    private String name;

    private int age;

    private List<Teacher> teachers;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teachers=" + teachers +
                '}';
    }

    public Person(String name, int age, List<Teacher> teachers) {
        this.name = name;
        this.age = age;
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
