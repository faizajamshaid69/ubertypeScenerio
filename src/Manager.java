import java.util.ArrayList;
import java.util.List;

public class Manager <T> {
    private List<Taxi<T>> taxis;

    public Manager() {
        taxis = new ArrayList<>();
    }

    public void addTaxi(Taxi<T> taxi) {
        taxis.add(taxi);
    }

    public Taxi<T> findNearestTaxi(int x, int y) {
        if (taxis.isEmpty()) {
            return null;
        }
        Taxi<T> nearestTaxi = taxis.get(0);
        double minDistance = calculateDistance(nearestTaxi, x, y);
        for (Taxi<T> taxi : taxis) {
            double distance = calculateDistance(taxi, x, y);
            if (distance < minDistance) {
                nearestTaxi = taxi;
                minDistance = distance;
            }

        }
        return nearestTaxi;
    }
    private double calculateDistance(Taxi<T>taxi,int x,int y){
        int primeX=taxi.getX();
        int primeY= taxi.getY();
        return Math.sqrt(primeX*primeX+primeY*primeY);
    }

}