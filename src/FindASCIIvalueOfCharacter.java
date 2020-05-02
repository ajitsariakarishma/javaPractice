import java.util.Scanner;

public class FindASCIIvalueOfCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a character: ");
        char i = scanner.next().charAt(0);
        int ascii = i;
      //  int ascii = (int)i; --> another way
         System.out.println(" The ACII value of "+i+"  is : "+ascii);



    }


}
