package Main;

public class Serial extends Film{
    private int episodes;
    private String averageTime;
    public Serial(int id, String title, String genre, String director, String releaseDate, int episodes, String averageTime) {
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

    public String getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(String averageTime) {
        this.averageTime = averageTime;
    }
    @Override
    public String toString(){
        return super.toString()+"-"+episodes+"-"+averageTime;
    }
}
