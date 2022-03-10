package de.hrw.progra2.assignment4;

public class Fruit extends AbstractThing implements CanBeEaten, CanBeCarriedInInventory{
    long calories;

    public long getCalories() {
        return calories;
    }

    public void setCalories(long calories) {
        this.calories = calories;
    }

    public Fruit(String name, Vector3D position, long calories) {
        super(name, position, true);
        this.calories = calories;
    }

    @Override
    public long getEaten(){
        if (this.isVisible()){
            this.setVisible(false);
            return calories;

        }
        return 0;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "calories=" + calories +
                "} " + super.toString();
    }
}
