package de.hrw.progra2.assignment4;

public class MarzipanWeapon extends Weapon implements CanBeEaten{

    public MarzipanWeapon(String name, Vector3D position, double cost) {
        super(name, position, cost);
    }

    @Override
    public long getEaten() {
        this.setVisible(false);
        return 50;
    }
}
