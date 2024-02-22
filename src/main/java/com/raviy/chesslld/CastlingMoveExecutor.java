package com.raviy.chesslld;

public class CastlingMoveExecutor implements IMoveExecutor {
    private static CastlingMoveExecutor instance = new CastlingMoveExecutor();

    public static CastlingMoveExecutor getInstance() {
        return instance;
    }

    @Override
    public boolean isValid(Game game, IMove move, Color playerColor) {
        return false;
    }

    @Override
    public void makeMove(Game game, IMove move, Color playerColor) {
    }
}
