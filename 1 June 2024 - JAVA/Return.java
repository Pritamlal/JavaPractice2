import java.util.Scanner;

public class Return {
    double RR(double a,double b){
        double sum=0;
        sum=(a+b)/2.0;
        return sum;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number::");
        double a = scn.nextInt();
        System.out.println("Enter the number::");
        double b = scn.nextInt();

        System.out.println(new Return().RR(a,b));
    }
}
