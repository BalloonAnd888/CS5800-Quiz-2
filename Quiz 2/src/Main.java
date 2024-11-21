public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Aggressive");
        System.out.println("Vehicle Type: " + car.getVehicleType());
        System.out.println("Behavior:" + car.getBehavior());

        TrafficLight tl = new TrafficLight();
        tl.changeColor();
        System.out.println(tl.getCurrentColor());
        tl.changeColor();
        System.out.println(tl.getCurrentColor());
        tl.changeColor();
        System.out.println(tl.getCurrentColor());
        tl.changeColor();
        System.out.println(tl.getCurrentColor());

        Vehicle truck = new Truck("Normal");
        Vehicle motorcycle = new Motorcycle("Passive");
    }
}