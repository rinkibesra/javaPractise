import java.util.Scanner;

public class bitwiseNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Showcase of NOT operator");
        System.out.println("Enter num1: ");
        int num=input.nextInt();
        int result=~num;
        System.out.println("Result:"+result);
    }
    
}
