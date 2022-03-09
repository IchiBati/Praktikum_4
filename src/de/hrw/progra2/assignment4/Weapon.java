package de.hrw.progra2.assignment4;

public class Weapon extends AbstractThing implements CanBeCarriedInInventory{
    double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Weapon(String name, Vector3D position, double cost) {
        super(name, position, true);
        this.cost = cost;
    }
}
