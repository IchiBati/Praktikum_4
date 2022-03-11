package de.hrw.progra2.assignment4;

public class Main {
    public static void main(String[] args) {
        AbstractGameElement[] gameElements = new AbstractGameElement[5];
        gameElements[0] = new Weapon("Schwert", new Vector3D(), 200d);
        gameElements[1] = new Fruit("Apfel", new Vector3D(), 70);
        gameElements[2] = new PayingCustomerPlayer("Sven", new Vector3D(), 100, 90, "IchiBati");
        gameElements[3] = new Monster("Zombie", new Vector3D(), 150, 150, 50);
        gameElements[4] = new Stone("Dunkler Stein", new Vector3D(), 120);

        World world = new World(gameElements);
        AbstractGameElement[] elements = GameUtil.getPotentialInventoryItems(world);
    }


}
