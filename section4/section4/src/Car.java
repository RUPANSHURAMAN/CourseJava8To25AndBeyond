public class Car {

    String model;
    String color;
    int horsePower;

    {
        this.model = "Camry";
        this.color = "Black";
        this .horsePower = 200;
        System.out.println("Car object is being created...");
    }
    public void startCar() {
        System.out.println("Vehicle started...");
    }

    public String stopCar() {
        String output = "Vehicle stopped";
        return output;
    }
}
