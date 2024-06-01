import java.util.Scanner;

public class pattern3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.print("Enter the number::");
        int num = sc.nextInt();
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=num;j++)
            {
                System.out.print(j+" ");
                
            }
        i++;
        System.out.println(" ");
        j=1;
        }
    }
}
