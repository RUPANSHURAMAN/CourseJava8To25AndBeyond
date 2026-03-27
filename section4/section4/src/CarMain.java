public class CarMain {

    static {
        System.out.println("Static block from same class");
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("Main method invocation");
        Car car1 = new Car();
        Car car2 = new Car("Ford", "Red", 200);
        System.out.println(car1.NO_OF_WHEELS);
    }
}
