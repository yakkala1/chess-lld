package com.raviy.chesslld;

public interface IMoveExecutor {
    boolean isValid(Game game, IMove move, Color playerColor);
    void makeMove(Game game, IMove move, Color playerColor);
}
