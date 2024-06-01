import java.util.Scanner;

public class IfelseDemo {
    public static void main(String args[]){
      
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number:::");
        int i = sc.nextInt();
        
        if(i<15)
        System.out.println("The number is less than 15");
        else
        System.out.println("The number is greater than 15");
    }
}
