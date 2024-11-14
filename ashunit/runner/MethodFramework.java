package ashunit.runner;

import ashunit.ExampleTests;
import ashunit.api.AshTest;
import ashunit.api.AshBeforeTest;
import ashunit.api.AshAfterTest;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MethodFramework {
    public static void startTest(String[] args) throws Exception {
        List<String> results = new ArrayList<>();
        Class<?> testClass = ExampleTests.class;

        Object testInstance = testClass.getDeclaredConstructor().newInstance();
        invokeLifecycleMethods(testClass, testInstance, "AshBeforeTest");

        for (Method method : testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(AshTest.class)) {
                try {
                    long startTime = System.currentTimeMillis();
                    method.invoke(testClass.getDeclaredConstructor().newInstance());
                    long duration = System.currentTimeMillis() - startTime;
                    results.add(method.getName() + " passed in " + duration + " ms");

                } catch (Exception e) {
                    results.add(method.getName() + " failed: " + e.getCause());

                }
            }
        }

        invokeLifecycleMethods(testClass, testInstance, "AshAfterTest");
        results.forEach(System.out::println);
    }

    //调用声明周期方法，接受测试类、实例和生命周期字符串作为参数。
    private static void invokeLifecycleMethods(Class<?> testClass, Object testInstance, String lifecycle) throws Exception {
        for (Method method : testClass.getDeclaredMethods()) {
            //判定AshBeforeTest或AshAfterTest
            if (method.isAnnotationPresent(lifecycle.equals("AshBeforeTest") ? AshBeforeTest.class : AshAfterTest.class)) {
            //通过反射动态调用方法
                method.invoke(testInstance);
            }
        }
    }

}
