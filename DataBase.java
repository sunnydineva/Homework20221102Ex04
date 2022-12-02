import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {
    Movie m1 = new Movie("Home alone 1", true);
    Movie m2 = new Movie("Home alone 2", true);
    Movie m3 = new Movie("Home alone 3", true);
    Movie m4 = new Movie("Home alone 4", true);
    Movie m5 = new Movie("Home alone 5", true);
    Movie m6 = new Movie("Home alone 6", true);
    Movie m7 = new Movie("Home alone 7", false);
    Movie m8 = new Movie("Home alone 8", false);
    Movie m9 = new Movie("Home alone 9", false);

    List<Movie> movies1 = Arrays.asList(m1, m2, m3, m4, m5);
    List<Movie> movies2 = Arrays.asList(m1, m2);
    List<Movie> movies3 = Arrays.asList(m1, m2, m3);
    List<Movie> movies4 = Arrays.asList(m1, m2, m3, m4);
    List<Movie> movies5 = Arrays.asList(m1, m3, m4, m5);

    List<Movie> movies6 = Arrays.asList(m1, m2);
    List<Movie> movies7 = Arrays.asList(m3, m4);
    List<Movie> movies8 = List.of(m5);
    List<Movie> movies9 = Arrays.asList(m6, m7);
    List<Movie> movies10 = Arrays.asList(m8, m9);


    ArrayList<Movie> awardedMovies1 = new ArrayList<>();
    ArrayList<Movie> awardedMovies2 = new ArrayList<>();
    ArrayList<Movie> awardedMovies3 = new ArrayList<>();
    ArrayList<Movie> awardedMovies4 = new ArrayList<>();



    AwardedRole role1 = new AwardedRole("Sam", m1);
    AwardedRole role2 = new AwardedRole("Mum", m1);
    AwardedRole role3 = new AwardedRole("Dad", m1);
    AwardedRole role4 = new AwardedRole("Neighbour", m2);
    AwardedRole role5 = new AwardedRole("Thief", m2);
    AwardedRole role6 = new AwardedRole("Priest", m5);
    AwardedRole role7 = new AwardedRole("Salesman", m5);
    AwardedRole role8 = new AwardedRole("Baker", m5);

    List<AwardedRole> awardedRoles1 = Arrays.asList(role1, role4, role6);
    List<AwardedRole> awardedRoles2 = Arrays.asList(role2, role5);
    List<AwardedRole> awardedRoles3 = Arrays.asList(role7, role3);
    List<AwardedRole> awardedRoles4 = List.of(role8);
    List<AwardedRole> awardedRoles5 = new ArrayList<>();



    public ArrayList<Movie> getAwardedMovies(List<Movie> movies){
        ArrayList<Movie> awardedMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.isAwarded()) {

                awardedMovies.add(movie);
            }
        }
        return awardedMovies;
    }

}


