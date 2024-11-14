package ashunit.api;

//断言库，包含所有的断言功能
public class Assertions {

    //assertEquals
    public static void assertEquals(byte expected, byte actual) { AssertEquals.assertEquals(expected,actual);};
    public static void assertEquals(int expected, int actual){ AssertEquals.assertEquals(expected,actual);};
    public static void assertEquals(long expected, long actual){ AssertEquals.assertEquals(expected,actual);};
    public static void assertEquals(double expected, double actual){ AssertEquals.assertEquals(expected,actual);};


    //assertNotEquals
    public static void assertNotEquals(byte expected, byte actual){ AssertNotEquals.assertNotEquals(expected,actual);};
    public static void assertNotEquals(int expected, int actual){ AssertNotEquals.assertNotEquals(expected,actual);};
    public static void assertNotEquals(long expected, long actual){ AssertNotEquals.assertNotEquals(expected,actual);};
    public static void assertNotEquals(double expected, double actual){ AssertNotEquals.assertNotEquals(expected,actual);};


    //assertArrayEquals
    public static void assertArrayEquals(int[] expected, int[] actual){ AssertArrayEquals.assertArrayEquals(expected,actual);};


    //assertNull
    public static void assertNull(Object actual, String message) { AssertNull.assertNull(actual,message);};


    //assertNotNull
    public static void assertNotNull(Object actual, String message) { AssertNotNull.assertNotNull(actual,message);};

    //assertTrue
    public static void assertTrue(Boolean actual, String message) { AssertTrue.assertTrue(actual,message);};

    //assertFalse
    public static void assertFalse(Boolean actual, String message) { AssertFalse.assertFalse(actual,message);};



}
