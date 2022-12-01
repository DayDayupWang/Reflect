
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 运行配置文件运行类中方法
 */
public class 运行配置文件运行类中方法 {

    public static void main(String[] args)
            throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("class.txt");
        prop.load(fr);
        fr.close();
        // 得到配置文件中的property键值对
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");
        // 通过反射来使用
        Class<?> c = Class.forName(className);

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method m = c.getMethod(methodName);
        m.invoke(obj);
    }
}