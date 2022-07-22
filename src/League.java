import java.util.ArrayList;
import java.util.List;

public class League {

    private String name;
    private String description;
    private List<Season> seasons;

    public League(String name, String description, List<Season> seasons) {
        this.name = name;
        this.description = description;
        this.seasons = seasons;
    }

    public League(String name) {
        this(name, "", new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public Season getSeason(String id) {
        for(Season s: this.seasons) {
            if(id.equals(s.getId())) {
                return s;
            }
        }
        return null;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }

    public Player getPlayerByName(String name) {
        for(Season s: this.seasons) {
            return s.getPlayerByName(name);
        }
        return null;
    }
}
