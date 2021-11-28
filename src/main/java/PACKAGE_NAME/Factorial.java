package PACKAGE_NAME;

public class Factorial {

    public Integer factorial(Integer n){
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);

    }
}
