public class PrintingAlphabetsUsingLoop {
    public static void main(String[] args) {

        printAlphabetsUptoRange('g');
        System.out.println();
        printAlphabetsUptoRange('z');

    }

    public static void printAlphabetsUptoRange(char range){
         for(char i = 'a'; i<=range;i++){
            System.out.print(" "+ i+ " ");
        }


    }
}
