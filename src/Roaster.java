import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by User on 16.07.2014.
 */
public class Roaster {
    private static double maxPayment = 58.689;
    protected LinkedList<String> players;
    protected double[] listOfPayment = null;
    private String team;
    private int playersOnContract;
    protected double totalPayment;
    private double underPaymentCeiling;

    Roaster(String team, int playersOnContract) {
        this.team = team;
        this.players = new LinkedList();
        this.playersOnContract = playersOnContract;
    }

    public void createRoaster() {
        for(int i=0;i<playersOnContract;i++) {
            RoasterFrame roasterFrame = new RoasterFrame("Create roaster", i);
//        roasterFrame.setLayout(new FlowLayout());
//        roasterFrame.setSize(600, 600);
//        roasterFrame.setLocation(100, 100);
            roasterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            roasterFrame.setVisible(true);

//        players = new LinkedList();
//        listOfPayment = new double[playersOnContract];

//        JPanel panel = new JPanel();

//        for (int i = 0; i < playersOnContract; i++) {
//           // System.out.println("Add player № - " + (i + 1));
//            JLabel question = new JLabel("Add player № - " + (i + 1));
//            panel.add(question);
//            JTextField enter = new JTextField();
//            enter.setSize(200, 200);
//            panel.add(enter);
//
//            Scanner p = new Scanner(System.in);
//            players.add(p.nextLine());
//            System.out.println("Add payment of " + players.get(i));
//            Scanner m = new Scanner(System.in);
//            String str = m.nextLine();
//            listOfPayment[i] = Double.parseDouble(str);
//            if (i == (playersOnContract - 1)) {
//                System.out.println("You have create roaster!");
//            } else System.out.println("Addition of player №" + (i + 1) + "complete!");
//        }

//        roasterFrame.getContentPane().add(panel);
        }
    }

    public void showRoaster() {

        for (int i = 0; i < players.size(); i++) {
            System.out.println("№ " + (i + 1) + " " + players.get(i) + "-" + listOfPayment[i] + " bil$/year.");
            totalPayment += listOfPayment[i];
        }
        System.out.println("Total payment - " + totalPayment + " bil$/year.");
        if (totalPayment < maxPayment) {
            System.out.println("Under payment ceiling - " + (maxPayment - totalPayment) + " bil$/year.");
        } else {
            System.out.println("Over payment ceiling - " + (totalPayment - maxPayment) + " bil$/year.");
        }
    }
    public String tradePlayerNameOut(int i){
        String tempName = players.get(i - 1);
        return tempName;
    }
    public double tradePlayerPaymentOut(int i){
        double tempPayment = listOfPayment[i - 1];
        return tempPayment;
    }

    public class RoasterFrame extends JFrame implements ActionListener {
        JButton button = new JButton("Подтвердить ввод");
        final JTextField enter = new JTextField(35);


        public RoasterFrame(String str, int i) throws HeadlessException {
            super(str);
            setSize(600, 600);
            setLocation(100, 100);
            JPanel panel = new JPanel();
            JLabel question = new JLabel("Add player № - " + (i + 1));
            panel.add(question);
            panel.add(enter);
            panel.add(button);

            Container container = getContentPane();
            container.add(panel);
        }



        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource() != button){
                return;
           }
        }
    }



}
