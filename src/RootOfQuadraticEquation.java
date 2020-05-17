public class RootOfQuadraticEquation {

    public static void main(String[] args) {
       getRootOfQuadraticEquation(2,9,6);
    }

    public static void getRootOfQuadraticEquation(double a, double b, double c){

        double root1=0, root2=0;
        double discriminant;

        discriminant=b*b-4*a*c;

        if(discriminant>0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(" Roots for quadratic equation are : root 1 is ---> " + root1 +
                    " and root 2 is ---> " + root2);
        }else if(discriminant==0){
            root1=root2=-b/(2 * a);
            System.out.println(" both roots are same: root 1 is ---> " + root1 +
                                       " and root 2 is ---> " + root2);
        }
        else if(discriminant<0) {
            System.out.println("both roots are imaginary");
        }
    }

}
