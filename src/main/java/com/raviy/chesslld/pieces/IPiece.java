package com.raviy.chesslld.pieces;

import com.raviy.chesslld.Color;
import com.raviy.chesslld.IMoveExecutor;

public interface IPiece extends IMoveExecutor {
    public Color getColor();
}