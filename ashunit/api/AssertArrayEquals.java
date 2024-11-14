package ashunit.api;

public class AssertArrayEquals {

    public static void assertArrayEquals(int[] expected, int[] actual) {
        for(int i=0;i< expected.length;i++){
            if(expected[i]!=actual[i]){
                throw new AssertionError("Expected array was not equal with actual array" );
            }
        }
    }

    public static void assertArrayEquals(double[] expected, double[] actual) {
        for(int i=0;i< expected.length;i++){
            if(expected[i]!=actual[i]){
                throw new AssertionError("Expected array was not equal with actual array" );
            }
        }
    }
}
