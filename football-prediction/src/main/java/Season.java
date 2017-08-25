/**
 * Created by marius on 25/08/2017.
 */
public class Season {

    private Gameday gameday[];
    private Team team[];
    private Table standings;
    private Table homeStandings;
    private Table awayStandings;

    public Season() {
        gameday = new Gameday[34];
        team = new Team[18];
        standings = new Table(team, true, true);
        homeStandings = new Table(team, true, false);
        awayStandings = new Table(team, false, true);
    }

}
