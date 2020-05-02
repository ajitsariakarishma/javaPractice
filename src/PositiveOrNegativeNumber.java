import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        double num = scanner.nextDouble();

        if(num==0){
            System.out.println(num+" can be negative or positive, its neutral");
        }
        else if(num>0){
            System.out.println(num+" is positive number");
        }
        else{
            System.out.println(num+" is negative number");
        }
    }
}
