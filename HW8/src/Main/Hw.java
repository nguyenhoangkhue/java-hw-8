package Main;

public class Hw {
    public static void main(String[] args) {
        Film film=new Film();

        System.out.println(filmInfo(film));
    }
    public static String filmInfo(Film film){
        return film.toString();
    }
}
