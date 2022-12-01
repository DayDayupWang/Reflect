import java.lang.reflect.Constructor;

public class ReflectPractice2 {
    public static void main(String[] args) throws Exception {
        // 获取class对象
        Class<?> c = Class.forName("demo_01.Student");

        // Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
        // 返回一个 Constructor对象，该对象反映 Constructor对象表示的类或接口的指定 类函数。
        Constructor<?> con = c.getDeclaredConstructor(String.class);

        // 暴力反射
        // public void setAccessible(boolean flag):值为true,取消访问检查
        con.setAccessible(true);

        Object obj = con.newInstance("林青霞");
        System.out.println(obj);
    }

}
