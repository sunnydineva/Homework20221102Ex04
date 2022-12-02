public class AwardedRole {
    private String role;
    Movie movie;

    public AwardedRole(String role, Movie movie) {
        this.role = role;
        this.movie = movie;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
