package Matrix2077;

import Matrix2077.component.DataPrinter;
import Matrix2077.component.Game;
import Matrix2077.component.WorldSettlement;
import Matrix2077.model.WorldMap;

public class Launcher {

    public static void main(String[] args) {
        final Game game = new Game(new WorldMap(10, 10), new WorldSettlement(10, 10), new DataPrinter());
        game.play();
    }
}


