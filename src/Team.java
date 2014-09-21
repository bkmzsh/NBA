import java.util.ArrayList;

/**
 * Created by ldiliyas on 16.07.14.
 */
public class Team extends Organisation{
    protected Coach coach;
    protected GrandManager grandManager;
    protected Roaster roaster; // количество игроков в команде и их ЗП
    protected ArrayList players;


    Team(String name, City location, Coach coach, GrandManager grandManager, Roaster roaster){
        super(name, location);
        this.coach = coach;
        this.grandManager = grandManager;
        this.roaster = roaster;
    }

    @Override
    protected void fire() {

    }

    @Override
    protected void contract() {

    }

    public static Team createTeam(String name, City city, Coach coach, GrandManager grandManager, int playerOnContract) {
        Roaster roaster = new Roaster(name, playerOnContract);
        return new Team(name, city, coach, grandManager, roaster);
    }

    public void teamDescription(){
        String a = location.showCityName(location);
        String b = grandManager.showGMName(grandManager);
        String c = coach.showCoachName(coach);
        System.out.println("Name team: " + name);
        System.out.println("City: " + a);
        System.out.println("GM: " + b);
        System.out.println("Coach: " + c);
        roaster.showRoaster();
    }

    public void createRoaster(){
        roaster.createRoaster();
    }
    public void showPoaster(){
        roaster.showRoaster();
    }

//    public void tradePlayer(int i){
//        roaster.tradePlayer(i);
//    }

    public Coach getCoach() {
        return coach;
    }

    public GrandManager getGrandManager() {
        return grandManager;
    }
}
