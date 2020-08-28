package gr.myproj.exercises1;

public class simpleAlgorithms {

    //Write a program that calculates the factorial of a number n (n!).
    public static double factorial(int n) {
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    //Find the maximum value of n as int so that the calculated output is valid.
    public static int findMaxValue(long n)
    {
        int res = 2;
        while (true)
        {
            // when fact crosses its size,
            // it gives negative value
            if (n < 0)
                break;
            res++;
            n = n * res;
        }

        return res - 1;
    }

    //Write a program that returns true or false depending on if the number is prime or not.
    public static boolean primeNumber(int n) {

        boolean flag = false;
        for(int i = 2; i <= n/2; ++i)
        {
            // condition for non prime number
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }

        return flag;
    }

    //Write a program that, for a given n, it calculates the following value: 1 + ½ + ⅓ + … + 1/n.
    public static double sentence(int n) {
        double sum = 0.0;
        for(int i=1;i<=n;i++){
            if(n == 0)
                break;
            sum += sum + 1/i;
        }

        return sum;
    }

    //Write a program that counts the digits of a long number
    public static int digitsOfLongNum(long num) {
        int Reminder, digits=0;
        while(num > 0)
        {
            num = num / 10;
            digits += 1;
        }

        return digits;
    }

    //Given a positive float number, print its decimal part.
    // For example, given the number 2.31, the output should be 0.31
    public static float decimalPart(float number) {
        float decimal;
        int value = (int) number;
        decimal = number - value;
        return number;
    }
}
