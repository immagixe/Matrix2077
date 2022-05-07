package Matrix2077;

public class Game {

    private final WorldMap worldMap;

    private final WorldSettlement worldSettlement;

    private final DataPrinter dataPrinter;

    public Game(final WorldMap worldMap,
                final WorldSettlement worldSettlement,
                final DataPrinter dataPrinter) {
        this.worldMap = worldMap;
        this.worldSettlement = worldSettlement;
        this.dataPrinter = dataPrinter;
    }

    public void play() {

        worldSettlement.putItems(worldMap);
        worldSettlement.putAnimals(worldMap);

        System.out.println("Welcome to world simulation \"Matrix 2077\"");
        System.out.println("▲ - rock, ♰ - tree, ✶ - grass");
        System.out.println("ꭥ - hervibore, X - predator");
        dataPrinter.printWorldMap(worldMap);

    }
}












        /*

        int width = 10;
        int height = 10;

        DataPrinter dataPrinter = new DataPrinter();
        InanimateWorld inanimateWorld = new InanimateWorld(width, height);

        Element element1 = new Rock(0, 0);
        Element element2 = new Element(2, 4, 'P');
        Element element3 = new Element(2, 1, 'U');
        WorldMap worldMap = new WorldMap(width, height);

        inanimateWorld.putItems(worldMap);

        worldMap.addEntity(element1);
        worldMap.addEntity(element2);
        worldMap.addEntity(element3);

        dataPrinter.printWorldMap(worldMap);

         */

