package ashunit.api;

public class AssertFalse {
    public static void assertFalse(Boolean condition, String message) {
        if(condition){
            throw new AssertionError(message);
        }

    }
}
