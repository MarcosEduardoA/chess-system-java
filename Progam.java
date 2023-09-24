import chess_system.application.UI;
import chess_system.chess.ChessMatch;

public class Progam {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
