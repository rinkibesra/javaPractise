import java.util.Scanner;

public class ass3Q17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a=input.nextInt();
        System.out.print("Enter b value: ");
         int b=input.nextInt();
        System.out.print("Enter c value: ");
         int c=input.nextInt();
        if(a>b && a>c){
            System.out.println("a is greatest");
        }else if(b>a &&b>c){
            System.out.println("b is greatest");
        }else{
            System.out.println("c is greatest");
        }
          

    }
    
}
