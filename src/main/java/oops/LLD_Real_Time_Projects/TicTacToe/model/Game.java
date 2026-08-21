package main.java.oops.LLD_Real_Time_Projects.TicTacToe.model;


import main.java.oops.LLD_Real_Time_Projects.TicTacToe.Exception.InvalidWinningStrategyException;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.Exception.InvalidBoardException;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.Exception.InvalidPlayerException;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.enums.GameStatus;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.stretegy.RowWinningStretegy;

import java.util.List;
import java.util.ArrayList;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private GameStatus gameStatus;
    private Player winner;
    private int currentPlayer;
    private List<WinningStrategy> winningStrategies;

    public static GameBuilder getBuilder() {
        return new GameBuilder();
    }

    private Game(List<Player> players, Board board, List<WinningStrategy> winningStrategies) {
        this.players = players;
        this.board = board;
        this.winningStrategies = winningStrategies;
        this.currentPlayer = 0;
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.winner = null;
        this.moves = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }
    
    public Board getBoard() {
        return board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public static class GameBuilder {
        private List<Player> players;
        private Board board;
        private List<WinningStrategy> winningStrategies;

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public GameBuilder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public GameBuilder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Game build() {
            validate();
            return new Game(players, board, winningStrategies);
        }

        private void validate() {
            if (players == null || players.size() < 2) {
                throw new InvalidPlayerException("At least two players are required to start the game.");
            }
            if (board == null) {
                throw new InvalidBoardException("Board cannot be null.");
            }
            if (winningStrategies == null || winningStrategies.isEmpty()) {
                throw new InvalidWinningStrategyException("At least one winning strategy is required.");
            }
        }
    }
}
