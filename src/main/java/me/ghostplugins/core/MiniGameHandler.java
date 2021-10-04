package me.ghostplugins.core;

import me.ghostplugins.core.tntrun.TntRun;
import me.ghostplugins.core.tnttag.TntTag;
import java.util.ArrayList;

public class MiniGameHandler {

  private static final ArrayList<MiniGame> miniGames = new ArrayList<>();

  public static void loadMiniGames(){

      // Make minigame instances
      TntRun tntRun = new TntRun();
      TntTag tntTag = new TntTag();

      miniGames.add(tntRun);
      miniGames.add(tntTag);


      // Initialize arenas for each minigame
      for(MiniGame miniGame:miniGames){
        ArenaHandler.createArenas(miniGame);
      }
  }

  public static ArrayList<MiniGame> getMiniGames(){
    return miniGames;
  }
}