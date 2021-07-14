package Analysis;

import java.lang.reflect.Method;

public class Analysis {

    public static void analyse(Class<?> class1) throws SecurityException {
        Method[] methods = class1.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }

}
