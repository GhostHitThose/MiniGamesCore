package me.ghostplugins.core;

import lombok.Getter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Set;

public class ArenaHandler {

    @Getter
    private static final ArrayList<Arena> arenas = new ArrayList<>();

    public static void createArenas(MiniGame miniGame){
        Set<String> game = Config.getArenas(miniGame);

        for(int i = 0; i < game.size(); i++){
            miniGame.createArena(i);
        }
    }

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

    public static Arena getArena(int id){
      return arenas.get(id);
    }

    public static boolean inArena(Player player){
        for(Arena arena : arenas){
            if(arena.inArena(player)){
                return true;
            }
        }

        return false;
    }

    public static int inArenaId(Player player){
        for(Arena arena : arenas){
            if(arena.inArena(player)){
                return getArenaId(arena);
            }
        }

        return -1;
    }
}
