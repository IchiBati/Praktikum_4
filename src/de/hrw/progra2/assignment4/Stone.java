package de.hrw.progra2.assignment4;

public class Stone extends AbstractThing implements CanBeCarriedInInventory{
    double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Stone(String name, Vector3D position, double weight) {
        super(name, position, true);
        this.weight = weight;
    }
}
