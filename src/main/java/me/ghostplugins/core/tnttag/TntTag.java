package me.ghostplugins.core.tnttag;

import me.ghostplugins.core.Arena;
import me.ghostplugins.core.MiniGame;
import me.ghostplugins.core.tntrun.TntRunArena;

public class TntTag extends MiniGame {

    public TntTag(){
        setName("TntTag");
    }

    @Override
    public void createArena(int id) {
        Arena arena = new TntRunArena(id, this);
    }

    @Override
    public String getName() {
        return getName();
    }
}
