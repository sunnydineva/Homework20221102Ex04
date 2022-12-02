import java.util.ArrayList;
import java.util.List;

public class Director extends Person{
    private List<Movie> awardedMovies;// списък с имената на филмите, спечелили награди
    public Director(String fullName, List<Movie> movies, ArrayList<Movie> awardedMovies) {
        super(fullName, movies);
        this.awardedMovies = awardedMovies;
    }

    public List<Movie> getAwardedMovies() {
        return awardedMovies;
    }

    public void setAwardedMovies(List<Movie> awardedMovies) {
        this.awardedMovies = awardedMovies;
    }

}
