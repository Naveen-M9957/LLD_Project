package main.java.oops.LLD_Real_Time_Projects.TicTacToe.stretegy;

import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Board;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Move;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Symbol;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.WinningStrategy;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStretegy implements  WinningStrategy {
    private Map<Symbol, Integer> HM[];

    public RowWinningStretegy() {
        // Initialize the playerRowCountMap with players and their row counts
        this.HM = new HashMap[3]; // Assuming a 3x3 board
        for (int i = 0; i < 3; i++) {
            HM[i] = new HashMap<>();
        }
    }

    @Override
    public boolean checkWinner(Board board, Move move) {
        // Implement the logic to check for a winning condition in rows
        /**
         * brute force approach  (TC=O(n^2)  and  SC=O(1))
         * for(int i=0;i<board.getSize();i++){
         *    int winner= true;
         *    Symbol playerSymbol = move.getPlayer().getSymbol();
         *    for(int j=0;j<board.getSize();j++){
         *      if(board.getCell(i,j).getSymbol()!=playerSymbol){
         *          winner=false;
         *          break;
         *      }
         *      if(winner){
         *          return true;
         *      }
         *    }
         * }
         * 
         */
        int currRow  = move.getCell().getRow(); 
        Symbol playerSymbol = move.getPlayer().getSymbol(); 
        HM[currRow].put(playerSymbol, HM[currRow].getOrDefault(playerSymbol, 0) + 1);
        return HM[currRow].getOrDefault(playerSymbol, 0) == board.getSize();
    }    
}
