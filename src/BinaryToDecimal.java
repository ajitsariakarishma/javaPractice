public class BinaryToDecimal {


    public static void main(String[] args) {
        System.out.println(convertBinaryToDecimal(10011011));// return 155
        System.out.println(convertBinaryToDecimal(1000001)); // return 65


    }

    public static int convertBinaryToDecimal(long number){

        int i = 0;
        long remainder = 0;
        int decimal=0;
        while (number!=0) {
            remainder = number % 10;
            number = number / 10;
            decimal+= remainder*Math.pow(2,i); // decimal = (int) (decimal+(remainder * Math.pow(2, i)))(same as)
            i++;
        }
        return decimal;


    }


}
