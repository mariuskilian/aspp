import java.util.ArrayList;

/**
 * Created by marius on 25/08/2017.
 */
public class Table {

    private Spot table[];
    private boolean includeHome;
    private boolean includeAway;

    Table(Team team[], boolean includeHome, boolean includeAway) {
        table = new Spot[team.length];
        this.includeHome = includeHome;
        this.includeAway = includeAway;

        for (int i = 0; i < team.length; i++) {
            table[i] = new Spot(team[i], includeHome, includeAway, i);
        }
    }

    public void sortTable() {
        Spot tmp[] = new Spot[table.length];
        ArrayList<Spot> highestLeft = new ArrayList();  // Array list because several teams might share standing

        // Update all the Stats
        for (Spot s : table) {
            s.calcStats(includeHome, includeAway);
        }

        while (!sortedAll()) {                          // Checks if the whole Table has been sorted or not
            for (int i = 0; i < table.length; i++) {

                if (table[i] != null) {

                    if (highestLeft.get(0) == null) {
                        highestLeft.clear();
                        highestLeft.add(table[i]);
                    } else {

                        // Booleans for comparing standing
                        boolean samePoints = table[i].points == highestLeft.get(0).points;
                        boolean sameGoalDiff = table[i].goalDiff == highestLeft.get(0).goalDiff;
                        boolean sameScored = table[i].goalsScored == highestLeft.get(0).goalsScored;

                        if (table[i].points > highestLeft.get(0).points ||
                                (samePoints && table[i].goalDiff > highestLeft.get(0).goalDiff) ||
                                (samePoints && sameGoalDiff && table[i].goalsScored > highestLeft.get(0).goalsScored)) {
                            highestLeft.clear();
                            highestLeft.add(table[i]);
                        } else if (samePoints && sameGoalDiff && sameScored) {
                            highestLeft.add(table[i]);
                        }
                    }
                }

            }

            int nextStandingIndex = 0;
            int standing = 1;
            for (int i = 0; tmp[i] != null; i++) {
                nextStandingIndex = i + 1;
            }
            if (nextStandingIndex != 0) {
                standing = tmp[nextStandingIndex - 1].standing + 1;
            }

            int tmpArrayListIndex = 0;
            Spot s = highestLeft.get(tmpArrayListIndex);
            while (s != null) {
                s.setStanding(standing);
                tmp[nextStandingIndex++] = s;
                table[s.index] = null;
                s = highestLeft.get(++tmpArrayListIndex);
            }
        }

        for (int i = 0; i < table.length; i++) {
            table[i] = tmp[i];
        }
    }

    private boolean sortedAll() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                return false;
            }
        }
        return true;
    }

}

class Spot {

    int index;
    int standing;
    Team team;
    int wins;
    int losses;
    int ties;
    int goalsScored;
    int goalsRecieved;
    int goalDiff;
    int points;

    Spot(Team team, boolean includeHome, boolean includeAway, int index) {
        this.team = team;
        this.index = index;
        calcStats(includeHome, includeAway);
    }

    void calcStats(boolean includeHome, boolean includeAway) {
        wins = 0;
        losses = 0;
        ties = 0;
        goalsScored = 0;
        goalsRecieved = 0;
        points = 0;
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
        goalDiff = goalsScored - goalsRecieved;
        points = (3 * wins) + ties;
    }

    void setStanding(int standing) {
        this.standing = standing;
    }

}