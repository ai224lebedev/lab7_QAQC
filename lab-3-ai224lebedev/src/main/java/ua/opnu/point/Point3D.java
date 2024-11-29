package ua.opnu.point;

import ua.opnu.java.inheritance.point.Point;

public class Point3D extends Point {
    private int z;

    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return this.z;
    }

    @Override
    public double distanceFromOrigin() {
        return distance(new Point3D());
    }

    public double distance(Point3D p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        int dz = this.z - p.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0;
    }

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "[x=" + x + ",y=" + y + ",z=" + z + "]";
    }
}
