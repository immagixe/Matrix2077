package Matrix2077;

public class Launcher {

    public static void main(String[] args) {
        final Game game = new Game(new WorldMap(10, 10), new WorldSettlement(10, 10), new DataPrinter());
        game.play();
    }
}


