public class MultiplicationTable {
    public static void main(String[] args) {
        getTable(8,10);


    }

    public static void getTable(int num, int range) {

        int product = 1;
        for (int i = 1; i <= range; i++) {
            product = num*i;
            System.out.println(  num + " x " + i +" = "+ product);
        }


    }
}

