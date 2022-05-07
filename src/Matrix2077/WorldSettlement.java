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

    public void putItems() {

        for (int i = 0; i < this.getCoordinates().length / 2; i++) {
            while (true) {
                int x = new Random().nextInt(this.getCoordinates()[0].length - 1);
                int y = new Random().nextInt(this.getCoordinates().length - 1);
                int index = x * this.getCoordinates().length + y;
                if (this.isEmpty(index)) {
                    Element rock = new Rock(x, y);
                    this.addEntity(rock);
                    break;
                }
            }
        }

        for (int i = 0; i < this.getCoordinates().length / 2; i++) {
            while (true) {
                int x = new Random().nextInt(this.getCoordinates()[0].length - 1);
                int y = new Random().nextInt(this.getCoordinates().length - 1);
                int index = x * this.getCoordinates().length + y;
                if (this.isEmpty(index)) {
                    Element tree = new Tree(x, y);
                    this.addEntity(tree);
                    break;
                }
            }
        }

        for (int i = 0; i < this.getCoordinates().length * 2; i++) {
            while (true) {
                int x = new Random().nextInt(this.getCoordinates()[0].length - 1);
                int y = new Random().nextInt(this.getCoordinates().length - 1);
                int index = x * this.getCoordinates().length + y;
                if (this.isEmpty(index)) {
                    Element grass = new Grass(x, y);
                    this.addEntity(grass);
                    break;
                }
            }
        }
    }

    public void putAnimals() {

        for (int i = 0; i < this.getCoordinates().length / 2; i++) {
            while (true) {
                int x = new Random().nextInt(this.getCoordinates()[0].length - 1);
                int y = new Random().nextInt(this.getCoordinates().length - 1);
                int index = x * this.getCoordinates().length + y;
                if (this.isEmpty(index)) {
                    Creature hervibore = new Hervibore(x, y);
                    this.addEntity(hervibore);
                    break;
                }
            }
        }

        for (int i = 0; i < this.getCoordinates().length / 3; i++) {
            while (true) {
                int x = new Random().nextInt(this.getCoordinates()[0].length - 1);
                int y = new Random().nextInt(this.getCoordinates().length - 1);
                int index = x * this.getCoordinates().length + y;
                if (this.isEmpty(index)) {
                    Creature predator = new Predator(x, y);
                    this.addEntity(predator);
                    break;
                }
            }
        }
    }
}
