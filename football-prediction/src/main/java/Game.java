/**
 * Created by marius on 25/08/2017.
 */
public class Game {

    private Team homeTeam, awayTeam;
    private Score predictedScore;
    private Score finalScore;

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

}

class Score {

    int home, away;

    Score(int home, int away) {
        this.home = home;
        this.away = away;
    }

}
