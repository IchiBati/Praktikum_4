package de.hrw.progra2.assignment4;

/**
 * Class representing 3D vector in world
 */
public class Vector3D {
    /** x-coordinate */
    private double x;
    /** y-coordinate */
    private double y;
    /** z-coordinate */
    private double z;

    /**
     * Default constructor.
     */
    public Vector3D() {

    }

    /**
     * Constructor setting all attributes.
     * @param x x-coordinate
     * @param y y-coordinate
     * @param z z-coordinate
     */
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
