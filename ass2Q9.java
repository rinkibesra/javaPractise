import java.util.Scanner;

public class ass2Q9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter lenght:");
        int l=input.nextInt();
        System.out.print("Enter breadth:");
        int b=input.nextInt();
        int perimeter=2*(l+b);
        System.out.println("The perimeter of the given length and breadth: "+perimeter);


    }
    
}
