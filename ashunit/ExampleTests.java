package ashunit;

import ashunit.api.AshAfterTest;
import ashunit.api.AshBeforeTest;
import ashunit.api.AshTest;

import static ashunit.api.Assertions.*;
import static org.example.Main.fun1;
import static org.example.Main.fun2;


public class ExampleTests {

    @AshBeforeTest
    public void a(){System.out.println("测试启动");}

    @AshTest
    public void test1() {
        assertEquals(2, 1+1);
    }

    @AshTest
    public void test2() {
        assertEquals(1,2 );
    }

    @AshTest
    public void test3(){
        int a[]={1,2,3};
        int b[]={1,2,3};
        assertArrayEquals(a,b);
    }

    @AshTest
    public void test4(){
        int a[]={1,2,3};
        int b[]={1,2,6};
        assertArrayEquals(a,b);
    }

    @AshTest
    public void test5(){

        assertNotEquals(1,4);
    }

    @AshTest
    public void test6(){
        int a[]={1,2,3};
        int b[]={1,2,6};
        assertArrayEquals(a,b);
    }

    @AshTest
    public void test7(){
        assertNull(null,"the objectValue is not null");

    }

    @AshTest
    public void test8(){

        assertNotNull(null,"the objectValue is null");
    }

    @AshTest
    public void test9(){
        assertTrue(true,"The condition is false!");
    }

    @AshTest
    public void test10(){
        assertFalse(true,"The condition is true!");
    }

    @AshAfterTest
    public void b(){System.out.println("测试结束");};

}