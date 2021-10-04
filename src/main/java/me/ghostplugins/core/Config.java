package me.ghostplugins.core;

import org.bukkit.Location;
import java.util.Objects;
import java.util.Set;
import org.bukkit.Bukkit;

public class Config {
  public static Set<String> getArenas(MiniGame miniGame){
    return Objects.requireNonNull(MiniGamesCore.getInstance().getConfig().getConfigurationSection(miniGame.getName() + ".arenas")).getKeys(false);
  }

  public static int getRequiredPlayers(MiniGame miniGame){ return MiniGamesCore.getInstance().getConfig().getInt(miniGame.getName() + ".required-players"); }

  public static Location getLobbySpawn(MiniGame miniGame){
    return new Location(
      Bukkit.getWorld(Objects.requireNonNull(MiniGamesCore.getInstance().getConfig().getString(miniGame.getName() + ".lobby.world"))),
      MiniGamesCore.getInstance().getConfig().getDouble(miniGame.getName()+".lobby.z"),
      MiniGamesCore.getInstance().getConfig().getInt(miniGame.getName()+".lobby.yaw"),
      MiniGamesCore.getInstance().getConfig().getInt(miniGame.getName()+".lobby.pitch")
    );
  }

    public static Location getArenaSpawn(MiniGame miniGame, int id){
    return new Location(
      Bukkit.getWorld(Objects.requireNonNull(MiniGamesCore.getInstance().getConfig().getString(miniGame.getName() + ".arenas." + id + ".world"))),
      MiniGamesCore.getInstance().getConfig().getDouble(miniGame.getName()+".arenas." + id + ".x"),
      MiniGamesCore.getInstance().getConfig().getDouble(miniGame.getName()+".arenas." + id + ".y"),
      MiniGamesCore.getInstance().getConfig().getDouble(miniGame.getName()+".arenas." + id + ".z"),
      MiniGamesCore.getInstance().getConfig().getInt(miniGame.getName()+".arenas." + id + ".yaw"),
      MiniGamesCore.getInstance().getConfig().getInt(miniGame.getName()+".arenas." + id + ".pitch")
    );
  }
}