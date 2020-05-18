public class DecimalToOctalNumber {
    public static void main(String[] args) {
        System.out.println(convertDecimalToOctal(78)); // get 116
        System.out.println(convertDecimalToOctal(109)); // get 115

    }

    public static int convertDecimalToOctal(int number){

        int i = 1;
        int octal=0;
        while (number!=0) {
            octal+= (number % 8)*i; // same as octal = binary+(number% 8) * i
            number/= 8; // same as number = number/8
            i*=10; // equivalent to i = i*10
        }
        return octal;


    }
}
