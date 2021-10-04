package me.ghostplugins.core;

import me.ghostplugins.core.tntrun.TntRun;
import me.ghostplugins.core.tnttag.TntTag;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class MiniGamesCore extends JavaPlugin {

    private static MiniGamesCore main;

    @Override
    public void onLoad(){
        main = this;
    }

    @Override
    public void onEnable(){
        log("Saving default config...");

        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        log("Default config saved");

        log("Loading commands and event listeners...");

        // main plugin logic
        TntRun tntRun = new TntRun();
        TntTag tntTag = new TntTag();

        ArenaHandler.createArenas(tntRun);
        ArenaHandler.createArenas(tntTag);

        log("Enabled " + getName() + " v" + getDescription().getVersion());
    }

    public void log(String msg){ getServer().getLogger().log(Level.INFO, "[" + getName() + "] " + msg); }

    public static MiniGamesCore getInstance(){ return main; }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
