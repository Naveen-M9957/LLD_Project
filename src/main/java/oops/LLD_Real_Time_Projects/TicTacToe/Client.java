package main.java.oops.LLD_Real_Time_Projects.TicTacToe;

import main.java.oops.LLD_Real_Time_Projects.TicTacToe.controller.GameController;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Game;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.HumanPlayer;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Symbol;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.WinningStrategy;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.Player;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.model.enums.PlayerType;
import main.java.oops.LLD_Real_Time_Projects.TicTacToe.stretegy.RowWinningStretegy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello, Tic Tac Toe!");
        int boardSize = 3; // Set the desired board size
        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer("Player 1", new Symbol('x',"P1"),PlayerType.HUMAN, 1));
        players.add(new HumanPlayer("Player 2", new Symbol('o',"P2"),PlayerType.HUMAN, 2));
        List<WinningStrategy> winningStrategies = List.of(new RowWinningStretegy());

        GameController gameController = new GameController();
        Game game = gameController.startGame(boardSize, players, winningStrategies);
        
    }
}
