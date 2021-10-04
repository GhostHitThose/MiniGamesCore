package me.ghostplugins.core;

import me.ghostplugins.core.utils.Colored;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class ArenaCommand implements CommandExecutor {

  private final ArrayList<String> miniGameNames;

  public ArenaCommand(){
    miniGameNames = new ArrayList<>();

    MiniGameHandler.getMiniGames().forEach((g) -> miniGameNames.add(g.getName().toLowerCase()));
  }

  public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
    if(!(sender instanceof Player)){
      MiniGamesCore.getInstance().log("Console can't perform this command.");
      return true;
    }
    if(!miniGameNames.contains(label.toLowerCase())){
      return false;
    }
    if(!(args.length > 0)){
      return false;
    }

    Player player = (Player) sender;

    if(args[0].equals("join")){
      if(ArenaHandler.inArena(player)){
        player.sendMessage(Colored.msg("&cYou must leave your current arena first."));
        return true;
      }
      if(!Objects.nonNull(ArenaHandler.getArena(Integer.parseInt(args[1])))){
        player.sendMessage(Colored.msg("&cThe arena you provided isn't a valid arena"));
        // send list
        return true;
      }

      ArenaHandler.getArena(Integer.parseInt(args[1])).addPlayer(player);
    }
    if(args[0].equals("leave")) {
      if(!ArenaHandler.inArena(player)){
        player.sendMessage(Colored.msg("&c You aren't currently in an arena. Do </" + label.toLowerCase() + " join id> to join an arena"));
        return true;
      }
      ArenaHandler.getArena(ArenaHandler.inArenaId(player)).removePlayer(player);
    }
    if(args[0].equals("list")){
      // send a list of arenas
    }


    return true;
  }

  private void sendList(){
    for(Arena arena:ArenaHandler.getArenas()){

    }
  }

}