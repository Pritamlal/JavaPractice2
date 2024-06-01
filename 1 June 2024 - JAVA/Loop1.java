import java.util.Scanner;

public class Loop1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:::");
        int num = sc.nextInt();
        
        while(num<15){
            System.out.println(num);
            num++;
        }
    }
}
