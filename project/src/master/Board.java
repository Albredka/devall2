package master;

public class Board {
    private Position[][] positions = new Position[8][8];

    public Board() {
        for(int i=0; i<positions.length; i++){
            for(int subI=0; subI<positions.length; subI++){
                this.positions[i][subI] = new Position(i, subI);
            }
        }
    }

    public Position getPos(int x, int y) {
        return positions[x][y];
    }
}
