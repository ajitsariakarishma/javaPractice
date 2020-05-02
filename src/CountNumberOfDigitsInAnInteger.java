import java.util.Scanner;

public class CountNumberOfDigitsInAnInteger {
    public static void main(String[] args) {
        countNumberOfDigits(1234567898);
        countNumberOfDigits(1);


    }
    public static void countNumberOfDigits(long number){
        long flag = number;
        int count = 0;
        while (number!=0){
            number = number/10;
            count=count+1;

        }
        System.out.println(flag +" has " +count+" digits." );




    }
}
