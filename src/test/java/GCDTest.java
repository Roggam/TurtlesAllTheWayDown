import PACKAGE_NAME.GCD;
import org.junit.Assert;
import org.junit.Test;

public class GCDTest {
    @Test
    public void gcdTest1() {
        GCD gcd = new GCD();

        int expectedNumber = 5;

        int actualNumber = gcd.gcd(5500, 1655);

        Assert.assertEquals(expectedNumber, actualNumber);

    }


    @Test
    public void gcdTest2() {
        GCD gcd = new GCD();

        int expectedNumber = 8812;

        int actualNumber = gcd.gcd(8812, 8812);

        Assert.assertEquals(expectedNumber, actualNumber);

    }
}
