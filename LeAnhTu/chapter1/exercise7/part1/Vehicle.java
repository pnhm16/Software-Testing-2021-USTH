package chapter1.exercise7.part1;

public class Vehicle implements Cloneable {
    private int x;

    public Vehicle(int y) {
        x = y;
//        System.out.println(x);
    }

    @Override
    public Object clone() {
        // Location "A"
        return new Vehicle(this.x);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehicle)) return false;
        Vehicle v = (Vehicle) o;
        return v.x == this.x;
    }
}
