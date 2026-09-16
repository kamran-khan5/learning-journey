package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class ReturnCar extends JFrame implements ActionListener {
    JTextField cParkingId, cVehicleId;
    Vehicle v=null;
    JTextField tfParkingId, tfName, tfPhone, tfVehicle, tfVehicleType,
    tfParkingDays,tfParkingSlot, tfParkingCharges, tfTotalCharges;
    JButton returnCar, back, printReceipt, search;
    Vehicle vehicle;
    JTextArea taVehicleDetail;
    String vNo,pId;

    ReturnCar() {
        super("Parking Management System - Return Vehicle");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        JLabel labelParkingId = new JLabel("Parking Id");
        labelParkingId.setBounds(110, 45, 100, 30);
        labelParkingId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelParkingId);

        cParkingId = new JTextField();
        cParkingId.setBounds(200, 50, 150, 30);
        add(cParkingId);

        JLabel labelVehicleNo = new JLabel("Vehicle No");
        labelVehicleNo.setBounds(450, 45, 100, 30);
        labelVehicleNo.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelVehicleNo);

        cVehicleId = new JTextField();
        cVehicleId.setBounds(550, 50, 150, 30);
        add(cVehicleId);

        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 100, 100, 30);
        add(labelname);

        tfName = new JTextField();
        tfName.setBounds(200, 100, 100, 30);
        tfName.setEditable(false);
        add(tfName);

        JLabel labelphone = new JLabel("Contact no");
        labelphone.setBounds(50, 150, 100, 30);
        add(labelphone);

        tfPhone = new JTextField();
        tfPhone.setBounds(200, 150, 100, 30);
        tfPhone.setEditable(false);
        add(tfPhone);

        JLabel labelVehicle = new JLabel("Vehicle No");
        labelVehicle.setBounds(50, 200, 100, 30);
        add(labelVehicle);

        tfVehicle = new JTextField();
        tfVehicle.setBounds(200, 200, 100, 30);
        tfVehicle.setEditable(false);
        add(tfVehicle);

        JLabel parkingIdLbl = new JLabel("Parking id");
        parkingIdLbl.setBounds(50, 250, 100, 30);
        add(parkingIdLbl);

        tfParkingId = new JTextField();
        tfParkingId.setBounds(200, 250, 100, 30);
        tfParkingId.setEditable(false);
        add(tfParkingId);

        JLabel vehicleTypeLbl = new JLabel("Vehicle Type");
        vehicleTypeLbl.setBounds(50, 300, 100, 30);
        add(vehicleTypeLbl);

        tfVehicleType = new JTextField();
        tfVehicleType.setBounds(200, 300, 100, 30);
        tfVehicleType.setEditable(false);
        add(tfVehicleType);

        JLabel parkingDaysLbl = new JLabel("Parking Days");
        parkingDaysLbl.setBounds(50, 400, 100, 30);
        add(parkingDaysLbl);

        tfParkingDays = new JTextField();
        tfParkingDays.setBounds(200, 400, 100, 30);
        tfParkingDays.setEditable(false);
        add(tfParkingDays);

        JLabel parkingChargesLbl = new JLabel("Parking Charges");
        parkingChargesLbl.setBounds(50, 450, 100, 30);
        add(parkingChargesLbl);

        tfParkingCharges = new JTextField();
        tfParkingCharges.setBounds(200, 450, 100, 30);
        tfParkingCharges.setEditable(false);
        add(tfParkingCharges);

        JLabel totalChargesLbl = new JLabel("Total Charges");
        totalChargesLbl.setBounds(50, 500, 100, 30);
        add(totalChargesLbl);

        tfTotalCharges = new JTextField();
        tfTotalCharges.setBounds(200, 500, 100, 30);
        tfTotalCharges.setEditable(false);
        add(tfTotalCharges);

        JLabel parkingSlotLbl = new JLabel("Parking Slot");
        parkingSlotLbl.setBounds(50, 350, 100, 30);
        add(parkingSlotLbl);

        tfParkingSlot = new JTextField();
        tfParkingSlot.setBounds(200, 350, 100, 30);
        tfParkingSlot.setEditable(false);
        add(tfParkingSlot);

        JLabel vehicleDetailLbl = new JLabel("Vehicle Details");
        vehicleDetailLbl.setBounds(600, 150, 100, 30);
        vehicleDetailLbl.setFont(new Font("serif", Font.PLAIN, 15));
        add(vehicleDetailLbl);

        taVehicleDetail=new JTextArea();
        taVehicleDetail.setFont(new Font("Times New Roman", Font.BOLD, 15));
        taVehicleDetail.setBounds(500, 180, 300, 300);
        taVehicleDetail.setEditable(false);
        add(taVehicleDetail);

        JLabel orLbl = new JLabel("OR");
        orLbl.setBounds(380, 50, 100, 30);
        orLbl.setFont(new Font("serif", Font.PLAIN, 15));
        add(orLbl);

        returnCar = new JButton("Return Car");
        returnCar.setBounds(50, 550, 100,30);
        returnCar.setBackground(Color.BLACK);
        returnCar.setForeground(Color.WHITE);
        returnCar.addActionListener(this);
        add(returnCar);

        back = new JButton("Back");
        back.setBounds(200, 550, 100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        printReceipt = new JButton("Print");
        printReceipt.setBounds(600, 550, 100,30);
        printReceipt.setBackground(Color.BLACK);
        printReceipt.setForeground(Color.WHITE);
        printReceipt.addActionListener(this);
        add(printReceipt);

        search = new JButton("Search");
        search.setBounds(720, 50, 100,30);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);
        add(search);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
