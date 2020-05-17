public class RangeOfPrimeNumber {
    public static void main(String[] args) {
        isPrimeBetween(10,30);
        System.out.println();
        isPrimeBetween(1,20);

    }

    public static void isPrimeBetween(int low, int high) {

        while (low <high) {
            boolean flag = false;
            for (int i = 2; i <= low / 2; i++) {
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.print(low + "  ");
            }
            low++;

        }
    }
}
