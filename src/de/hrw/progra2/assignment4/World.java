package de.hrw.progra2.assignment4;

import java.util.Arrays;

public class World {
    private AbstractGameElement[] gameElements;

    public AbstractGameElement[] getGameElements() {
        return Arrays.copyOf(gameElements, gameElements.length);
    }

    public void setGameElements(AbstractGameElement[] gameElements) {
        this.gameElements = Arrays.copyOf(gameElements, gameElements.length);
    }

    public void addGameElement(AbstractGameElement gameElement) {
        this.gameElements = Arrays.copyOf(this.gameElements, gameElements.length + 1);
        this.gameElements[gameElements.length - 1] = gameElement;
    }

    public World() {
        gameElements = new AbstractGameElement[1];
    }

    public World(AbstractGameElement[] gameElements) {
        this.gameElements = Arrays.copyOf(gameElements, gameElements.length);
    }


}
