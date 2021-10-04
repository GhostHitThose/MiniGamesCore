package me.ghostplugins.core.tntrun;

import me.ghostplugins.core.Arena;
import me.ghostplugins.core.MiniGame;

public class TntRun extends MiniGame {
    @Override
    public void createArena(int id) {
        Arena arena = new TntRunArena(id);
    }

    @Override
    public String getName() {
        return "TntRun";
    }
}
