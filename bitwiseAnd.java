import java.util.Scanner;

public class bitwiseAnd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Showcasing Bitwise And operator");
        System.out.print("Enter num1:");
        int num1=input.nextInt();
        System.out.print("Enter num2: ");
        int num2=input.nextInt();
    int result=num1&num2;
    System.out.println("Result:"+result);

    }
    
}
