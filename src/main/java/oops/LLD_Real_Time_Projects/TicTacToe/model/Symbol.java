package main.java.oops.LLD_Real_Time_Projects.TicTacToe.model;

/**
 * Symbol
 */
public class Symbol {
    private char x;
    private String name;
    
    public Symbol(char x, String name) {
        this.x = x;
        this.name = name;
    }

    public char getX() {
        return x;
    }

    public String getName() {
        return name;
    }

    public void setX(char x) {
        this.x = x;
    }

    public void setName(String name) {
        this.name = name;
    }
}
