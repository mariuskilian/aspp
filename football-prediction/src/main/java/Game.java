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

    public void setPredictedScore(Score score) {
        predictedScore = score;
    }

    public void setFinalScore(Score score) {
        finalScore = score;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Score getPredictedScore() {
        return predictedScore;
    }

    public Score getFinalScore() {
        return finalScore;
    }
}

class Score {

    int home, away;

    Score(int home, int away) {
        this.home = home;
        this.away = away;
    }

}
