public class Player {

    private String name;
    private int weight;
    private int draftSpot;

    public Player(String name, int weight, int draftSpot) {
        this.name = name;
        this.weight = weight;
        this.draftSpot = draftSpot;
    }

    public Player(String name, int weight) {
        this(name, weight, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDraftSpot() {
        return draftSpot;
    }

    public void setDraftSpot(int draftSpot) {
        this.draftSpot = draftSpot;
    }
}
