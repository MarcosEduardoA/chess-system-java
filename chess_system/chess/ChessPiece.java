package chess_system.application.chess;

import board_game.Piece;
import chess_system.application.board_game.Board;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
