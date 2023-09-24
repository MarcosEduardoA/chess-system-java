package chess_system.chess_pieces;

import chess_system.board_game.Board;
import chess_system.chess.ChessPiece;
import chess_system.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
    
}
