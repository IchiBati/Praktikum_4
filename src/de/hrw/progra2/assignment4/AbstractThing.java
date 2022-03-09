package de.hrw.progra2.assignment4;

public class AbstractThing extends AbstractGameElement{
    private boolean isVisible;

    public void setVisible(boolean visible) {
        this.isVisible = visible;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public AbstractThing(String name, Vector3D position, boolean isVisible) {
        super(name, position);
        this.isVisible = isVisible;
    }

    @Override
    public String toString() {
        return "AbstractThing{" +
                "isVisible=" + isVisible +
                "} " + super.toString();
    }
}
