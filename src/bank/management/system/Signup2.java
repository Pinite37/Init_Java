package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Signup2 extends JFrame{

    String formno;

    Signup2(String first){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);



        this.formno = formno;

        JLabel l1 = new JLabel("Page 2: -");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);


        JLabel l2 = new JLabel("Détails Additionnel");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);


        JLabel l3 = new JLabel("Réligion");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.setBounds(100, 120, 100, 30);
        add(l3);





        setLayout(null);
        setSize(850, 750);
        setLocation(230, 10);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);


    }

    public static void main(String[] args) {
        new Signup2("");
        
    }
    
}
