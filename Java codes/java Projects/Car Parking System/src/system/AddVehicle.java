package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class AddVehicle extends JFrame implements ActionListener {

//    ArrayList<Vehicle> vehicleList;
    Random ran = new Random();

    int number = ran.nextInt(99999)+1;

    JTextField tfName, tfContactNo, tfVehicleNo, tfParkingSlot, tfParkingDays , lbParkingCharges;
    JComboBox cbVehicleType;
    JLabel lbParkingId;
    JButton add, back;

    AddVehicle() {
        super("Parking Management System - Add Details");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
//
//        ImageIcon i1 = new ImageIcon("D:\\Car Parking System\\src\\icon\\add.png");
//        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(0, 0, 900, 700);
//        add(image);

        JLabel heading = new JLabel("Add Details");
        heading.setBounds(380, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        heading.setForeground(Color.black);
        add(heading);

        JLabel labelParkingId = new JLabel("Parking id:");
        labelParkingId.setBounds(50, 400, 150, 30);
        labelParkingId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelParkingId);

        lbParkingId = new JLabel("" + number);
        lbParkingId.setBounds(200, 400, 150, 30);
        lbParkingId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lbParkingId);

        JLabel labelName = new JLabel("Driver Name");
        labelName.setBounds(50, 150, 150, 30);
        labelName.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelName);

        tfName = new JTextField();
        tfName.setBounds(200, 150, 150, 30);
        add(tfName);

        JLabel labelContact = new JLabel("Contact No");
        labelContact.setBounds(400, 150, 150, 30);
        labelContact.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelContact);

        tfContactNo = new JTextField();
        tfContactNo.setBounds(600, 150, 150, 30);
        add(tfContactNo);

        JLabel labelVehicleType = new JLabel("Vehicle Type");
        labelVehicleType.setBounds(50, 200, 150, 30);
        labelVehicleType.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelVehicleType);

        String [] vehicleType = {"Two wheeler", "Four wheeler", "More than four wheeler", "Other"};
        cbVehicleType = new JComboBox(vehicleType);
        cbVehicleType.setBackground(Color.WHITE);
        cbVehicleType.setBounds(200, 200, 150, 30);
        add(cbVehicleType);

        JLabel labelVehicleNo = new JLabel("Vehicle No");
        labelVehicleNo.setDisplayedMnemonic('A');
        labelVehicleNo.setBounds(400, 200, 150, 30);
        labelVehicleNo.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelVehicleNo);

        tfVehicleNo = new JTextField();
        tfVehicleNo.setBounds(600, 200, 150, 30);
        tfVehicleNo.setFont(new Font("serif", Font.PLAIN, 20));
        add(tfVehicleNo);

        JLabel labelSlot = new JLabel("Parking Slot");
        labelSlot.setBounds(50, 250, 150, 30);
        labelSlot.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelSlot);

        tfParkingSlot = new JTextField();
        tfParkingSlot.setBounds(200, 250, 150, 30);
        add(tfParkingSlot);

        JLabel labelDays = new JLabel("Parking days");
        labelDays.setBounds(400, 250, 150, 30);
        labelDays.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelDays);

        tfParkingDays = new JTextField();
        tfParkingDays.setBounds(600, 250, 150, 30);
        add(tfParkingDays);

        JLabel labelCharges = new JLabel("Charges per Day");
        labelCharges.setBounds(400, 400, 150, 30);
        labelCharges.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelCharges);

        lbParkingCharges = new JTextField();
        lbParkingCharges.setBounds(600, 400, 150, 30);
        lbParkingCharges.setFont(new Font("serif", Font.PLAIN, 20));
        add(lbParkingCharges);


        add = new JButton("Add Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);

        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String parkingId = lbParkingId.getText();
            String name = tfName.getText();
            String contactNo = tfContactNo.getText();
            String vehicleType = (String) cbVehicleType.getSelectedItem();
            String vehicleNo = tfVehicleNo.getText();
            String parkingSlot = tfParkingSlot.getText();
            String parkingDays = tfParkingDays.getText();
            String parkingCharges = lbParkingCharges.getText();

            Vehicle vehicle=new Vehicle(parkingId, name,contactNo, vehicleType, vehicleNo,
                    parkingSlot,parkingDays,parkingCharges);

            try {
                boolean canAdd=true;
                if (!isNumber(contactNo)){
                    JOptionPane.showMessageDialog(null, "ERROR... Incorrect Contact No");
                    canAdd=false;
                }
                else if (!isNumber(parkingDays)){
                    JOptionPane.showMessageDialog(null, "ERROR... Days MUST be a Number");
                    canAdd=false;
                }
                else if (!isNumber(parkingCharges)){
                    JOptionPane.showMessageDialog(null, "ERROR... Incorrect Charges");
                    canAdd=false;
                }
                else if (isSlotReserved(parkingSlot)){
                    JOptionPane.showMessageDialog(null, "This Slot is Already Reserved");
                    canAdd=false;
                }
                else if (isFormNotFill()){
                    JOptionPane.showMessageDialog(null, "Please Add All Details");
                    canAdd=false;
                }
//                try {
////                    File file = new File("objectFile.txt");
////                    if (!file.exists()) {
////                        // Create the file if it doesn't exist
////                        boolean created = file.createNewFile();
////                        if (!created) {
////                            System.out.println("Failed to create the file.");
////                            return;
////                        }
//                    }
                if (canAdd) {
                    try {
//                        String cost=ReturnCar.totalChargesMethod(parkingDays,parkingCharges);
                        FileWriter fw = new FileWriter("java.txt");
                        fw.write(vehicle.display());
                        fw.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Home.vehicleList.add(vehicle);
                    JOptionPane.showMessageDialog(null, "Details added successfully");
                    setVisible(false);
                    new AddVehicle();
                }
//            }catch (IOException e) {
//                    e.printStackTrace();
//                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    private boolean isSlotReserved(String slot){
        for (Vehicle v: Home.vehicleList) {
            return  (v.getParkingSlot().equalsIgnoreCase(slot));
        }
        return false;
    }

    private boolean isFormNotFill(){
        return lbParkingId.getText().isEmpty() || tfName.getText().isEmpty() || tfContactNo.getText().isEmpty()
               || tfVehicleNo.getText().isEmpty()||
                tfParkingSlot.getText().isEmpty() || tfParkingDays.getText().isEmpty() || lbParkingCharges.getText().isEmpty();
    }

    public boolean isNumber(String input) {
        for (char c : input.toCharArray()) {
            if (c==' ' || c=='.'){
                continue;
            }
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new AddVehicle();
    }
}
