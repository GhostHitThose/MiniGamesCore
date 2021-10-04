package me.ghostplugins.core;

import lombok.Getter;
import lombok.Setter;

public abstract class MiniGame {
    public abstract void createArena(int id);
    @Getter
    @Setter
    private String name;
}
