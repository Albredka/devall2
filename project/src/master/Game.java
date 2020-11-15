package master;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;

    public Game(){
        board = new Board();
    }

    public Game(int time, int minsPerPlayer, int incrementalSec){

        // Time: Unlimited or RealTime
        // minsPerPlayer: 0 - 200 minuts
        // incrementalSec: 0 - 200 seconds

    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }


    public void initializeBoard() {
        
        this.board = new Board();
        for(int i=0; i<player1.getPieces().size(); i++){
            
        }
    }  
}
