import java.util.*;

public class StrategyMap {
    public static void main(String[] args) {
        NavigationModel model = new NavigationModel();
        DrivingStrategy drive = new DrivingStrategy();
        WalkingStrategy walk = new WalkingStrategy();
        BikingStrategy bike = new BikingStrategy();

        Location a = new Location("Georgia Tech");
        Location b = new Location("Piedmont Park");

        // For driving
        model.setStrategy(drive);
        String drivingRoute = model.startRoute(a, b).toString();
        System.out.println("Driving from " + a.getName() + " to " + b.getName() + drivingRoute);

        // For walking
        model.setStrategy(walk);
        String walkingRoute = model.startRoute(a, b).toString();
        System.out.println("Walking from " + a.getName() + " to " + b.getName() + walkingRoute);

        // For biking
        model.setStrategy(bike);
        String bikingRoute = model.startRoute(a, b).toString();
        System.out.println("Biking from " + a.getName() + " to " + b.getName() + bikingRoute);
    }
}

