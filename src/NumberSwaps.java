import java.util.Scanner;

public class NumberSwaps {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter 1st number to be swaped: ");
        int num1 = scanner.nextInt();
        System.out.print(" Enter 2nd number to be swaped: ");
        int num2 = scanner.nextInt();
        System.out.println("Value before swaping a= "+num1+" and b="+num2);

       // int temp = num1;
       // num1 = num2;
       // num2 = temp;

       // System.out.println("Value after swaping a= "+num1+" and b="+num2);

        // without using temp variable

        num1=num1-num2;//-20
        num2=num1+num2;//78
        num1=num2-num1;//78-(-20) = 98


        System.out.println("Value after swaping a= "+num1+" and b="+num2);




    }
}
