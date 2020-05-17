public class PalindromeNumber {

        public static void main(String[] args) {
            isPalindrome(123);
            isPalindrome(414);


        }
        public static void isPalindrome(int number){
            int flag = number;
            int reverse = 0;
            while (number!=0) {
                int lastDigit = number % 10;
                number = number / 10;
                reverse = reverse * 10 + lastDigit;
            }

                if (flag == reverse) {
                    System.out.println(flag + " is a palindrome number");
                } else {
                    System.out.println(flag + " is not a palindrome number");
                }








        }
}
