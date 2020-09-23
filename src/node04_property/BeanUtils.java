package node04_property;

import java.io.*;

/**
 * @date 2020-09-23 10:10
 **/
public class BeanUtils {
    public static <T> T clone(Object source, Class<T> target) throws IOException, ClassNotFoundException {
        // 将对象读到流里面去
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new  ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(source);
        // 对象读出来
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        T readObject = (T) objectInputStream.readObject();
        return readObject;
    }
}
