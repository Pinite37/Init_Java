package bank.management.system;

//import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Signup extends JFrame {
    JTextField textName, textFName;

    JSpinner dateChooser;



    Random ran = new Random();

    long first4 = (ran.nextLong() % 9000L) + 1000L;

    String firts = " " + Math.abs(first4);


    Signup(){
        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);



        JLabel label1 = new JLabel("APPLICATION FORM No: " + firts);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Ralway", Font.BOLD, 38));
        add(label1);


        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);


        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);


        JLabel labelName = new JLabel("Prénom: ");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);


        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelfName = new JLabel("Nom: ");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 240, 100, 30);
        add(labelfName);


        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300, 240, 400, 30);
        add(textFName);



        JLabel DOB = new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);


        SpinnerDateModel model = new SpinnerDateModel(new Date(), null, null, Calendar.DAY_OF_MONTH);
        dateChooser = new JSpinner(model); 


        JSpinner.DateEditor editor = new JSpinner.DateEditor(dateChooser, "dd/MM/yyyy");
        dateChooser.setEditor(editor);
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);



        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(230, 10);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Signup();
        
    }
}