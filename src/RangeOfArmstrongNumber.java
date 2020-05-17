public class RangeOfArmstrongNumber {


    public static void main(String[] args) {
       rangeOfArmstrongNumber(100,200);
       rangeOfArmstrongNumber(1,500);

    }

    public static void rangeOfArmstrongNumber(int low, int high) {
        while (low < high) {
            int temp = low;
            double answer = 0;
            while (temp != 0) {
                int reminder = temp% 10;
                answer += (reminder * reminder * reminder);
                temp= temp / 10;
            }

            if (low == answer) {
                System.out.println(low + " is an armstrong number");
            }
            low++;

        }
    }
}

