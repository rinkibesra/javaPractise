import java.util.Scanner;

public class ass3Q18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("To check wheater a year is a leap year or not: ");
        System.out.println("Enter a year: ");
        int year=input.nextInt();
        if(year%400==0){
            System.out.println("Entered year is a leap year");
        }else if(year%100==0){
              System.out.println("Entered year is not a leap year");


        }else{
              System.out.println("Entered year is a leap year");
        }
    }
    
}
