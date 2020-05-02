import java.util.Scanner;

public class FactorialNumber {


    public static void main(String[] args) {

        getFactorial(4);
        getFactorial(5);
    }

    public static void getFactorial(int num) {

        int product = 1;
        for (int i = 1; i <= num; i++) {
            product = product * i;
        }
        System.out.println(" The factorial of " + num + " is : " + product);
        System.out.println("----with while loop------");
        int k = 1;
        int sum1 = 1;
        while (k <= num) {
            sum1 = sum1 * k;
            k++;
        }
        System.out.println(" The factorial of " + num + " is : " + sum1);
    }
}


