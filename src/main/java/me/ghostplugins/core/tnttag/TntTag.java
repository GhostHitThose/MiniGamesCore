package me.ghostplugins.core.tnttag;

import me.ghostplugins.core.Arena;
import me.ghostplugins.core.MiniGame;
import me.ghostplugins.core.tntrun.TntRunArena;

public class TntTag extends MiniGame {
    @Override
    public void createArena(int id) {
        Arena arena = new TntRunArena(id);
    }

    @Override
    public String getName() {
        return "TntTag";
    }
}
