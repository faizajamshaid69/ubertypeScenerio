public class Taxi <T>{
    private String id;
    private int x;
    private int y;
    private T availability;

    public Taxi(String id, int x, int y, T availability) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.availability = availability;
    }

    public String getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public T getAvailability() {
        return availability;
    }
}
