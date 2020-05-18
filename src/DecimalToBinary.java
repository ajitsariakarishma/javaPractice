public class DecimalToBinary {
    public static void main(String[] args) {
       // System.out.println(convertBinaryToDecimal(10011011));// return 155
       // System.out.println(convertBinaryToDecimal(1000001)); // return 65
        System.out.println(convertDecimalToBinary(65));
        System.out.println(convertDecimalToBinary(155));

    }

    public static long convertDecimalToBinary(int number){

        int i = 1;
        long remainder = 0;
        long binary=0;
        while (number!=0) {
           // remainder = number % 2; not required
           // number = number / 2; has to follow the step after getting the remainder
             binary+= (number % 2)*i; // same as binary = binary+(remainder*i)
            number = number / 2;
            i*=10; // equivalent to i = i*10
        }
        return binary;


    }

}
