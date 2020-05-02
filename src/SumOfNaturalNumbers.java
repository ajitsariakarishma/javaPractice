import java.util.Scanner;

public class SumOfNaturalNumbers {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter number: ");
            int num1 = scanner.nextInt();
            int sum = 0;
            for(int i=1;i<=num1;i++){
                sum=sum+i;
            }
            System.out.println("The sum of numbers from 1 to "+ num1 + " is : "+sum);

            System.out.println("----with while loop------");
            int k=1;
            int sum1=0;
            while(k<=num1){
                sum1=sum1+k;
                k++;
            }
            System.out.println("The sum of numbers from 1 to "+ num1 + " is : "+sum);
        }
}
