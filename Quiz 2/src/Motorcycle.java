public class Motorcycle extends Vehicle {
    private String type = "Motorcycle";
    private String behavior;

    public Motorcycle(String behavior) {
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
