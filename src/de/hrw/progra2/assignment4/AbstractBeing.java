package de.hrw.progra2.assignment4;

public class AbstractBeing extends  AbstractGameElement{
    private long maxEnergy;
    private long currentEnergy;

    public long getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(long maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public long getCurrentEnergy() {
        return currentEnergy;
    }

    public void setCurrentEnergy(long currentEnergy) {
        this.currentEnergy = currentEnergy;
    }

    public AbstractBeing(String name, Vector3D position, long maxEnergy, long currentEnergy) {
        super(name, position);
        this.maxEnergy = maxEnergy;
        this.currentEnergy = currentEnergy;
    }

    public boolean isLiving(){
        return this.getCurrentEnergy() > 0;
    }

    public void revive(){
        currentEnergy = maxEnergy;
    }

    public void addEnergy(long energy){
        this.currentEnergy += energy;
        if (this.currentEnergy > this.maxEnergy){
            this.currentEnergy = this.maxEnergy;
        }
    }

    public long deductEnergy(long energy){
        this.currentEnergy -= energy;
        if (this.currentEnergy < 0){
            this.currentEnergy = 0;
        }
    }

    public void eat(CanBeEaten object){
        this.addEnergy(object.getEaten());
    }

}
