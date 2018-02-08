package cleancode.naming.good;

public class Cell {
    private static final int FLAGGED = 4;
    private final int i;
    private final int i1;

    public Cell(int i, int i1) {
        this.i = i;
        this.i1 = i1;
    }

    public boolean isFlagged() {
        if (i == FLAGGED)
            return true;
        return false;
    }
}
