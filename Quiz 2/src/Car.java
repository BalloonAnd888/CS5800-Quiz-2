public class Car extends Vehicle {
    private String type = "Car";
    private String behavior;

    public Car(String behavior) {
        this.behavior = behavior;
    }

    @Override
    public String getVehicleType() {
        return type;
    }

    @Override
    public String getBehavior() {
        return behavior;
    }
}
