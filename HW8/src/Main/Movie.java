package Main;

public class Movie extends Film{
    private double time;
    public Movie(String id, String title, String genre, String director, String releaseDate, double time){
        super(id,title,genre,director,releaseDate);
        this.time=time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
