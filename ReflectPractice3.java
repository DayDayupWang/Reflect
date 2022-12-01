import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectPractice3 {
    public static void main(String[] args) throws Exception {
        // 获取Class对象
        Class<?> c = Class.forName("Student");

        // 获取无参构造方法对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        // 获取成员变量name
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);

        name.set(obj, "林青霞");
        System.out.println(obj);

        // 获取成员变量age
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(obj, 30);
        System.out.println(obj);

        // 获取成员变量address
        Field address = c.getDeclaredField("address");
        address.setAccessible(true);
        // 给obj的成员变量addressField赋值为西安
        address.set(obj, "西安");
        System.out.println(obj);

    }
}
