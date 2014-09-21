/**
 * Created by ldiliyas on 16.07.14.
 */
public abstract class Organisation {
    public String name;
    public City location;

    Organisation(){

    }

    Organisation(String name, City location){
        this.name = name;
        this.location = location;
    }

    protected abstract void fire();
    protected abstract void contract();


    public String getName() {
        return name;
    }

    public City getLocation() {
        return location;
    }
}
