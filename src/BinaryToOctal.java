import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number to get its octal value: ");
        /*string is parsed to integer via parseInt() function and radix specifies hich numeral system to be used
        here radix is 2 that means use binary system because binary syatem has base 2
        Integer. toOctalString() method is a built-in function in Java that is used to return a string representation
        of the integer argument as an unsigned integer in base 8.
        unsigned integer means a non negative number.
         */

        int number = Integer.parseInt(scanner.next(),2);
         String octal = Integer.toOctalString(number);

        System.out.println("Octal value of  is "+octal);





    }
}


