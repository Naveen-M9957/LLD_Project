package main.java.oops.LLD_Real_Time_Projects.TicTacToe.model;

import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.enums.PlayerType;

/**
 * Player
 */
public abstract class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    private int playerId;

    public Player(String name, Symbol symbol, PlayerType playerType, int playerId) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
}
