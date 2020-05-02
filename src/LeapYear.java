import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a year : ");
        int num = scanner.nextInt();
        boolean flag=false;


        if(num%4==0){
            if(num%100==0) {
                if(num % 400 == 0){
                    flag = true;
                }
            }
            else{
                flag=true;
            }
        }
        else{
            flag=false;
        }

        System.out.println("Is "+num+" a leap year :"+flag);
    }

}