//        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(350, 0, 600, 400);
//        add(image);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == returnCar || ae.getSource() == printReceipt){
            try {
                vNo=cVehicleId.getText();
                pId=cParkingId.getText();
                if (vNo.isEmpty() && pId.isEmpty()){
                    JOptionPane.showMessageDialog(null, "ERROR... Search the Vehicle First");
                    new ReturnCar();
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (ae.getSource() == search){
//            try {
//                ObjectInputStream in= new ObjectInputStream(new FileInputStream("objectFile.txt"));
//                ArrayList<Vehicle> vehicles=(ArrayList<Vehicle>)in.readObject();
//                System.out.println(vehicles.get(0));
                if (Home.vehicleList.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Parking is Empty");
                    setVisible(false);
                    new Home();
                    return;
                }
                boolean isFounded=false;
                vNo=cVehicleId.getText();
                pId=cParkingId.getText();
                for (Vehicle value : Home.vehicleList) {
                    v = value;
                    if (vNo.isEmpty()) {
                        if (v.getVehicleNo().equalsIgnoreCase(pId)) {
                            isFounded = true;
                            break;
                        }
                    }
                    if (pId.isEmpty()) {
                        if (v.getVehicleNo().equalsIgnoreCase(vNo)) {
                            isFounded = true;
                            break;
                        }
                    }
//                ObjectInputStream in= new ObjectInputStream(new FileInputStream("objectFile.txt"));

//                while ((vehicle = (Vehicle) in.readObject())!=null) {

//                    if (vNo.isEmpty()){
//                        if (vehicle.getVehicleNo().equalsIgnoreCase(pId)){
//                            isFounded=true;
//                            break;
//                        }
//                    }
//                    if (pId.isEmpty()){
//                        if (vehicle.getVehicleNo().equalsIgnoreCase(vNo)){
//                            isFounded=true;
//                            break;
//                        }
                }
//                }
                if (!isFounded){
                    try {
                        JOptionPane.showMessageDialog(null, "Vehicle Not Founded");
                        setVisible(false);
                        new ReturnCar();
                        return;
                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                tfParkingId.setText(v.getParkingId());
                tfName.setText(v.getName());
                tfPhone.setText(v.getContact());
                tfVehicle.setText(v.getVehicleNo());
                tfVehicleType.setText(v.getVehicleType());
                tfParkingDays.setText(v.getParkingDays());
                tfParkingSlot.setText(v.getParkingSlot());
                tfParkingCharges.setText(v.getParkingCharges());
                tfTotalCharges.setText(totalChargesMethod(v.getParkingDays(),v.getParkingCharges()));

                taVehicleDetail.setText(v.returnView(totalChargesMethod(v.getParkingDays(),v.getParkingCharges())));

//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        }
        else if (ae.getSource() == returnCar) {
            try {
                for (Vehicle value : Home.vehicleList){
                    if (v.getParkingId().equalsIgnoreCase(value.getParkingId())){
                        Home.vehicleList.remove(value);
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Car is Returned Successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == printReceipt) {
            try {
                taVehicleDetail.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

//    private ArrayList<Vehicle> readObjectsMethod() {
//        ArrayList<Vehicle> objectsList = new ArrayList<>();
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objectFile.txt"))) {
//            Vehicle obj;
//             do{
//                obj = (Vehicle) objectInputStream.readObject();
//                objectsList.add(obj);
//            }while (obj!=null);
//        } catch (ClassNotFoundException | IOException e) {
//            e.printStackTrace();
//        }
//        return objectsList;
//    }

    public static String totalChargesMethod(String days, String charges){
        double noOfDays=Double.parseDouble(days);
        double tempCharges=Double.parseDouble(charges);
        return (noOfDays*tempCharges)+"";
    }

    public static void main(String[] args) {
        new ReturnCar();
    }
}
