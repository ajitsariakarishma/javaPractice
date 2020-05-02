import java.util.Scanner;

public class QuotientAndReminder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter dividend: ");
        int num1 = scanner.nextInt();
        System.out.print(" Enter divisor: ");
        int num2 = scanner.nextInt();

        int quotient = num1 /num2;
        int reminder = num1%num2;
        System.out.print(" The quotient of "+ num1 + " dividend "+num2 +" is  "+quotient+" and remender is "+ reminder);




    }


}
