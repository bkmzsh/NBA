/**
 * Created by ldiliyas on 16.07.14.
 */
public class GrandManager extends Human {
    GrandManager(String name, int age) {
        super(name, age);

    }




    protected String speak(String a){
        return name + " says" + ": " + a;
    }

    public static GrandManager createGrandManager(String name, int age) {
        return new GrandManager(name, age);
    }

    public String showGMName(GrandManager grandManager){
        return name;
    }
}
