package com.raviy.chesslld;

import lombok.Getter;

@Getter
public class NormalMove implements IMove {
    Location start, end;

    public NormalMove(Location start, Location end) {
        this.start = start;
        this.end = end;
    }
}
