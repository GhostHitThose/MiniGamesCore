package me.ghostplugins.core.tntrun;

import me.ghostplugins.core.Arena;
import me.ghostplugins.core.MiniGame;

public class TntRun extends MiniGame {

    public TntRun(){
        setName("TntRun");
    }

    @Override
    public void createArena(int id) {
        Arena arena = new TntRunArena(id, this);
    }
}
