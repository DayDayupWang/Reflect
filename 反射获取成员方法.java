import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 反射获取成员方法 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // 获取Class对象
        Class<?> c = Class.forName("Student");

        // 获取无参构造方法对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        // 获取方法 s.method1();
        Method m1 = c.getMethod("method1");
        m1.invoke(obj);// 调用obj对象的m1方法

        // s.method2("林青霞")；
        Method m2 = c.getMethod("method2", String.class);
        m2.invoke(obj, "林青霞");

        // String ss=s.method3("林青霞"，30)；
        Method m3 = c.getMethod("method3", String.class, int.class);
        Object result = m3.invoke(obj, "林青霞", 18);
        System.out.println(result);

        // s.function();
        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);

    }
}
