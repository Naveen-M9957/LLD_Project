package main.java.oops.LLD_Real_Time_Projects.TicTacToe.model;

/**
 * WinningStrategy
 */
public interface WinningStrategy {
    boolean  checkWinner(Board board, Move move);
}
