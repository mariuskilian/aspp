import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by marius on 25/08/2017.
 */
public class Team {

    private String name, abbr;
    private int homeWins, homeLosses, homeTies;
    private int awayWins, awayLosses, awayTies;
    private int homeScored, homeRecieved;
    private int awayScored, awayRecieved;

    public Team(String name, String abbr) {
        this.name = name;
        this.abbr = abbr;
        homeWins = 0;
        homeLosses = 0;
        homeTies = 0;
        awayWins = 0;
        awayLosses = 0;
        awayTies = 0;
        homeScored = 0;
        homeRecieved = 0;
        awayScored = 0;
        awayRecieved = 0;
    }

    public int findHomeStanding() {
        //TODO
        return 0;
    }

    public int findAwayStanding() {
        //TODO
        return 0;
    }

    // Add to Wins, Losses or Ties

    public void wonHome() {
        homeWins++;
    }

    public void lostHome() {
        homeLosses++;
    }

    public void tiedHome() {
        homeTies++;
    }

    public void wonAway() {
        awayWins++;
    }

    public void lostAway() {
        awayLosses++;
    }

    public void tiedAway() {
        awayTies++;
    }


    // Add to Goals Scored or Recieved

    public void scoredHome(int goals) {
        homeScored += goals;
    }

    public void recievedHome(int goals) {
        homeRecieved += goals;
    }

    public void scoredAway(int goals) {
        awayScored += goals;
    }

    public void recievedAway(int goals) {
        awayRecieved += goals;
    }


    // Getters for all Variables

    public String getName() {
        return name;
    }

    public String getAbbr() {
        return abbr;
    }

    public int getWins() {
        return homeWins + awayWins;
    }

    public int getLosses() {
        return homeLosses + awayLosses;
    }

    public int getTies() {
        return homeTies + awayTies;
    }

    public int getHomeWins() {
        return homeWins;
    }

    public int getHomeLosses() {
        return homeLosses;
    }

    public int getHomeTies() {
        return homeTies;
    }

    public int getAwayWins() {
        return awayWins;
    }

    public int getAwayLosses() {
        return awayLosses;
    }

    public int getAwayTies() {
        return awayTies;
    }

    public int getHomeScored() {
        return homeScored;
    }

    public int getHomeRecieved() {
        return homeRecieved;
    }

    public int getAwayScored() {
        return awayScored;
    }

    public int getAwayRecieved() {
        return awayRecieved;
    }


}
