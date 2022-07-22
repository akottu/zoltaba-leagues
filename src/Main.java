import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        runArchive();

    }

    public static void runArchive() throws InterruptedException {
        League zdfb = new League("Zoltaba Dynasty Fantasy Basketball");
        zdfb.getSeasons().add(new Season("ZDFB2022"));

        zdfb.getSeason("ZDFB2022").setDivisions();
        zdfb.getSeason("ZDFB2022").displayDivisions();
        zdfb.getSeason("ZDFB2022").setDraftOrder();
        zdfb.getSeason("ZDFB2022").displayDraftOrder();
    }
}