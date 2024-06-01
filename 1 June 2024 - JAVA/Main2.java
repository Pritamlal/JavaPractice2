class bio{
    String name;
    int Salary;

    public bio(String name,int Salary){
        this.name=name;
        this.Salary=Salary;
    }

    void displayinfo(){
        System.out.println(" ");
        System.out.println("Name:"+name);
        System.out.println(" ");
        System.out.println("Salary:"+Salary);
    }
}

public class Main2{
    public static void main(String args[]){
        bio Bio = new bio("Pritam",100000);

        Bio.displayinfo();
    }
}
