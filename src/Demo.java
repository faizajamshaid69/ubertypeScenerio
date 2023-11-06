public class Demo {
    public static void main(String[] args) {
        Manager<Boolean> manager = new Manager<>();

        manager.addTaxi(new Taxi<>("T001", 5, 5, true));
        manager.addTaxi(new Taxi<>("T002", 10, 10, false));
        manager.addTaxi(new Taxi<>("T003", 2, 2, true));

        Passengers passenger = new Passengers("Nida", 8, 8);

        Taxi<Boolean> nearestTaxi = manager.findNearestTaxi(passenger.getX(), passenger.getY());

        if (nearestTaxi != null) {
            System.out.println("The nearest taxi for " + passenger.getName() + " is " + nearestTaxi.getId());
        } else {
            System.out.println("No taxis available.");
        }
    }
    }

