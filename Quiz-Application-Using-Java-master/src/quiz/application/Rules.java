package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Quiz Show ,read the rules");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("ALGERIAN", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Times New Roman", Font.BOLD, 16));
        rules.setForeground(color.BLUE);
        rules.setText(
            "<html>"+ 
                "1. There are 10 questions from different fields" + "<br><br>" +
                "2. every question is compulsary" + "<br><br>" +
                "3. timer of 15 seconds will be running for each question " + "<br><br>" +
                "4. additional feature for the user is there is an 50-50 option button where the options will be reduced " + "<br><br>" +
                "5. select only one option and click next for the next question)" + "<br><br>" +
                "6. 50-50 option can be used only once" + "<br><br>" +
                "7. if you didnt choose any option during the given time that question will be skipped" + "<br><br>" +
                "8. For every correct answer 10 points will be awarded." + "<br><br>"+
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 50);
        back.setBackground(new Color(30, 144, 254));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 50);
        start.setBackground(Color.BLUE);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(900, 700);
        setLocation(0, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new difficulty();
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }

    private static class color {

        private static Color BLUE;

        public color() {
        }
    }
}
