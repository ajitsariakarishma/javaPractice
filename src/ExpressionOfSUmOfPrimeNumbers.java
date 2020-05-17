public class ExpressionOfSUmOfPrimeNumbers {
    public static void main(String[] args) {

    ExpressNumberInExpressionOfPrimeNumbers(34);
    ExpressNumberInExpressionOfPrimeNumbers(11);





    }
    public static void ExpressNumberInExpressionOfPrimeNumbers(int num){
         boolean flag = false;
        for(int i=2;i<num/2;i++){
            if(isPrime(i)){
                if (isPrime(num - i)) {
                    System.out.println(i+" + "+(num-i)+" = "+num);
                     flag = true;
                }
            }
        }
        if(!flag){
            System.out.println(num+" cannot be expressed in sum of prime number expression ");
        }

    }

    public static boolean isPrime(int number){
        boolean isPrime = true;
        for(int i = 2; i<=number/2;i++){
            if (number % i == 0) {
                isPrime= false;
                break;
            }
            }
        return isPrime;
        }
    }




