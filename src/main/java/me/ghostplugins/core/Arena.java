package me.ghostplugins.core;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Arena {

    private final ArrayList<UUID> players;
    private final int id;

    public Arena(int id){
        players = new ArrayList<>();
        this.id = id;
    }

    public void addPlayer(Player player){
        players.add(player.getUniqueId());
    }

    public void removePlayer(Player player){
        players.remove(player.getUniqueId());
    }

    public int getId(){ return id; }

    public abstract void start();
}
