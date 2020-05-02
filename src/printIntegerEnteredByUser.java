import java.util.Scanner;

public class printIntegerEnteredByUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = scanner.nextInt();
        System.out.println("number entered by you is : "+ i);

    }


}
