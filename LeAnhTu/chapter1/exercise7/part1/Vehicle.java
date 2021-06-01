package chapter1.exercise7.part1;

public class Vehicle implements Cloneable {
    private int x;

    public Vehicle(int y) {
        x = y;
    }

    @Override
    public Object clone() {
        Object result = new Vehicle(this.x);
        // Location "A"
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehicle)) return false;
        Vehicle v = (Vehicle) o;
        return v.x == this.x;
    }
}
