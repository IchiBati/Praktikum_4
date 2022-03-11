package de.hrw.progra2.assignment4;

public class GameUtil {
    /**
     * Lets a being eat some stuff.
     * @param being being
     * @param stuff list of objects, only edible objects are actually eaten
     */
    public static void eatStuff(AbstractBeing being, Object[] stuff) {
        for (Object s : stuff) {
            if (s instanceof CanBeEaten) {
                being.eat((CanBeEaten) s);
            }
        }
    }

    /**
     * Returns all object in a world that can be put into an inventory.
     *
     * @param world world
     * @return array of elements
     */
    public static AbstractGameElement[] getPotentialInventoryItems(World world) {
        AbstractGameElement[] CanBeCarried = new AbstractGameElement[world.getGameElements().length];
        for (int i = 0; i < world.getGameElements().length; ++i) {
            if (world.getGameElements()[i] instanceof CanBeCarriedInInventory) {
                CanBeCarried[i] = world.getGameElements()[i];
            }
        }
        return CanBeCarried;
    }

    /**
     * Compute the monthly revenue that this world generates.
     * @param world world
     * @return monthly revenue
     */
    /**   public static double getMonthlyProfit (World world){
     // TODO: Implement
     }
     **/
}
