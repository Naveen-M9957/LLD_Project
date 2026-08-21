package main.java.oops.LLD_Real_Time_Projects.TicTacToe.controller;

import java.util.List;

import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Game;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Player;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Board;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.WinningStrategy;

public class GameController {
    public Game startGame(int boardSize, List<Player> players,
            List<WinningStrategy> winningStrategies) {
        Board board = new Board(boardSize);
        return Game.getBuilder()
                    .setBoard(board)
                    .setPlayers(players)
                    .setWinningStrategies(winningStrategies)
                    .build();
    }
}
