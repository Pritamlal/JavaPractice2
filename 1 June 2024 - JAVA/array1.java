public class array1{
    public static void main(String args[])
    {
        int[] arr;

        arr = new int[5];
        arr[0]=15;
        arr[1]=20;
        arr[2]=25;
        arr[3]=30;
        arr[4]=35;

        for(int i=0;i<arr.length;i++)
        System.out.println("Element at index " +i +":"+arr[i]);
    }
}