package Main;

public class Movie extends Film{
    private String time;
    public Movie(int id, String title, String genre, String director, String releaseDate, String time){
        super(id,title,genre,director,releaseDate);
        this.time=time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public String toString(){
        return super.toString()+"-"+time;
    }
}
