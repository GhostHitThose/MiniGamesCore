package me.ghostplugins.core.tntrun;

import me.ghostplugins.core.Arena;
import me.ghostplugins.core.MiniGamesCore;
import me.ghostplugins.core.MiniGame;

public class TntRunArena extends Arena {
    public TntRunArena(int id, MiniGame miniGame) {
        super(id, miniGame);
        MiniGamesCore.getInstance().log("Created " + miniGame.getName() + " Arena " + id);
    }

    @Override
    public void start() {

    }
}
