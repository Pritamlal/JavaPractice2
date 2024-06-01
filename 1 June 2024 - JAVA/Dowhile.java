public class Dowhile {
    public static void main(String[] args){
    int i=0;

    do{
        if(i==80){

        
        i+=5;
        break;
        }
        System.out.print(i+" ");
        i+=5;
    }
    while(i<=100);
}
}