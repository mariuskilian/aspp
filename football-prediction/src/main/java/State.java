import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by marius on 29/08/2017.
 */
public class State {

    private int[] teamlist;
    private String league;
    private String year;
    private Season season;
    private Gameday gamedays[];
    private Game games[][];

    public State(Season season) {
        this.season = season;
        league = season.getLeague();
        year = season.getYear();
        gamedays = season.getGamedays();
        for (int i = 0; i < gamedays.length; i++) {
            games[i] = gamedays[i].getGames();
        }
        teamlist = new int[season.getNumberOfTeams()];
    }

    public void save() {
        try {
            PrintWriter writer = new PrintWriter("../resources/" +
                    league + "-" + year + ".txt", "UTF-8");
            writer.println("season.save()");
            writer.println("The second line");
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }

}
