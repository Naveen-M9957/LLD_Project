package main.java.oops.LLD_Real_Time_Projects.TicTacToe.model;

import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.enums.PlayerType;

public class BotPlayer extends  Player {
    public BotPlayer(String name, Symbol symbol, PlayerType playerType, int playerId) {
        super(name, symbol, PlayerType.BOT, playerId);
    }
}
