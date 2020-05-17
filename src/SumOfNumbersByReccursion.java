import java.util.Scanner;

public class SumOfNumbersByReccursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = addNumber(num);
        System.out.println("Sum of numbers from 1 to "+num+" is : "+sum);
    }

    public static int addNumber(int number){

        if(number!=0){
            return number+addNumber(number-1);
        }
        else{
            return number;
        }


    }

}
