package me.ghostplugins.core;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.UUID;
import java.util.HashMap;

public abstract class Arena {

    @Getter
    private final ArrayList<UUID> players;
    private final HashMap<UUID, Location> playersLoc;
    @Getter
    private final int id;
    private final MiniGame miniGame;

    public Arena(int id, MiniGame miniGame){
        players = new ArrayList<>();
        playersLoc = new HashMap<>();
        this.id = id;
        this.miniGame = miniGame;
    }

    public void addPlayer(Player player){
        player.teleport(Config.getLobbySpawn(miniGame));
        players.add(player.getUniqueId());
        playersLoc.put(player.getUniqueId(), player.getLocation());

        if(players.size() >= Config.getRequiredPlayers(miniGame)){
          this.start();
        }
    }

    public void removePlayer(Player player){
        players.remove(player.getUniqueId());
        player.teleport(playersLoc.get(player.getUniqueId()));
        playersLoc.remove(player.getUniqueId());
    }

    public boolean inArena(Player player){
        return players.contains(player.getUniqueId());
    }

    public abstract void start();
}
