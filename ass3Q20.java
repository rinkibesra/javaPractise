import java.util.Scanner;

public class ass3Q20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter your age:");
        int age=input.nextInt();
        if(age>=60){
            System.out.println("You are a senior citizen");
        }
        else if(age>=20){
            System.out.println("You are an adult");
        }
        else if(age>=13){
            System.out.println("Youare a teenager");
        }else{
            System.out.println("You are a child");
        }

        
    }
}
