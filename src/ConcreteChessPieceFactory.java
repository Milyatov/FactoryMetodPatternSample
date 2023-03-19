
public class ConcreteChessPieceFactory implements ChessPieceFactory {


    @Override
    public ChessPiece createChessPiece(Letters rank, Num row) {
        if (row == Num.TWO || row == Num.SEVEN){
            return new Pawn();
        } else if ((rank == Letters.B || rank == Letters.G) && (row == Num.ONE || row == Num.EIGHT)){
            return new Knight();
        }
        return null;
    }
}
