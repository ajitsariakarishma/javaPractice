import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter an alphabet: ");
        char i = scanner.next().charAt(0);

        if((i>='a'&& i<='z')||(i>='A'&& i<='Z')){

            System.out.println(i+" is an alphabet");
        }
        else{
            System.out.println(i+" is not an alphabet");
        }
       System.out.println("------with ACSII value-------");
        if((i>=97&& i<=122)||(i>=65&& i<=90)){

            System.out.println(i+" is an alphabet");
        }
        else{
            System.out.println(i+" is not an alphabet");
        }

    }
}



