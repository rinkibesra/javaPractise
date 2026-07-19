import java.util.Scanner;

public class userName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=input.nextLine();
        System.out.println("Welcome "+name);
        System.out.println(name+",Also lett me your age");
        int age=input.nextInt();
        System.out.println(name+",Your age is :"+age);

           

    }
    
}
