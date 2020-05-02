public class FibonacciSeries {
    public static void main(String[] args) {
     getFibonacci(8);
    System.out.println();
    getFibonacci(10);

    }

    public static void getFibonacci(int num) {

        int num1=0;
        int num2=1;

        for(int i = 0; i<=num ;i++){
            System.out.print(" "+num1+" ");
            int sum = num1+num2;
            num1=num2;
            num2=sum;

        }


}
}
