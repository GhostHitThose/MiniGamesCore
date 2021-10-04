package me.ghostplugins.core.tnttag;

import me.ghostplugins.core.Arena;
import me.ghostplugins.core.MiniGamesCore;
import me.ghostplugins.core.MiniGame;

public class TntTagArena extends Arena {
    public TntTagArena(int id, MiniGame miniGame) {
        super(id, miniGame);
        MiniGamesCore.getInstance().log("Created " + miniGame.getName() + " Arena " + id);
    }

    @Override
    public void start() {

    }
}
