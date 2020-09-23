package ndoe04_property;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @date 2020-09-23 09:46
 **/
public class AppTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("james", 18);
        Teacher teachera = new Teacher("a");
        Teacher teacherb = new Teacher("b");
        Teacher teacherc = new Teacher("c");
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teachera);
        teachers.add(teacherc);
        teachers.add(teacherb);
        person1.setTeachers(teachers);

        Person person2 = (Person) person1.clone();
        //对象内容一样
        System.out.println("person1:" + person1);
        System.out.println("person2:" + person2);
        System.out.println("person1_hashcode" + person1.hashCode());
        System.out.println("person2_hashcode" + person2.hashCode());
        // 潜拷贝

        System.out.println("person1_hashCode:"+person1.getTeachers().hashCode());
        System.out.println("person2_hashCode:"+person2.getTeachers().hashCode());
        //person1操作list导致 person 也改变了
        person1.getTeachers().add(new Teacher("d"));
        System.out.println("person2_teacher"+person2.getTeachers());

//        try {
//            Person person3 = BeanUtils.clone(person1, Person.class);
//            System.out.println("person3:"+person3);
//            //person1操作list person3不变
//            person1.getTeachers().add(new Teacher("d"));
//            System.out.println("person3:"+person3);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
