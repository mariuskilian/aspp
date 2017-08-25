/**
 * Created by marius on 25/08/2017.
 */
public class Table {

    private Spot spot[];

    Table(Team team[], boolean includeHome, boolean includeAway) {
        spot = new Spot[team.length];

        for (int i = 0; i < team.length; i++) {
            spot[i] = new Spot(team[i], includeHome, includeAway);
        }
    }

}

class Spot {

    int standing;
    Team team;
    int wins;
    int losses;
    int ties;
    int goalsScored;
    int goalsRecieved;
    int points;

    Spot(Team team, boolean includeHome, boolean includeAway) {
        this.team = team;
        wins = 0;
        losses = 0;
        ties = 0;
        goalsScored = 0;
        goalsRecieved = 0;
        points = 0;
        calcStats(includeHome, includeAway);
    }

    void calcStats(boolean includeHome, boolean includeAway) {
        if (includeHome) {
            wins += team.getHomeWins();
            losses += team.getHomeLosses();
            ties += team.getHomeTies();
            goalsScored += team.getHomeScored();
            goalsRecieved += team.getHomeRecieved();
        }
        if (includeAway) {
            wins += team.getAwayWins();
            losses += team.getAwayLosses();
            ties += team.getAwayTies();
            goalsScored += team.getAwayScored();
            goalsRecieved += team.getAwayRecieved();
        }
        points += (3 * wins) + ties;
    }

}