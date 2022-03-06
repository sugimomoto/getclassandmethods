package sugimomoto;

import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Class<User> user = User.class;

        System.out.println("Class Name : " + user.getName());

        Method[] methods = user.getMethods();

        for (Method method : methods) {
            System.out.println("Method Name : " + method.getName());
        }
    }
}
