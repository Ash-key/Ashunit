package ashunit.api;

public class AssertNotEquals {
    static public void assertNotEquals(byte expected, byte actual) {
        if (expected != actual) {
            throw new AssertionError("the Expectations are consist whith the reality");
        }
    }

    static public void assertNotEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("the Expectations are consist whith the reality");
        }
    }

    static public void assertNotEquals(long expected, long actual) {
        if (expected != actual) {
            throw new AssertionError("the Expectations are consist whith the reality");
        }
    }

    static public void assertNotEquals(double expected, double actual) {
        if (expected == actual) {
            throw new AssertionError("the Expectations are consistent whith the reality");
        }
    }



}
