/**
 * Created by marius on 25/08/2017.
 */
public class Season {

    private String league;
    private String year;

    private Gameday gamedays[];
    private Team teams[];
    private Table standings;
    private Table homeStandings;
    private Table awayStandings;

    public Season(int numberOfTeams) {
        gamedays = new Gameday[(numberOfTeams - 1) * 2];
        teams = new Team[numberOfTeams];
        standings = new Table(teams, true, true);
        homeStandings = new Table(teams, true, false);
        awayStandings = new Table(teams, false, true);
    }

    public void addTeam(int teamIndex) {
        int i = 0;
        while (teams[i] != null) {
            i++;
        }
        if (i >= teams.length) {
            //ERROR
        } else {
            for (TeamList t : TeamList.values()) {
                if (t.getIndex() == teamIndex) {
                    teams[i] = new Team(t.getName(), t.getAbbr());
                    break;
                }
            }
        }
    }

    public Gameday[] getGamedays() {
        return gamedays;
    }

    public int getNumberOfTeams() {
        return teams.length;
    }

    public String getLeague() {
        return league;
    }

    public String getYear() {
        return year;
    }

}