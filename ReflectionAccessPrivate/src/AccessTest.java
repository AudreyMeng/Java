import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AccessTest {
    public static void main(String[] args) {
        PrivateObject privateObject = new PrivateObject("Here is the Private Field");

        try {
            /**
             * Reflection Access Private Field by getDeclaredField & setAccessible
             */
            Field privateStringField = PrivateObject.class.
                    getDeclaredField("privateField");

            privateStringField.setAccessible(true);

            String fieldValue = (String) privateStringField.get(privateObject);
            System.out.println("The Private Field = " + fieldValue);

            /**
             * Reflection Access Private Method by getDeclaredMethod & setAccessible & invoke
             */
            Method getPrivateMethod = PrivateObject.class.
                    getDeclaredMethod("getPrivateField", null);
            getPrivateMethod.setAccessible(true);

            String returnValue = (String)
                    getPrivateMethod.invoke(privateObject, null);

            System.out.println("The Private Method gets Field = " + returnValue);
        } catch (InvocationTargetException x) {
            x.printStackTrace();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
