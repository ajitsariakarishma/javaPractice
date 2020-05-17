public class CalculatePowerOfNumber {
    public static void main(String[] args) {
      getPowerofTheNumber(2,3);
        getPowerofTheNumber(12,2);
        getPowerofTheNumber(4,0);
    }

    public static void getPowerofTheNumber(double num, double power){

       double answer=1;
       double temp=power;
         System.out.println("by using math function "+Math.pow(num,power));

       while (power!=0){

            answer*=num; //is nothing but answer = answer*num
             --power;

       }
       System.out.println(num+" to the power of "+ temp+ " is :"+answer);

       // by using math function

    }







}
