package listeners;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListeners.class)
public class TestNGListenerDemo2 {



    @Test
    public void test4()
    {
        System.out.println("I am inside Test 4");
        //Assert.assertTrue(false);
    }

    @Test
    public void test5()
    {
        System.out.println("I am inside Test 5");
        //throw new SkipException("This test is skipped");

    }

    @Test
    public void test6()
    {

        System.out.println("I am inside Test 6");
    }




}


