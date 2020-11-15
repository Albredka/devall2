package master;

public class Kings extends Piece {

    public Kings(boolean alive, int x, int y) {
        super(alive, x, y);
    }

    @Override
    public boolean validMove(Board board, int fromX, int fromY, int toX, int toY) {

        //Checks if the build of the movement is correctly done.
        if(super.validMove(board, fromX, fromY, toX, toY) == false)
            return false;

        //Checks if the movement is valid for a King
        if(true){
            return true;
        }

        return false;
    }
}


