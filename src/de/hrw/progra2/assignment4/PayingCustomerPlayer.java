package de.hrw.progra2.assignment4;

import java.util.Arrays;

public class PayingCustomerPlayer extends AbstractHumanParticipant {
    private double amountSpentPerMonth;
    private CanBeCarriedInInventory[] thingsWhichCanCarriedInInventory;

    public PayingCustomerPlayer(String name, Vector3D position, long maxEnergy, long currentEnergy, String loginName) {
        super(name, position, maxEnergy, currentEnergy, loginName);
    }

    public double getAmountSpentPerMonth() {
        return amountSpentPerMonth;
    }

    public void setAmountSpentPerMonth(double amountSpentPerMonth) {
        this.amountSpentPerMonth = amountSpentPerMonth;
    }

    public CanBeCarriedInInventory[] getThingsWhichCanCarriedInInventory() {
        return Arrays.copyOf(this.thingsWhichCanCarriedInInventory, thingsWhichCanCarriedInInventory.length);
    }

    public void setThingsWhichCanCarriedInInventory(CanBeCarriedInInventory[] thingsWhichCanCarriedInInventory) {
        this.thingsWhichCanCarriedInInventory = Arrays.copyOf(thingsWhichCanCarriedInInventory, thingsWhichCanCarriedInInventory.length);
    }

    @Override
    public void deductEnergy(long energy) {
        super.deductEnergy(energy);
        if (!isLiving()) {
            setPosition(new Vector3D());
            revive();
        }

    }
}
