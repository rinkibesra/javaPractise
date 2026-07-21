import java.util.Scanner;

public class ass2Q12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter P: ");
        double P=input.nextFloat();
        System.out.print("Enter R:");
         double R=input.nextFloat();
        System.out.print("Enter t: ");
         double t=input.nextFloat();
         double compoundIinterest=P*(1+R/100)*t;
         System.out.print(("The Coumpound interest:"+compoundIinterest));
    }
    
}
