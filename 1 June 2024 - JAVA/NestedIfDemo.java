import java.util.Scanner;
public class NestedIfDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers::");
        int i = sc.nextInt();
        
        if(i==10 || i< 15){
            if(i<15)
            System.out.println("The number is greater than 15");
            if (i < 12)
            System.out.println(
                "i is smaller than 12 too");
        }else{
            System.out.println("i is greater than 15");
        }
    }
}
