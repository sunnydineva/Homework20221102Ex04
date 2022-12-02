import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static DataBase dataBase;
    public static  List<Director> directors;
    public static   List<Actor> actors;

    public static void main(String[] args) {

       dataBase = new DataBase();

//зад. В една система се съхранява следната информация:
//        - за режисьор
//                - име
//                - списък с имената на филмите, спечелили награди
//                - списък от филми
//        - за актьор:
//        - име
//        - роли спечелили награди + името на филма
//        - списък от филми
//        Да се напише програма, която извежда:
//        - кой режисьор с кои актьори е работил

        dataBase.awardedMovies1 = dataBase.getAwardedMovies(dataBase.movies6);
        dataBase.awardedMovies2 = dataBase.getAwardedMovies(dataBase.movies7);
        dataBase.awardedMovies3 = dataBase.getAwardedMovies(dataBase.movies8);
        dataBase.awardedMovies4 = dataBase.getAwardedMovies(dataBase.movies9);

        Actor actor1 = new Actor("Billy", dataBase.movies1, dataBase.awardedRoles1);
        Actor actor2 = new Actor("Rossy", dataBase.movies2, dataBase.awardedRoles2);
        Actor actor3 = new Actor("Bossy", dataBase.movies3, dataBase.awardedRoles3);
        Actor actor4 = new Actor("Husk", dataBase.movies4, dataBase.awardedRoles4);
        Actor actor5 = new Actor("Hulk", dataBase.movies5, dataBase.awardedRoles5);
        actors = Arrays.asList(actor1, actor2, actor3, actor4, actor5);

        Director director1 = new Director("Dir", dataBase.movies6, dataBase.awardedMovies1);
        Director director2 = new Director("Mir", dataBase.movies7, dataBase.awardedMovies2);
        Director director3 = new Director("Sir", dataBase.movies8, dataBase.awardedMovies3);
        Director director4 = new Director("Skir", dataBase.movies9, dataBase.awardedMovies4);

        directors = Arrays.asList(director1, director2, director3, director4);


        matchActorDirector();

    }

    public static void matchActorDirector(){


        for(Director director : directors) {
            List<Actor> actorsWorkedWithDirector = new ArrayList<>();
            for (Actor actor : actors) {
                for (Movie directorMovies : director.getMovies()) {
                    for (Movie actorMovies : actor.getMovies()) {
                        if (directorMovies == actorMovies) {
                            List<Actor> tempList = new ArrayList<>();
                            tempList.add(actor);
                            for (Actor tempActor: tempList){
                                if(!actorsWorkedWithDirector.contains(tempActor)) {
                                    actorsWorkedWithDirector.add(actor);
                                }
                            }

                        }
                    }
                }

            }
            System.out.println("The Director " + director + " has been worked with: " +
                    actorsWorkedWithDirector);
        }


    }
}







