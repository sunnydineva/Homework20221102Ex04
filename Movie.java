public class Movie {
    private String movie;
    private boolean isAwarded;

    public Movie(String movie, boolean isAwarded) {
        this.movie = movie;
        this.isAwarded = isAwarded;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public boolean isAwarded() {
        return isAwarded;
    }

    public void setAwarded(boolean awarded) {
        isAwarded = awarded;
    }
}
