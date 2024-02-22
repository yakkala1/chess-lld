package com.raviy.chesslld.pieces;

import com.raviy.chesslld.*;

public class Pawn extends BasePiece implements IMoveExecutor {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean isValid(Game game, IMove m, Color playerColor) {
        NormalMove move = (NormalMove) m;
        Location start = move.getStart();
        Location end = move.getEnd();

        if (game.getBoard().getPiece(move.getStart()).getColor() != playerColor)  {
            return false;
        }

        int rowDiff = end.row() - start.row();

        if (playerColor.equals(Color.WHITE) && rowDiff<=0)
            return false;

        if (playerColor.equals(Color.BLACK) && rowDiff>=0)
            return false;

        if (start.col() != end.col()) {
            // has to be cross move
            if ((Math.abs(start.col() - end.col()) != 1) ||
                    (game.getBoard().getPiece(end) == null) ||
                    (game.getBoard().getPiece(end).getColor() == playerColor))
            {
                return false;
            }
        }

        if (Math.abs(end.row() - start.row()) == 2) {
            if (playerColor == Color.WHITE && start.row() != 1)
                return false;

            if (playerColor == Color.BLACK && start.row() != 6)
                return false;

//            checkNoPiecesInBetween(start, end, true);
        } else if (Math.abs(end.row() - start.row()) != 1) {
            return false;
        }

        // more logic

        return true;
    }

}
