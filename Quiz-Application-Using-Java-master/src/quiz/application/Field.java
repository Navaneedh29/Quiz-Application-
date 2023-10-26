package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import javax.imageio.ImageIO;

public class Field extends JFrame implements ActionListener {
    
    public JButton f1,f2,f3,back2;
    Graphics g;
     String name;
       
  
    
    @SuppressWarnings("LeakingThisInConstructor")
    Field(String name) throws IOException
    {   this.name = name;
        getContentPane().setBackground(Color.yellow);
        setLayout(null);
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image2 = new JLabel(i2);
        image2.setBounds(0, -100, 600, 600);
        add(image2);
        
       
        JLabel heading = new JLabel("QUIZ SHOW");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("ALGERIAN", Font.BOLD, 47));
        heading.setForeground(Color.RED);
        heading.setBackground(Color.blue);
        add(heading);
        
        JLabel name2 = new JLabel("CHOOSE ANY TYPE OF QUESTIONS");
        name2.setBounds(730, 150, 300, 20);
        name2.setFont(new Font("ALGERIAN", Font.BOLD, 16));
        name2.setForeground(Color.BLUE);
        add(name2);
        
        f1 = new JButton("GENERAL");
        f1.setBounds(735, 250, 250, 50);
        f1.setBackground(Color.BLUE);
        f1.setForeground(Color.WHITE);
        f1.addActionListener(this);
        add(f1);
        
        f2= new JButton("SPORTS");
        f2.setBounds(735, 350, 250, 50);
        f2.setBackground(Color.BLUE);
        f2.setForeground(Color.WHITE);
        f2.addActionListener((ActionListener) this);
        add(f2);
        
         f3 = new JButton("TECHNOLOGY");
        f3.setBounds(735, 450, 250, 50);
        f3.setBackground(Color.BLUE);
        f3.setForeground(Color.WHITE);
        f3.addActionListener((ActionListener) this);
        add(f3);
        
         back2= new JButton("BACK");
        back2.setBounds(735, 550, 250, 50);
        back2.setBackground(Color.BLACK);
        back2.setForeground(Color.WHITE);
        back2.addActionListener((ActionListener) this);
        add(back2);
       
        
        
        
        
         getContentPane();

        setBackground(Color.yellow);
        setSize(1200, 700);
        setLocation(0, 0);
        setVisible(true);
    }
 public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == f1) {
            setVisible(false);
            new Quiz("user");
        } 
        else if (ae.getSource() == f2) {
            setVisible(false);
            new Quiz2("user");
        } else if (ae.getSource() == f3) {
            setVisible(false);
            new Quiz("user");}
        else  {
            setVisible(false);
            new difficulty();
        }
    }
    
   
     public static void main(String[] args) throws IOException {
        String String;
           new Field("user");
     
     }

    private void add(ImageIcon i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
    
    

