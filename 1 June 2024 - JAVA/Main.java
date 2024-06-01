class Car {
    String name;
    String color;
    int year;

    public Car(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public void displayInfo() { // Use camelCase for method names
        System.out.println("Name: " + name + ", Color: " + color + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Car myCar1 = new Car("Tata", "Red", 2015);
        myCar1.displayInfo();
        System.out.println(" ");
        Car myCar2 = new Car("Honda", "Yellow", 2015);
        myCar2.displayInfo();
    }
}