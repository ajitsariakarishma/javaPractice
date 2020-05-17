import java.util.Scanner;

public class GetFactorialByreccursiveMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = getfactorial(num);
        System.out.println("Factorial of  "+num+" is : "+factorial);
    }

    public static int getfactorial(int number){

        if(number>=1){
            return number*getfactorial(number-1);//calling the same function within
        }
        else {
            return 1;
        }

    }

}
