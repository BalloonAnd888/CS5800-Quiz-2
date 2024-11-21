public class Truck extends Vehicle {
    private String type = "Truck";
    private String behavior;

    public Truck(String behavior) {
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
