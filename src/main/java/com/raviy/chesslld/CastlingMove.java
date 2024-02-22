package com.raviy.chesslld;

import lombok.Getter;

@Getter
public class CastlingMove implements IMove {
    Location rookPosition, kingPosition;
}
