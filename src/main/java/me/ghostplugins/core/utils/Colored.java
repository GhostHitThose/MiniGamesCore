package me.ghostplugins.core.utils;

import me.ghostplugins.core.MiniGamesCore;
import org.bukkit.ChatColor;

public class Colored {
    public static String msg(String str){
        return "&c[" + MiniGamesCore.getInstance().getName() + "]" + ChatColor.translateAlternateColorCodes('&', str);
    }
}
