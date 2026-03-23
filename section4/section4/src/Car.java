public class Car {

    String model;
    String color;
    int horsePower;
    static  byte noOfWheels = 4;

    {
        System.out.println("Car object is being created...");
    }

    public Car(String model, String color, int horsePower){
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public Car() {

    }

    public void startCar() {
        System.out.println("Vehicle started...");
    }

    public String stopCar() {
        String output = "Vehicle stopped";
        return output;
    }
}
