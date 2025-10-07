// Airplane.java
public class Airplane {
    private String model;
    private int capacity;

    public Airplane(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return model + " (вместимость: " + capacity + ")";
    }
}
