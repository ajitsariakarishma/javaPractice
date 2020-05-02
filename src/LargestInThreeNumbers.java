import java.util.Scanner;

public class LargestInThreeNumbers {



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter 1st number: ");
            int num1 = scanner.nextInt();
            System.out.print(" Enter 2st number: ");
            int num2 = scanner.nextInt();
            System.out.print(" Enter 3rd number: ");
            int num3 = scanner.nextInt();
            int largest = 0;
            if (num1 > num2 && num1 > num3) {
                System.out.println(num1 + " is the largest number ");
            }
               else if (num2 > num3) {
                    System.out.println(num2 + " is the largest number ");
               }
                 else {
                    System.out.println(num3 + " is the largest number ");
                }

            }
        }






