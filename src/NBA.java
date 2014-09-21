import com.sun.javafx.runtime.SystemProperties;

import java.util.ArrayList;

/**
 * Created by ldiliyas on 16.07.14.
 */
public class NBA {
    public static void main(String[] args) {
//        Player michelJordan = new Player("Michel Jordan", 50, 1.98, 110, "Chicago Bulls", 36, 4, 8);
//        System.out.println(michelJordan.speak("I'm back!!!"));
//        Roaster la = new Roaster("LA",3);
//        la.createRoaster();
//        la.showRoaster();
//        City sa = new City("San Antonio", 1300000, 2);
//        Coach gp = new Coach("Gregg Poppovich", 65);
//        GrandManager rcb = new GrandManager("R.C. Buford", 54);
//        Roaster sasRoaster = new Roaster("SAS", 15);
//        Team sas = new Team("SAS", sa, gp, rcb, sasRoaster);
//        sasRoaster.createRoaster();
//        sas.createTeam();

        ArrayList<Team>teamList = new ArrayList();
        Team sas = Team.createTeam(
                "Spurs",
                City.createCity("San Antonio", 1300000, 2),
                Coach.createCoach("Gregg Poppovich", 65),
                GrandManager.createGrandManager("R.C. Buford", 54),
                5
        );
        sas.teamDescription();
        sas.createRoaster();
        sas.teamDescription();

        Team lac = Team.createTeam(
                "Clippers",
                City.createCity("LA", 17000000, 5),
                Coach.createCoach("Doc Rivers", 52),
                GrandManager.createGrandManager("Neal Olshea", 54),
                5
        );
//        lac.teamDescription();
//        lac.createRoaster();
//        lac.teamDescription();
        teamList.toArray(new Team[]{sas});
        teamList.toArray(new Team[]{lac});

        Player kobe = new Player("Kobe Brayant", 34, 198, 100, "LAL", 29.4, 4, 4, 3);








    }




}
