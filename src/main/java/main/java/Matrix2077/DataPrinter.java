package main.java.Matrix2077;

public class DataPrinter {

    public void printWorldMap(final WorldMap worldMap) {
        cleanConsoleOutput();
        System.out.println("Welcome to world simulation \"Matrix 2077\"");
        System.out.println("A - rock, T - tree, \" - grass");
        System.out.println("O - hervibore, X - predator");
        int borderDrawingLength = worldMap.getWorld().size() / worldMap.width;
        int borderDrawingLengthOld = borderDrawingLength;
        drawBorders(borderDrawingLength);
        for (int i = 0; i < worldMap.getWorld().size(); i++) {
            System.out.print("| " + worldMap.getWorld().get(i).getType() + " ");
            if (i == borderDrawingLengthOld - 1) {
                System.out.println("|");
                borderDrawingLengthOld += borderDrawingLength;
            }
        }
        drawBorders(borderDrawingLength);
    }

    private void drawBorders(final int borderDrawingLength) {
        System.out.print("|");
        for (int i = 0; i < borderDrawingLength; i++) {
            System.out.print("||||");
        }
        System.out.println();
    }

    public static void cleanConsoleOutput() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}
