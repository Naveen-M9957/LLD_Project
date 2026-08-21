package main.java.oops.LLD_Real_Time_Projects.TicTacToe.model;

/**
 * Move
 */
public class Move {
    private Player player;
    private Cell cell;

    public Move(Player player, Cell cell) {
        this.player = player;
        this.cell = cell;
    }

    public Player getPlayer() {
        return player;
    }

    public Cell getCell() {
        return cell;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
