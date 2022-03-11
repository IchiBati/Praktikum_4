package de.hrw.progra2.assignment4;

public class GameAdmin extends AbstractHumanParticipant {
    private boolean visibleForOtherPlayers;

    public boolean isVisibleForOtherPlayers() {
        return visibleForOtherPlayers;
    }

    public void setVisibleForOtherPlayers(boolean visibleForOtherPlayers) {
        this.visibleForOtherPlayers = visibleForOtherPlayers;
    }

    public GameAdmin(String name, Vector3D position, String loginName, boolean visibleForOtherPlayers) {
        super(name, position, 100, 100, loginName);
        this.visibleForOtherPlayers = visibleForOtherPlayers;
    }

    @Override
    public void deductEnergy(long energy) {

    }
}
