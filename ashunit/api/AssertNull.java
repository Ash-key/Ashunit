package ashunit.api;

public class AssertNull {
    public static void assertNull(Object actual, String message) {
        if (actual!=null){
            throw new AssertionError(message);
        }
    };

}
