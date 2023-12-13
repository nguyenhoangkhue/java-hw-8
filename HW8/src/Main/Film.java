package Main;

public class Film {
    private String id;
    private String title;
    private String genre;
    private String director;
    private String releaseDate;

    public Film(){
    }

    public Film(String id, String title, String genre, String director, String releaseDate){
        this.id=id;
        this.title=title;
        this.genre=genre;
        this.director=director;
        this.releaseDate=releaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString(){
        return id+"-"+title+"-"+genre+"-"+director+"-"+releaseDate;
    }
}
