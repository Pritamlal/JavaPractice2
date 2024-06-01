import java.util.Scanner;

public class Loopsum {
    public static void main(String args[]){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers::");
        int num= sc.nextInt();
        
        for(int x=num;x<=20;x++){
            sum=sum+x;
        }
        System.out.println("Sum is:"+sum);
    }
}
