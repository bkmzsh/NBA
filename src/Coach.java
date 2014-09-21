/**
 * Created by ldiliyas on 16.07.14.
 */
public class Coach extends Human {
    Coach(String name, int age) {
        super(name, age);

    }
    protected String speak(String a){
        return name + " says" + ": " + a;
    }

    public static Coach createCoach(String name, int age) {
        return new Coach(name, age);
    }

    public String showCoachName(Coach coach){
        return name;
    }
}
