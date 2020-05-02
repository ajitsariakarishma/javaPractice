import java.util.Scanner;

public class AddTwoIntegers {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter 1st addent: ");
            int num1 = scanner.nextInt();
            System.out.print(" Enter 2st addent: ");
            int num2 = scanner.nextInt();
            int sum = num1 +num2;
            System.out.println(" the sum of "+ num1 + " and "+num2 +" is : "+sum);



    }


}
