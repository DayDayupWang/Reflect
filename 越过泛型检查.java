import java.lang.reflect.Method;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;;

public class 越过泛型检查 {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, SecurityException, IllegalAccessException {
        // 创建集合
        ArrayList<Integer> array = new ArrayList<Integer>();

        // 获取Class对象
        Class<? extends ArrayList> c = array.getClass();
        Method m = c.getDeclaredMethod("add", Object.class);

        // 添加元素
        m.invoke(array, "hello");
        m.invoke(array, "world");
        m.invoke(array, "java");

        System.out.println(array);
    }

}
