import java.util.Scanner;

public class MultiDimensional{
    public static void main(String[] args){
        int arr[][]={ {1,2,3,4},{4,5,6,7},{7,8,9,10}};
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number::");
        int num = scn.nextInt();
        {
        if(num==1){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
                System.out.print(arr[i][j]+" ");
                System.out.println();
        }}

        if(num==2){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++)
                    System.out.print(arr[i][j]+" ");
                    System.out.println();
        }}

        if(num==3){
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++)
                    System.out.print(arr[i][j]+" ");
                    System.out.println();
        }}
    }}
}