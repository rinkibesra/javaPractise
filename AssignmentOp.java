import java.util.Scanner;

public class AssignmentOp {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
       System.out.print("enter a value:");
       int a=input.nextInt();
       System.out.print("enter b value:");
       int b=input.nextInt();
       int temp=a;
       a=b;
       b=temp;

        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
        
    }
    
}
