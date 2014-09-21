/**
 * Created by ldiliyas on 16.07.14.
 */
public class Player extends Human {
   private double height;
   private double weight;
   private String team;
   private double score;
   private double rebounds;
   private double assists;
   private int defense;



    Player(String name, int age, double height, double weight, String team, double score, double rebounds, double assists, int defense) {
        super(name, age);
        this.height = height;
        this.weight = weight;
        this.team = team;
        this.score = score;
        this.rebounds = rebounds;
        this.assists = assists;
        this.defense = defense;
    }



    @Override
    protected String speak(String a){
        return name + " says" + ": " + a;
    }

    public static Player createPlayer(String tempname, int tempage, double tempheight, double tempweight, String tempteam, double tempscore, double temprebounds, double tempassists, int tempdefence){
        Player player;
        player = new Player(tempname, tempage, tempheight, tempweight, tempteam, tempscore, temprebounds, tempassists, tempdefence);
        return player;
    }




}
