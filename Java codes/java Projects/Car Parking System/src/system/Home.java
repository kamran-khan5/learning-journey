package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Home extends JFrame implements ActionListener{
    public static ArrayList<Vehicle> vehicleList=new ArrayList<>();
    JButton view, addCar, returnCar, exit;
     Home(){
         super("Parking Management System");
         setLayout(null);

         ImageIcon i1 = new ImageIcon("src\\icon\\home.jpg");
         Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0, 0, 1200, 600);
         add(image);

         JLabel heading = new JLabel("Parking Management System");
         heading.setBounds(350, 20, 600, 40);
         heading.setFont(new Font("Raleway", Font.BOLD, 30));
         heading.setForeground(Color.WHITE);
         image.add(heading);

         addCar = new JButton("Enter Car");
         addCar.setBounds(470, 150, 150, 40);
         addCar.addActionListener(this);
         image.add(addCar);

         returnCar = new JButton("Return Car");
         returnCar.setBounds(470, 250, 150, 40);
         returnCar.addActionListener(this);
         image.add(returnCar);

         view = new JButton("Show Car");
         view.setBounds(470, 350, 150, 40);
         view.addActionListener( this);
         image.add(view);

         exit = new JButton("Exit");
         exit.setBounds(470, 450, 150, 40);
         exit.addActionListener( this);
         image.add(exit);

         setSize(1200,600);
         setLocation(250, 100);
         setVisible(true);
         setResizable(false);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addCar) {
            setVisible(false);
            new AddVehicle();
        } else if (ae.getSource() == returnCar) {
            setVisible(false);
            new ReturnCar();
        } else if (ae.getSource() == view){
            setVisible(false);
            new ViewCar();
        }else {
            setVisible(false);
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        new Home();
    }
}