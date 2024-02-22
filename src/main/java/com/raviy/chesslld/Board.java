package com.raviy.chesslld;

import com.raviy.chesslld.pieces.*;

public class Board {

    private IPiece[][] matrix = new IPiece[8][8];

    public Board() {}

    public void resetBoard() {
		for (int col=0; col<8; col++) {
            matrix[1][col] = new Pawn(Color.WHITE);
            matrix[6][col] = new Pawn(Color.BLACK);
        }

        fillRow(0, Color.WHITE);
        fillRow(7, Color.BLACK);
    }

    private void fillRow(int row, Color color) {
        matrix[row][0] = new Rook(color);
        matrix[row][1] = new Knight(color);
        matrix[row][2] = new Bishop(color);
        matrix[row][3] = new Queen(color);
        matrix[row][4] = new King(color);
        matrix[row][5] = new Bishop(color);
        matrix[row][6] = new Knight(color);
        matrix[row][7] = new Rook(color);
    }

    public IPiece getPiece(Location location) {
		return matrix[location.row()][location.col()];
    }

    public void setPiece(Location location, IPiece piece) {
        matrix[location.row()][location.col()] = piece;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
		for (int row=0; row<8; row++) {
            for (int col=0; col<8; col++) {
                builder.append((matrix[row][col]==null ? " " : "P") + " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

}
