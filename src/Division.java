import java.util.ArrayList;
import java.util.List;

public class Division {


    private List<Player> players;
    private String name;

    public Division(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public Division(String name) {
        this(name, new ArrayList<>());
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayerByName(String name) {
        for(Player p: players) {
            if(p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }
}
