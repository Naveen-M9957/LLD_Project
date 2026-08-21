package main.java.oops.LLD_Real_Time_Projects.TicTacToe.model;

import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.enums.PlayerType;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, Symbol symbol, PlayerType playerType, int playerId) {
        super(name, symbol, PlayerType.HUMAN, playerId);
    }
    
}
