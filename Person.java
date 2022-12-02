
import java.util.List;

public class Person {
    private String fullName;
    private List<Movie> movies;

    public Person(String fullName, List<Movie> movies) {
        this.fullName = fullName;
        this.movies = movies;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }


    @Override
    public String toString() {
        return getFullName();
    }
}

