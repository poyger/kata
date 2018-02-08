package cleancode.naming.good;

import cleancode.naming.Util;

import java.util.ArrayList;
import java.util.List;

public class Game1 {
    private static List<Cell> gameBoard = new ArrayList<>();

    private List<Cell> getFlagged() {
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoard) {
            if (cell.isFlagged()) {
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }

    public static void main(String[] args) {
        gameBoard = Util.getCellsObject();
        System.out.println(new Game1().getFlagged());
    }
}
