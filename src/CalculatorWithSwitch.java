public class CalculatorWithSwitch {
    public static void main(String[] args) {
      calculator(4,2,'/');
      calculator(45,78,'-');
      calculator(50,2,'9');

    }

    public static void calculator(double number1, double number2, char operator) {
         double result=0;
        switch (operator){
            case '+':
                result=number1+number2;
                System.out.println(number1+" "+operator+" "+number2+" = "+result);
                break;
            case '-':
                result=number1-number2;
                System.out.println(number1+" "+operator+" "+number2+" = "+result);
                break;
            case '*':
                result=number1*number2;
                System.out.println(number1+" "+operator+" "+number2+" = "+result);
                break;
            case '/':
                result=number1/number2;
                System.out.println(number1+" "+operator+" "+number2+" = "+result);
                break;

                default:
                    System.out.println("please enter correct operator");
                    break;
        }



    }
}










