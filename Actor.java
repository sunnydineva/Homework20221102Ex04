import java.util.List;

public class Actor extends Person{
    private List<AwardedRole> awardedRoles;  // роли спечелили награди + името на филма
    public Actor(String fullName, List<Movie> movies, List<AwardedRole> awardedRoles) {
        super(fullName, movies);
        this.awardedRoles = awardedRoles;

    }

    public List<AwardedRole> getAwardedRoles() {
        return awardedRoles;
    }

    public void setAwardedRoles(List<AwardedRole> awardedRoles) {
        this.awardedRoles = awardedRoles;
    }
}
