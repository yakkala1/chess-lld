package com.raviy.chesslld.pieces;

import com.raviy.chesslld.*;
import lombok.Getter;

public abstract class BasePiece implements IPiece {
    @Getter
    Color color;

    public BasePiece(Color color) {
        this.color = color;
    }

    // Can be used only for Normal Moves, is overridden in case of special moves like CastlingMove, ExchangeMove, etc.
    public void makeMove(Game game, IMove m, Color playerColor) {
        Board board = game.getBoard();

        if (!isValid(game, m, playerColor))
            throw new IllegalMoveException("Not a valid move");

        NormalMove move = (NormalMove) m;
        board.setPiece(move.getEnd(), board.getPiece(move.getStart()));
        board.setPiece(move.getStart(), null);
    }
}
