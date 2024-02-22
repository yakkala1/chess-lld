package com.raviy.chesslld;

import lombok.Getter;

@Getter
public class Player {
    private String name;
    private String id;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
