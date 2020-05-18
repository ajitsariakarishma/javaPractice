public class OctalToDecimal {
    public static void main(String[] args) {

        System.out.println(convertOctalToDecimal(116)); // get 78
        System.out.println(convertOctalToDecimal(155)); //get 109

    }

    public static int convertOctalToDecimal(int number){

         int i = 0;
         int decimal=0;
        while (number!=0) {
            decimal+= (number % 10)*Math.pow(8,i);
            number /=10;
            i++;
        }
        return decimal;


    }

}
