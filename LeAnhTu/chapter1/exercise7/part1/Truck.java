package chapter1.exercise7.part1;

public class Truck extends Vehicle {
    private int y;

    public Truck(int z) {
        super(z);
        y = z;
        System.out.println(super.getClass());
    }

    @Override
    public Object clone() {
        Object result = super.clone();
        // Location "B"
        ((Truck) result).y = this.y;  // throws ClassCastException
        return result;
    }

    public Object cloneRewrite() {
        Object result = super.clone();
        if (result instanceof Truck) {
            // Location "B"
            ((Truck) result).y = this.y;  // throws ClassCastException
            return result;
        } else {
            return new Truck(this.y);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Truck)) return false;
        Truck t = (Truck) o;
        return super.equals(t) && t.y == this.y;
    }
    // other methods omitted


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
