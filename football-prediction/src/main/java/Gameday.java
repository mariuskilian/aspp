/**
 * Created by marius on 25/08/2017.
 */
public class Gameday {

    private Game games[];

    public Gameday(Game games[]) {
        this.games = games;
        for(Game g : games) {
            g.setPredictedScore(Calculations.predictGame(g));
        }
    }

    public Game[] getGames() {
        return games;
    }

}
