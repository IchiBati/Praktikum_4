package de.hrw.progra2.assignment4;

import java.util.Arrays;

public class PayingCustomerPlayer extends AbstractHumanParticipant{
    private double amountSpentPerMonth;
    private CanBeCarriedInInventory[] thingsWhichCanCarriedInInventory;

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
        // TODO IMPLEMENT OVERRIDE OF deductEnergy IN PAYINGCUSTOMER CLASS
    }
}
