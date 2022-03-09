package de.hrw.progra2.assignment4;

public abstract class AbstractGameElement {
    private String name;
    private Vector3D position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector3D getPosition(){
        return new Vector3D(this.position.getX(),this.position.getY(), this.position.getZ());

    }

    public void setPosition(Vector3D position){
        this.position = new Vector3D(position.getX(), position.getY(), position.getZ());
    }

    public AbstractGameElement(String name, Vector3D position){
        this.name = name;
        this.position = new Vector3D(position.getX(), position.getY(), position.getZ());
    }

    @Override
    public String toString() {
        return "AbstractGameElement{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
