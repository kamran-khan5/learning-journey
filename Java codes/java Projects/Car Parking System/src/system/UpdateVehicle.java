package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class UpdateVehicle extends JFrame implements ActionListener {
    JTextField tfName, tfContactNo, tfVehicleNo, tfParkingSlot, tfParkingDays , lbParkingCharges;
    JComboBox cbVehicleType;
    JLabel lbParkingId;
    JButton update, back;

    Vehicle tempV;

    UpdateVehicle(){}//default constructor
//    UpdateVehicle(String id, String name, String contact, String vNo,
//               String pSlot, String pDays, String pCharges){

    UpdateVehicle(Vehicle v1){

        super("Parking Management System - Update Details");

        tempV=v1;



//        lbParkingId.setText(v1.getParkingId());
//        tfName.setText(name);
//        tfContactNo.setText(contact);
//        tfVehicleNo.setText(vNo);
//        tfParkingSlot.setText(pSlot);
//        tfParkingDays.setText(pDays);
//        lbParkingCharges.setText(pCharges);

        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        JLabel heading = new JLabel("Add Details");
        heading.setBounds(380, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        heading.setForeground(Color.black);
        add(heading);

        JLabel labelParkingId = new JLabel("Parking id:");
        labelParkingId.setBounds(50, 400, 150, 30);
        labelParkingId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelParkingId);

        lbParkingId = new JLabel();
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

        JLabel labelCharges = new JLabel("Parking Charges");
        labelCharges.setBounds(400, 400, 150, 30);
        labelCharges.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelCharges);

        lbParkingCharges = new JTextField();
        lbParkingCharges.setBounds(600, 400, 150, 30);
        lbParkingCharges.setFont(new Font("serif", Font.PLAIN, 20));
        add(lbParkingCharges);


        update = new JButton("Update Details");
        update.setBounds(250, 550, 150, 40);
        update.addActionListener(this);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        add(update);

        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);

        lbParkingId.setText(v1.getParkingId());
        tfName.setText(v1.getName());
        tfContactNo.setText(v1.getContact());
        tfVehicleNo.setText(v1.getVehicleNo());
        tfParkingSlot.setText(v1.getParkingSlot());
        tfParkingDays.setText(v1.getParkingDays());
        lbParkingCharges.setText(v1.getParkingCharges());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == update) {
            Home.vehicleList.remove(tempV);

            String parkingId = lbParkingId.getText();
            String name = tfName.getText();
            String contactNo = tfContactNo.getText();
            String vehicleType = (String) cbVehicleType.getSelectedItem();
            String vehicleNo = tfVehicleNo.getText();
            String parkingSlot = tfParkingSlot.getText();
            String parkingDays = tfParkingDays.getText();
            String parkingCharges = lbParkingCharges.getText();

            try {
                for (Vehicle tVehicle: Home.vehicleList) {
                    if (tVehicle.getVehicleNo().equalsIgnoreCase(vehicleNo)){
                        JOptionPane.showMessageDialog(null,
                                "This vehicle No '"+vehicleNo+"' already exist.");
                        setVisible(false);
                        new AddVehicle();
                        return;
                    }
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
            Vehicle vehicle=new Vehicle(parkingId, name,contactNo, vehicleType, vehicleNo,
                    parkingSlot,parkingDays,parkingCharges);

            try {
                if (isFormNotFill()){
                    JOptionPane.showMessageDialog(null, "Please Add All Details");
                    setVisible(false);
                    new AddVehicle();
                    return;
                }
                try {
                    FileWriter fw = new FileWriter("java.txt");
                    fw.write(vehicle.display());
                    fw.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                Home.vehicleList.add(vehicle);
                JOptionPane.showMessageDialog(null, "Details Update successfully");
                setVisible(false);
                new ViewCar();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    private boolean isFormNotFill(){
        return lbParkingId.getText().isEmpty() || tfName.getText().isEmpty() || tfContactNo.getText().isEmpty()
                || tfVehicleNo.getText().isEmpty()||
                tfParkingSlot.getText().isEmpty() || tfParkingDays.getText().isEmpty() || lbParkingCharges.getText().isEmpty();
    }

    public static void main(String[] args) {
        new UpdateVehicle();
    }
}

