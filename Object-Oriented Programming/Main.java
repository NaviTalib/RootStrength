class Car {
    String brand;
    String color;
    int speed;

    public Car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;

    }

    public void accelerate(int increment){
        this.speed += increment;
        System.out.println(brand +" accelrated. Current speed: "+this.speed+"km/h");
    }

    public void displayInfo(){
        System.out.println("Car Brand: " + brand + ", Color: " + color + ", Speed: " + speed + " km/h");
    }
}

public class Main{
    public static void main(String[] args) {
        Car car1 = new Car("Tesla","Red",0);
        Car car2 = new Car("BMW","Black",50);

        car1.displayInfo();
        car2.displayInfo();

        System.out.println("\n--- Action ---");
        car1.accelerate(60); // Accelerating Tesla
        car2.accelerate(20); // Accelerating BMW

    }
}