import java.util.Scanner;

public class ass2Q10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter base:");
        int b=input.nextInt();
        System.out.println("Enter hypotenese:");
        int h=input.nextInt();
        double area=0.5*(b*h);
        System.out.println("Area of the given triangle: "+area);
    }
    
}
