package com.raviy.chesslld;

public class ExchangeMoveExecutor implements IMoveExecutor {
    private static ExchangeMoveExecutor instance = new ExchangeMoveExecutor();

    public static ExchangeMoveExecutor getInstance() {
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
