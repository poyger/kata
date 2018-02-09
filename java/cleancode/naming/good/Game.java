package cleancode.naming.good;

import cleancode.naming.Util;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private static final int FLAGGED = 4;
    private static List<int[]> gameBoard = new ArrayList<>();

    private List<int[]> getFlagged() {
        List<int[]> flaggedCells = new ArrayList<>();
        for (int[] cell : gameBoard) {
            if (cell[0] == FLAGGED) {
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }

    public static void main(String[] args) {
        gameBoard = Util.getCells();
        System.out.println(new Game().getFlagged());
    }
}
