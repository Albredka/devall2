package master;

import java.util.ArrayList;

public class Player {

    private boolean colorWhite;
    private ArrayList<Piece> pieces = new ArrayList<>();

    public Player() {
        colorWhite = true;
    }

    public Boolean getColor() {
        return this.colorWhite;
    }

    public void setBlack() {
        this.colorWhite = false;
    }

    public void setWhite() {
        this.colorWhite = true;
    }

    // Returns the entire ArrayList with all the pieces within
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    // Generates every piece of the game on theyre starting positions
    public void initializePositions(){

    } 
    
}
