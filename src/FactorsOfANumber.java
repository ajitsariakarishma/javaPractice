public class FactorsOfANumber {
    public static void main(String[] args) {
        getFactors(10);
        System.out.println();
        getFactors(37);
        System.out.println();
        getFactors(45);

    }

    public static void getFactors(int number) {

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                System.out.print(i + "   ");

            }
        }


    }
}
