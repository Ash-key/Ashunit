package ashunit.runner;

public class StartTest {
    public static void main(String[] args){
        try {
            MethodFramework.startTest(args);
        } catch (Exception e) {
            e.printStackTrace(); // 打印异常堆栈信息
        }
    }
/*    public static void hello(String[] args){
        System.out.println("hahahahahahahahaha ");
    }*/
}
