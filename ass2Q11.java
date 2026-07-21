import java.util.Scanner;

public class ass2Q11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter principle: ");
        double p=input.nextFloat();
        System.out.print("Enter time: ");
        double t=input.nextFloat();
        System.out.print("Enter rate: ");
        double r=input.nextFloat();
        double interest=(p*t*r)/100;
        System.out.prints("The interest: "+interest);

    }
    
}
