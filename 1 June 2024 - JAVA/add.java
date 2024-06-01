import java.util.Scanner;

public class add {
   public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter the number::");
    int num1 = scn.nextInt();

    System.out.println("Enter the number2::");
    int num2 = scn.nextInt();

    int sum = num1+num2;;
    System.out.println("Sum is::"+sum);
   } 
}
