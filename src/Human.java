/**
 * Created by ldiliyas on 16.07.14.
 */
public abstract class Human {
    protected String name;
    protected int age;


    Human(String name, int age){
        this.name = name;
        this.age = age;

    }


    protected abstract String speak(String a);




}
