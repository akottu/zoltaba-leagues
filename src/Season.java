import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Season {

    private String id;
    private List<Division> divisions;
    private List<Player> players;
    private List<Player> draftOrder;

    public Season(String id) {
        this.id = id;

        if(this.id.equals("ZDFB2022")) {
            processZDFB2022();
        }
    }

    private void processZDFB2022() {
        this.divisions = new ArrayList<>(
                List.of(
                        new Division("North"),
                        new Division("South"),
                        new Division("East"),
                        new Division("West")
                ));

        this.players = new ArrayList<>();

        players.add(new Player("Anish Kottu", 1));
        players.add(new Player("Alex Frumkin", 1));
        players.add(new Player("Mihir Dutta", 1));
        players.add(new Player("Jeremy Cohen", 1));
        players.add(new Player("Dylan Zumar", 1));
        players.add(new Player("Toma Shigaki-Than", 1));
        players.add(new Player("Hunter Kaufman", 1));
        players.add(new Player("Sam Auld", 1));
        players.add(new Player("Albert Wheeler", 1));
        players.add(new Player("Michael Zheng", 1));
        players.add(new Player("Jule Cuasay", 1));
        players.add(new Player("Sahith Reddy", 1));
        players.add(new Player("Brody Trujillo", 1));
        players.add(new Player("Surya Tumbapura", 1));
        players.add(new Player("Darien Heath", 1));
        players.add(new Player("Michael Williams", 1));
        players.add(new Player("Chris Yang", 1));
        players.add(new Player("TJ Sadler", 1));
        players.add(new Player("Jacob Schuknecht", 1));
        players.add(new Player("Kody Olthof", 1));
        players.add(new Player("Alex Halsey", 1));
        players.add(new Player("Jake Clorfene", 1));
        players.add(new Player("Player 23", 1));
        players.add(new Player("Player 24", 1));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Player getPlayerByName(String name) {
        for(Division d: divisions) {
            return d.getPlayerByName(name);
        }
        return null;
    }

    public void setDivisions() {
        Collections.shuffle(players);

        for(int i = 0; i < players.size(); i++) {
            divisions.get(i % divisions.size()).getPlayers().add(players.get(i));
        }

    }

    public void displayDivisions() throws InterruptedException {
        System.out.printf("\n\n%96s\n\n", "... processing divisions ...");
        Thread.sleep(1000);

        for (Division d : this.divisions) {
            System.out.printf("%24s", d.getName().toUpperCase());
        }
        System.out.printf("\n");
        Thread.sleep(1000);
        for (int i = 0; i < players.size() / divisions.size(); i++) {
            for (int j = 0; j < divisions.size(); j++) {
                System.out.printf("%24s", divisions.get(j).getPlayers().get(i).getName());
            }
            System.out.printf("\n");
            Thread.sleep(1000);
        }

    }

    public void setDraftOrder() {
        Collections.shuffle(players);
        draftOrder = players;
    }

    public void displayDraftOrder() throws InterruptedException {
        System.out.printf("\n\n%96s\n\n", "... processing draft order ...");
        Thread.sleep(1000);

        for(int i = draftOrder.size() - 1; i >= draftOrder.size() / 2; i--) {
            System.out.printf("%8d%40s%8d%40s\n", i + 1, draftOrder.get(i).getName(), i + 1 - (draftOrder.size() / 2), draftOrder.get(i - (draftOrder.size() / 2)).getName());
            Thread.sleep(1000);
        }
    }
}
