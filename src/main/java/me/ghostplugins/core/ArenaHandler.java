package me.ghostplugins.core;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class ArenaHandler {

    private static final ArrayList<Arena> arenas = new ArrayList<>();

    public static void createArenas(MiniGame miniGame){
        Set<String> game = Objects.requireNonNull(MiniGamesCore.getInstance().getConfig().getConfigurationSection("TntRun.arenas")).getKeys(false);

        for(int i = 0; i < game.size(); i++){
            miniGame.createArena(i);
        }
    }

    public static ArrayList<Arena> getArenas(){ return arenas; }

    public static int getArenaId(Arena arena){
        if(arenas.contains(arena)){
            for(Arena a:arenas){
                if(a.equals(arena)){
                    return arena.getId();
                }
            }
        }
        return -1;
    }
}
