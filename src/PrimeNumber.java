public class PrimeNumber {
    public static void main(String[] args) {
      isPrime(5);
      isPrime(27);

    }

    public static void isPrime(int number) {
        boolean flag = false;
        for(int i = 2; i<=number/2;i++) {
            if (number % i == 0) {
                flag = true;
                break;

            }
        }

        if(!flag){
            System.out.println(number+" is  a prime number");
        }
        else{
            System.out.println(number+ " is not a prime number");
        }

    }
}