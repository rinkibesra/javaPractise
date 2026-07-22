import java.util.Scanner;

public class bitwiseOddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("To check wheater a number is odd / even");
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        if((num&1)==1){
            System.out.println("Odd");
            
        }else{
            System.out.println("Even");

        }
    }
    
}
