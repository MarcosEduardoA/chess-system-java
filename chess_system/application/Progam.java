package chess_system.application;

import chess_system.application.board_game.Board;
import chess_system.chess.ChessMatch;

public class Progam {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}