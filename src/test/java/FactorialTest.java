import PACKAGE_NAME.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorial1() {
        //given
        Factorial factorial = new Factorial();
        Integer expected = 120;
        //when

        Integer actual = factorial.factorial(5);
        //then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testFactorial2() {
        //given
        Factorial factorial = new Factorial();
        Integer expected = 3628800;
        //when

        Integer actual = factorial.factorial(10);
        //then
        Assert.assertEquals(expected, actual);
    }

}
