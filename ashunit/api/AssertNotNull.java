package ashunit.api;

public class AssertNotNull {


    public static void assertNotNull(Object actual, String message) {
        if (actual==null){
            throw new AssertionError(message.toString());
        }
    }
}
