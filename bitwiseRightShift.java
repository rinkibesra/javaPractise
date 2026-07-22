  import java.util.Scanner;
public class bitwiseRightShift {
  

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Showcase of RIGHT SHIFT operator");
        System.out.print("Enter num1: ");
        int num=input.nextInt();
        int result=num>>1;
        System.out.println("Result:"+result);
    }
    
}