package main.java.oops.LLD_Real_Time_Projects.TicTacToe.model;

//import java.util.List;
//import java.util.ArrayList;

/**
 * Board
 */
public class Board {
    private int size;
    //private List<List<Cell>> cells;
    private Cell[][] cells;

    public Board(int size) {
        this.size = size;
        /*this.cells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(new Cell());
            }
            cells.add(row);
        }*/
        this.cells = new Cell[size][size];
    }

    public int getSize() {
        return size;
    }
    
    public Cell[][] getCells(int i, int i2) {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
