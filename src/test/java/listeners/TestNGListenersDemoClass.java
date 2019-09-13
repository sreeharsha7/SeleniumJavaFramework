package listeners;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemoClass {

    @Test
    public void test1() {

        System.out.println("I am inside Test 1");
    }

    @Test
    public void test2() {

        System.out.println("I am inside Test 2");
    }
    @Test
    public void test3() {
        System.out.println("I am inside Test 3");
        //throw new SkipException("This test is skipped");

    }

}


