package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class difficulty extends JFrame implements ActionListener{
    public JButton easy,hard,medium;
        difficulty(){
             getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(-50, 0, 800, 500);
        add(image);
        
        setSize(1200, 500);
        setLocation(0, 0);
        setVisible(true);
        JLabel name2 = new JLabel("CHOOSE DIFFICULTY");
        name2.setBounds(735, 150, 300, 20);
        name2.setFont(new Font("ALGERIAN", Font.BOLD, 20));
        name2.setForeground(Color.BLUE);
        add(name2);
        
        
        easy=new JButton("easy");
       
        easy.setBounds(735, 250, 250, 50);
        easy.setBackground(Color.BLUE);
        easy.setForeground(Color.WHITE);
        easy.addActionListener((ActionListener) this);
        add(easy);
        
        medium = new JButton("medium");
        medium.setBounds(735, 350, 250, 50);
        medium.setBackground(Color.BLUE);
        medium.setForeground(Color.WHITE);
        medium.addActionListener((ActionListener) this);
        add(medium);
        
           hard= new JButton("hard");
        hard.setBounds(735, 450, 250, 50);
        hard.setBackground(Color.BLACK);
        hard.setForeground(Color.WHITE);
        hard.addActionListener((ActionListener) this);
        add(hard);
}
public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == easy) {
            try {
                setVisible(false);
                new Field("user");
            } catch (IOException ex) {
                Logger.getLogger(difficulty.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        else if (ae.getSource() == medium) {
            setVisible(false);
            new Quiz2("user");
        } else if (ae.getSource() == hard) {
            setVisible(false);
            new Quiz("user");}
        else  {
            setVisible(false);
           
        }}
public static void main(String[] args) {
        new difficulty();
    
}

    }
    