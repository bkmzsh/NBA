/**
 * Created by User on 16.07.2014.
 */
public class League extends Organisation {
    private String komissioner = "Adam Silver";
    private int administration;

    League(String name, City location) {
        super(name, location);
        this.komissioner = komissioner;
        this.administration = administration;
    }

    public String letTrade(boolean yes){
        if(yes){
            return "Trade is complete!";
        }else return "Trade is denied!";

    }


    @Override
    protected void fire() {
        administration--;
    }

    @Override
    protected void contract() {
        administration++;
    }
}
