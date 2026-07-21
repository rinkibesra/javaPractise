import java.util.Scanner;

public class ass3Q19 { 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Welcome Grading System ");
        System.out.println("Enter your percentage:");
        float percentage=input.nextFloat();
        if(percentage>=90){
            System.out.println("Great,You have got A");
        }else if(percentage>=75){
            System.out.println("Good,You have got B");

        }else if(percentage>=60){
            System.out.println("You have got C, Work harder next time");
        }
         else if(percentage>=30){
            System.out.println("You have got D, You seriously need to work hard");
        }else{
            System.out.println("Sorry ,You have failed the test ,You have got F");
        }
    }
    
}
