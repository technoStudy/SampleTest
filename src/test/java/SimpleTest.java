import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class SimpleTest {
    @Test
    public void test1() {
        System.out.println("Success");
    }
    @Test
    public void test2() {
        System.out.println("Success");
    }
    @Test
    public void test3() {
        boolean failOrNotFail = new Random().nextBoolean();
        if(failOrNotFail) {
            Assert.fail("Fail 3");
        } else {
            System.out.println("Success 3");
        }
    }

    @Test
    public void test4() {
        Assert.fail("Fail 4");
    }

    @Test
    public void test5() {
        System.out.println("Success5");
    }

}
