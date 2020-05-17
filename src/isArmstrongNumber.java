public class isArmstrongNumber {
    public static void main(String[] args) {
     isArmstrong(153);
     isArmstrong(124);

    }

    public static void isArmstrong(int number) {
        int temp = number;
        double answer = 0;
        while (number!=0) {
            int reminder = number % 10;
            answer += Math.pow(reminder, 3); // answer = answer+(reminder*reminder*reminder)
            number = number / 10;
        }

            if(temp==answer){
                System.out.println(temp+ " is an armstrong number");
            }
            else {
                System.out.println(temp+" is not an armstrong number");
            }
        }
    }

