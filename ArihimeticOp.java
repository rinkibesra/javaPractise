import java.util.Scanner;

public class ArihimeticOp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=input.nextInt();
        System.out.println("Enter b value: ");
        int b=input.nextInt();
        System.out.println("Addition: "+ (a+b));
        System.out.println("Substraction: "+( a-b));
        System.out.println("Multipltipication:"+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Remainder: "+(a%b));
        System.out.println("");
        System.out.println("For Decimal Number");
        double x=23;
        double y=13;
          System.out.println("Addition: "+ (x+y));
        System.out.println("Substraction: "+( x-y));
        System.out.println("Multipltipication:"+(x*y));
        System.out.println("Division: "+(x/y));
        System.out.println("Remainder: "+(x%y));
    }
    
}
