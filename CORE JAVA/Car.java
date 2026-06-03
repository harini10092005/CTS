public class Car {

    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {

        Car c = new Car("Toyota", 120);

        c.display();
    }
}