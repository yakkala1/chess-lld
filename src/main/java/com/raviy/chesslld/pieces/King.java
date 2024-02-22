package com.raviy.chesslld.pieces;

import com.raviy.chesslld.Color;
import com.raviy.chesslld.Game;
import com.raviy.chesslld.IMove;
import com.raviy.chesslld.IMoveExecutor;

public class King extends BasePiece implements IMoveExecutor {
    public King(Color color) {
        super(color);
    }

    @Override
    public boolean isValid(Game game, IMove move, Color playerColor) {
        return false;
    }

    @Override
    public void makeMove(Game game, IMove move, Color playerColor) {
    }
}
