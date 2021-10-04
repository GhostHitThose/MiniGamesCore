package me.ghostplugins.core.tntrun;

import me.ghostplugins.core.Arena;
import me.ghostplugins.core.MiniGamesCore;

public class TntRunArena extends Arena {
    public TntRunArena(int id) {
        super(id);
        MiniGamesCore.getInstance().log("Created TntRunArena " + id);
    }

    @Override
    public void start() {

    }
}
