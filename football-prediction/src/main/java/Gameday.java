/**
 * Created by marius on 25/08/2017.
 */
public class Gameday {

    private Game game[];

    public Gameday(Game game[]) {
        this.game = game;
        for(Game g : game) {
            g.setPredictedScore(Calculations.predictGame(g));
        }
    }

}
