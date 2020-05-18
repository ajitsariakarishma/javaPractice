import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number to get its octal value: ");
        int number = Integer.parseInt(scanner.next(),2);
        String octal = Integer.toOctalString(number);

        System.out.println("Octal value of  is "+octal);





    }
}


