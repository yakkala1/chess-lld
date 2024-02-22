package com.raviy.chesslld;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class Game {

    @Getter
    private final Board board;
    private final Map<Color, Player> players;
    private Color currentPlayerColor;
    private final CastlingMoveExecutor castlingMoveExecutor = CastlingMoveExecutor.getInstance();
    private final ExchangeMoveExecutor exchangeMoveExecutor = ExchangeMoveExecutor.getInstance();

    public Game(Player whitePlayer, Player blackPlayer) {
        this.players = new HashMap<>();
        players.put(Color.WHITE, whitePlayer);
        players.put(Color.BLACK, blackPlayer);

        this.board = new Board();
        board.resetBoard();
        this.currentPlayerColor = Color.WHITE;
    }

    public synchronized void makeMove(Player player, IMove move) throws IllegalMoveException {
        if (player != players.get(currentPlayerColor)) {
            throw new IllegalMoveException("Not your turn!");
        }

        // Move Executor creation
        IMoveExecutor moveExecutor;
        if (move instanceof NormalMove nMove) {
            moveExecutor = board.getPiece(nMove.getStart());
        } else if (move instanceof CastlingMove) {
            moveExecutor = castlingMoveExecutor;
        } else {
            moveExecutor = exchangeMoveExecutor;
        }

        if (!moveExecutor.isValid(this, move, currentPlayerColor)) {
            throw new IllegalMoveException("Not a valid move");
        }
        moveExecutor.makeMove(this, move, currentPlayerColor);
        currentPlayerColor = currentPlayerColor == Color.WHITE ? Color.BLACK : Color.WHITE;
    }

}
