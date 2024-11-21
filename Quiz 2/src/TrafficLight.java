import java.beans.PropertyChangeSupport;
import java.util.Random;

public class TrafficLight {
    private String[] colors = {"Red", "Yellow", "Green"};
    private String currentColor = "Red";
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public TrafficLight() {

    }

    public String[] getColors() {
        return colors;
    }

    public void changeColor() {
        Random rand = new Random();
        int randomNum = rand.nextInt(1, 11);

        if (randomNum >= 3) {
            switch (currentColor) {
                case "Red":
                    currentColor = colors[2];
                    break;
                case "Yellow":
                    currentColor = colors[0];
                    break;
                case "Green":
                    currentColor = colors[1];
                    break;
                default:
                    System.out.println("Invalid color");
            }
        }
    }

    public String getCurrentColor() {
        return currentColor;
    }
}
