package main.java.oops.LLD_Real_Time_Projects.TicTacToe.stretegy;

import java.util.HashMap;
import java.util.Map;

import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Board;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Move;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Symbol;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.WinningStrategy;

public class DiagoalWiningStretegy implements WinningStrategy {
    Map<Symbol, Integer> mainDiagonalCount;
    Map<Symbol, Integer> antiDiagonalCount;

    public DiagoalWiningStretegy() {
        // Initialize the playerRowCountMap with players and their row counts
        this.mainDiagonalCount = new HashMap<>();
        this.antiDiagonalCount = new HashMap<>();
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        // Implement the logic to check for a winning condition in diagonals
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        
        // Check if the move is on the main diagonal
        if(row == col) {
            mainDiagonalCount.put(move.getPlayer().getSymbol(), 
                        mainDiagonalCount.getOrDefault(move.getPlayer().getSymbol(), 0) + 1);
        }

        // Check if the move is on the anti-diagonal
        if(row + col == board.getSize() - 1) {
            antiDiagonalCount.put(move.getPlayer().getSymbol(), 
                        antiDiagonalCount.getOrDefault(move.getPlayer().getSymbol(), 0) + 1);
        }
       
        return mainDiagonalCount.getOrDefault(move.getPlayer().getSymbol(), 0) == board.getSize() ||
               antiDiagonalCount.getOrDefault(move.getPlayer().getSymbol(), 0) == board.getSize();  

        // Check the main diagonal (top-left to bottom-right)
        /**
         * Main Diagoal
         * (0,0) (1,1) (2,2)
         * 
        if (row == col) {
            boolean mainDiagonalWin = true;
            for (int i = 0; i < board.getSize(); i++) {
                if (board.getCells(i, i).getSymbol() != playerSymbol) {
                    mainDiagonalWin = false;
                    break;
                }
            }
            if (mainDiagonalWin) {
                return true;
            }
        }
        */

        // Check the anti-diagonal (top-right to bottom-left)
        /**
         * Anti Diagoal
         * (0,2) (1,1) (2,0)
        if (row + col == board.getSize() - 1) {
            boolean antiDiagonalWin = true;
            for (int i = 0; i < board.getSize(); i++) {
                if (board.getCells(i, board.getSize() - 1 - i).getSymbol() != playerSymbol) {
                    antiDiagonalWin = false;
                    break;
                }
            }
            if (antiDiagonalWin) {
                return true;
            }
        }
         */
    }
    
}
