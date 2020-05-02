import java.util.Scanner;

public class VowelOrConsonent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter an alphabet: ");
        char i = scanner.next().charAt(0);

         if(i=='a'||i=='A'||i=='e'||i=='E'||i=='i'||i=='I'||i=='o'||i=='O'||i=='u'||i=='U'){
          System.out.println(i+" is a vowel");
        }
        else{
            System.out.println(i+" is a consonent");
         }
         // with switch
        System.out.println("-----with switch case --------");


        switch (i){
            case'a':case 'A': case'e': case 'E':case'i': case 'I':case'o': case 'O':case'u': case 'U':
                System.out.println(i+" is a vowel");
                break;

                default:System.out.println(i+" is a consonent");
                break;


        }








    }
}



