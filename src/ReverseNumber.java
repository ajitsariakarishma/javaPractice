public class ReverseNumber {
    public static void main(String[] args) {
       reverseNumber(234);
       reverseNumber(56743);


    }
    public static void reverseNumber(int number){
       int flag = number;
        int reverse = 0;
        while (number!=0){
            int lastDigit = number%10;
            number=number/10;
            reverse=reverse*10+lastDigit;
        }
        System.out.println("Reverse of "+flag+" is : "+ reverse);






    }


}
