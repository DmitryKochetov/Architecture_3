package task2;

public class Car extends Vehicle implements SpeedCalculation{

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
        //TODO Auto-generated constructor stub
    }

    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * 0.8;
    }
}
    

