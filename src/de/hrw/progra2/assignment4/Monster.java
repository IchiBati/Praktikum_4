package de.hrw.progra2.assignment4;

public class Monster extends AbstractBeing implements CanAttack{
    private long strength;

    public long getStrength() {
        return strength;
    }

    public void setStrength(long strength) {
        this.strength = strength;
    }

    public Monster(String name, Vector3D position, long maxEnergy, long currentEnergy, long strength) {
        super(name, position, maxEnergy, currentEnergy);
        this.strength = strength;
    }

    @Override
    public void attack(AbstractBeing abstractBeing) {
        abstractBeing.deductEnergy(this.strength);
    }
}
