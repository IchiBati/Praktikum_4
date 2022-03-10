package de.hrw.progra2.assignment4;

public class AbstractHumanParticipant extends AbstractBeing{
    private String loginName;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public AbstractHumanParticipant(String name, Vector3D position, long maxEnergy, long currentEnergy, String loginName) {
        super(name, position, maxEnergy, currentEnergy);
        this.loginName = loginName;
    }
}
