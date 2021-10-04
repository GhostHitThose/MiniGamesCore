package me.ghostplugins.core.tnttag;

import me.ghostplugins.core.Arena;
import me.ghostplugins.core.MiniGamesCore;

public class TntTagArena extends Arena {
    public TntTagArena(int id) {
        super(id);
        MiniGamesCore.getInstance().log("Created TntTagArena " + id);
    }

    @Override
    public void start() {

    }
}
