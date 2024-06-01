import java.util.Scanner;

public class Sum {
    
    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b, int c){
    return a+b+c;
    }
    
    public static int sum(int a,int b,int c,int d){
    return a+b+c+d;
    }

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter four numbers: ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();

       int sum2 = sum(a, b);
       int sum3 = sum(a, b, c);
       int sum4 = sum(a, b, c, d);

       System.out.println("Sum of two numbers: " + sum2);
       System.out.println("Sum of three numbers: " + sum3);
       System.out.println("Sum of four numbers: " + sum4);
    }
}
