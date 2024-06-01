class Student{
    public String name;
    Student(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
}

public class namas{
    public static void main(String[] args){
        Student[] myStudents = new Student[]{new Student("pritam"),new Student("Lal"),
        new Student("Nitish"),new Student("Lally")};

        for(Student m:myStudents){
            System.out.println(m);
        }
    }
}