class student{
    public int roll_no;
    public String name;
    student(int roll_no,String name){
        this.roll_no=roll_no;
        this.name = name;
    }
}
public class students {
    int[] arr = new int[5];

    arr[0] = new Student(1,"aman");
    arr[1] = new Student(2,"Nitish");
    arr[2] = new Student(3,"Vaibhav");
    arr[3] = new Student(4,"Mohit");

    for(int i=0;i<arr.length;i++){
        System.out.println("Element at " + i + " : "+ arr[i].roll_no + " "+ arr[i].name)
    }
}
