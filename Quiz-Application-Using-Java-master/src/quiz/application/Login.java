package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(-50, 0, 800, 500);
        add(image);
        
        JLabel heading = new JLabel("QUIZ SHOW");
        heading.setBounds(750, 100, 300, 45);
        heading.setFont(new Font("ALGERIAN", Font.BOLD, 50));
        heading.setForeground(Color.RED);
        add(heading);
        
        JLabel name = new JLabel("ENTER YOUR NAME");
        name.setBounds(750, 200, 300, 20);
        name.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(750, 250, 300,30 );
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("PROCEED");
        rules.setBounds(900, 300, 120, 30);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("EXIT");
        back.setBounds(750, 300, 120, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(0, 0);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
