/**
 * Created by marius on 25/08/2017.
 */
public class Calculations {

    private static int factor = 1;

    public static Score predictGame(Game game) {
        float home = 0;
        float away = 0;

        Team homeTeam = game.getHomeTeam();
        Team awayTeam = game.getAwayTeam();

        int homeScored = homeTeam.getHomeScored();
        int homeRecieved = homeTeam.getHomeRecieved();
        int awayScored = awayTeam.getAwayScored();
        int awayRecieved = awayTeam.getAwayRecieved();

        int homeStanding = homeTeam.findHomeStanding();
        int awayStanding = awayTeam.findAwayStanding();

        float homeFactor = ((18 - homeStanding) / factor) + 1;
        float awayFactor = ((18 - awayStanding) / factor) + 1;

        home = (homeScored * homeFactor) + (awayRecieved * awayFactor);
        home /= (homeFactor + awayFactor);

        away = (awayScored * awayFactor) + (homeRecieved * homeFactor);
        away /= (homeFactor + awayFactor);

        return new Score(Math.round(home), Math.round(away));
    }

    public void setFactor(int factor) {
        Calculations.factor = factor;
    }

}
