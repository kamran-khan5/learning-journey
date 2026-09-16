package Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame implements ActionListener {
    Random ran = new Random();
    int number = ran.nextInt(99999)+1;

    JTextField tfInvoiceNo, tfCustomerName, tfContact, tfProductType, tfProductName,
            tfBrandName,tfSerialNo, tfUnitPrice, tfNoOfUnit, tfTotalPrice;

    JTextArea taAddress;
    App(){
        super("Bill Application");
        setLayout(new BorderLayout());

        JLabel heading = new JLabel("Bill Application");
        heading.setBounds(550, 20, 600, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 30));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel labelParkingId = new JLabel("Parking Id");
        labelParkingId.setBounds(110, 45, 100, 30);
        labelParkingId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelParkingId);

//        cParkingId = new JTextField();
//        cParkingId.setBounds(200, 50, 150, 30);
//        add(cParkingId);
//
//        JLabel labelVehicleNo = new JLabel("Vehicle No");
//        labelVehicleNo.setBounds(450, 45, 100, 30);
//        labelVehicleNo.setFont(new Font("serif", Font.PLAIN, 20));
//        add(labelVehicleNo);
//
//        cVehicleId = new JTextField();
//        cVehicleId.setBounds(550, 50, 150, 30);
//        add(cVehicleId);
//
//        JLabel labelname = new JLabel("Name");
//        labelname.setBounds(50, 100, 100, 30);
//        add(labelname);
//
//        tfName = new JTextField();
//        tfName.setBounds(200, 100, 100, 30);
//        tfName.setEditable(false);
//        add(tfName);
//
//        JLabel labelphone = new JLabel("Contact no");
//        labelphone.setBounds(50, 150, 100, 30);
//        add(labelphone);
//
//        tfPhone = new JTextField();
//        tfPhone.setBounds(200, 150, 100, 30);
//        tfPhone.setEditable(false);
//        add(tfPhone);
//
//        JLabel labelVehicle = new JLabel("Vehicle No");
//        labelVehicle.setBounds(50, 200, 100, 30);
//        add(labelVehicle);
//
//        tfVehicle = new JTextField();
//        tfVehicle.setBounds(200, 200, 100, 30);
//        tfVehicle.setEditable(false);
//        add(tfVehicle);
//
//        JLabel parkingIdLbl = new JLabel("Parking id");
//        parkingIdLbl.setBounds(50, 250, 100, 30);
//        add(parkingIdLbl);
//
//        tfParkingId = new JTextField();
//        tfParkingId.setBounds(200, 250, 100, 30);
//        tfParkingId.setEditable(false);
//        add(tfParkingId);
//
//        JLabel vehicleTypeLbl = new JLabel("Vehicle Type");
//        vehicleTypeLbl.setBounds(50, 300, 100, 30);
//        add(vehicleTypeLbl);
//
//        tfVehicleType = new JTextField();
//        tfVehicleType.setBounds(200, 300, 100, 30);
//        tfVehicleType.setEditable(false);
//        add(tfVehicleType);
//
//        JLabel parkingDaysLbl = new JLabel("Parking Days");
//        parkingDaysLbl.setBounds(50, 400, 100, 30);
//        add(parkingDaysLbl);
//
//        tfParkingDays = new JTextField();
//        tfParkingDays.setBounds(200, 400, 100, 30);
//        tfParkingDays.setEditable(false);
//        add(tfParkingDays);
//
//        JLabel parkingChargesLbl = new JLabel("Parking Charges");
//        parkingChargesLbl.setBounds(50, 450, 100, 30);
//        add(parkingChargesLbl);
//
//        tfParkingCharges = new JTextField();
//        tfParkingCharges.setBounds(200, 450, 100, 30);
//        tfParkingCharges.setEditable(false);
//        add(tfParkingCharges);
//
//        JLabel parkingSlotLbl = new JLabel("Parking Slot");
//        parkingSlotLbl.setBounds(50, 350, 100, 30);
//        add(parkingSlotLbl);
//
//        tfParkingSlot = new JTextField();
//        tfParkingSlot.setBounds(200, 350, 100, 30);
//        tfParkingSlot.setEditable(false);
//        add(tfParkingSlot);
//
//        JLabel vehicleDetailLbl = new JLabel("Vehicle Details");
//        vehicleDetailLbl.setBounds(600, 150, 100, 30);
//        vehicleDetailLbl.setFont(new Font("serif", Font.PLAIN, 15));
//        add(vehicleDetailLbl);
//
//        taVehicleDetail=new JTextArea();
//        taVehicleDetail.setBounds(500, 180, 300, 300);
//        taVehicleDetail.setEditable(false);
//        add(taVehicleDetail);

        setSize(1200,590);
        setLocation(250, 100);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new App();
    }
}
