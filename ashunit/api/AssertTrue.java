package ashunit.api;

public class AssertTrue {

    public static void assertTrue(Boolean condition, String message) {
        if(!condition){
            throw new AssertionError(message);
        }
    }
}
