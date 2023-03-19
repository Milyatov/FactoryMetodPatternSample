public class Main {

    ChessPieceFactory factory = new ConcreteChessPieceFactory();

    public Main(){
        for (Num n: Num.values()){
            for (Letters l: Letters.values()){
                if (factory.createChessPiece(l, n) != null) {
                    System.out.println(factory.createChessPiece(l, n).getMove());
                }
            }
        }

    }
    public static void main(String[] args) {
        new Main();
    }
}