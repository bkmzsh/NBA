import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Илья on 31.07.2014.
 */
public class Trade extends Event {
    int i;
    Team team1;
    Team team2;

    Trade(Date date, Team team1, Team team2) {
        super(date);
        this.team1 = team1;
        this.team2 = team2;
    }

    public void doTrade(Trade trade){
        System.out.println("Ok, you must choose a player from " + team1.getName());
        team1.showPoaster();
        Scanner p = new Scanner(System.in);
        int playerFromTeam1 = p.nextInt();


    }

    public void createTrade(Trade trade){
        System.out.println("Do You want to do a Trade between " + team1.getName() + " and " + team2.getName() + "?");
        System.out.println("If You want to continue press Y/N");
        Scanner p = new Scanner(System.in);
        String choice = p.nextLine();
        if(choice.equals("N")){
            System.out.println("Ok see you later");
            return;
        }else{
            if (choice != "Y") {
                System.out.println("You must press Y/N");
                createTrade(trade);
            }else{
                if (choice == "Y") {

                }
            }
        }
    }
}
