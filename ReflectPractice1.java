import java.lang.reflect.Constructor;

public class ReflectPractice1 {
    public static void main(String[] args) throws Exception {
        // 获取class对象
        Class<?> c = Class.forName("Student");

        // Constructor<T> getConstructor(类<?>... parameterTypes)
        // 返回一个 Constructor对象，该对象反映 Constructor对象表示的类的指定的公共 类函数。
        Constructor<?> cos = c.getConstructor(String.class, int.class, String.class);

        // T newInstance(Object... initargs)
        // 使用此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。
        Object obj = cos.newInstance("林青霞", 18, "西安");
        System.out.println(obj);

    }
}
