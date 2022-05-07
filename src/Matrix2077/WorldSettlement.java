package Matrix2077;

import Matrix2077.elements.*;
import Matrix2077.elements.creatures.Hervibore;
import Matrix2077.elements.creatures.Predator;
import Matrix2077.elements.objects.Grass;
import Matrix2077.elements.objects.Rock;
import Matrix2077.elements.objects.Tree;

import java.util.Random;

public class WorldSettlement extends WorldMap {

    public WorldSettlement(final int width, final int height) {
        super(width, height);
    }

    public void putItems(final WorldMap worldMap) {

        for (int i = 0; i < worldMap.getCoordinates().length / 2; i++) {
            while (true) {
                int x = new Random().nextInt(worldMap.getCoordinates()[0].length - 1);
                int y = new Random().nextInt(worldMap.getCoordinates().length - 1);
                int index = x * worldMap.getCoordinates().length + y;
                if (worldMap.isEmpty(worldMap, index)) {
                    Element rock = new Rock(x, y);
                    worldMap.addEntity(rock);
                    break;
                }
            }
        }

        for (int i = 0; i < worldMap.getCoordinates().length / 2; i++) {
            while (true) {
                int x = new Random().nextInt(worldMap.getCoordinates()[0].length - 1);
                int y = new Random().nextInt(worldMap.getCoordinates().length - 1);
                int index = x * worldMap.getCoordinates().length + y;
                if (worldMap.isEmpty(worldMap, index)) {
                    Element tree = new Tree(x, y);
                    worldMap.addEntity(tree);
                    break;
                }
            }
        }

        for (int i = 0; i < worldMap.getCoordinates().length * 2; i++) {
            while (true) {
                int x = new Random().nextInt(worldMap.getCoordinates()[0].length - 1);
                int y = new Random().nextInt(worldMap.getCoordinates().length - 1);
                int index = x * worldMap.getCoordinates().length + y;
                if (worldMap.isEmpty(worldMap, index)) {
                    Element grass = new Grass(x, y);
                    worldMap.addEntity(grass);
                    break;
                }
            }
        }
    }

    public void putAnimals(final WorldMap worldMap) {

        for (int i = 0; i < worldMap.getCoordinates().length / 2; i++) {
            while (true) {
                int x = new Random().nextInt(worldMap.getCoordinates()[0].length - 1);
                int y = new Random().nextInt(worldMap.getCoordinates().length - 1);
                int index = x * worldMap.getCoordinates().length + y;
                if (worldMap.isEmpty(worldMap, index)) {
                    Creature hervibore = new Hervibore(x, y);
                    worldMap.addEntity(hervibore);
                    break;
                }
            }
        }

        for (int i = 0; i < worldMap.getCoordinates().length / 3; i++) {
            while (true) {
                int x = new Random().nextInt(worldMap.getCoordinates()[0].length - 1);
                int y = new Random().nextInt(worldMap.getCoordinates().length - 1);
                int index = x * worldMap.getCoordinates().length + y;
                if (worldMap.isEmpty(worldMap, index)) {
                    Creature predator = new Predator(x, y);
                    worldMap.addEntity(predator);
                    break;
                }
            }
        }
    }
}
