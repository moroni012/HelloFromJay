package cavalcanti;

import com.google.gson.Gson;

public class Game {
    //creates a member variable
    Player p;
    String gameSaved;

    //constructor
    public Game(Player _player) {
        p = _player;
    }
    public void saveGame() {
        Gson gson = new Gson();
        gameSaved = gson.toJson(p);

    }
    public static loadGame(String gameSaved) {
        String file = gameSaved;
        Gson gson = new Gson();
        Player player2 = gson.fromJson(file, Game.class);

    }
}
