public class Pawn implements ChessPiece {

    public final String MOVE = "1 forward";

    @Override
    public String getMove() {
        return this.MOVE;
    }
}
