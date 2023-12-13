package Main;

public class Serial extends Film{
    private int episodes;
    private double averageTime;
    public Serial(String id, String title, String genre, String director, String releaseDate, int episodes, double averageTime) {
        super(id, title, genre, director, releaseDate);
        this.episodes=episodes;
        this.averageTime=averageTime;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public double getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(double averageTime) {
        this.averageTime = averageTime;
    }
}
