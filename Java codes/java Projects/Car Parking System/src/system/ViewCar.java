package system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewCar extends JFrame implements ActionListener {
    JTable table;
    JTextField cParkingId, cVehicleNo;
    JButton search, print, update, back;

    String vNoSearch,pIdSearch;
    JTextArea taVehicleDetail;

    ViewCar() {
        super("Parking Management System - View Details");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        ImageIcon view = new ImageIcon("src\\icon\\view.jpg");
        Image view1 = view.getImage().getScaledInstance(900, 673, Image.SCALE_DEFAULT);
        ImageIcon view2 = new ImageIcon(view1);
        JLabel image = new JLabel(view2);
        image.setBounds(0, 120, 900, 673);
        add(image);

//        JLabel i=new JLabel();
//        ImageIcon icon=new ImageIcon("D:\\Car Parking System\\src\\icon\\view.jpg");
//        i.setIcon(icon);
//        add(i);

        JLabel searchByParkingIdLbl = new JLabel("Search by Parking Id");
        searchByParkingIdLbl.setBounds(20, 20, 150, 20);
        add(searchByParkingIdLbl);

        cParkingId = new JTextField();
        cParkingId.setBounds(180, 20, 150, 20);
        add(cParkingId);

        JLabel searchByCarNoLbl = new JLabel("Search by Car No");
        searchByCarNoLbl.setBounds(400, 20, 150, 20);
        add(searchByCarNoLbl);

        cVehicleNo = new JTextField();
        cVehicleNo.setBounds(560, 20, 150, 20);
        add(cVehicleNo);

        table = new JTable();

//        JScrollPane jsp = new JScrollPane(table);
//        jsp.setBounds(0, 100, 900, 600);
//        add(jsp);

//        JLabel detail=new JLabel("Details");
//        detail.setBounds(250, 170, 150, 20);
//        detail.setFont(new Font("serif", Font.PLAIN, 25));
//        add(detail);

        String header="  \t  DETAILS\n====================================\n\n";
        taVehicleDetail=new JTextArea(header);
        taVehicleDetail.setFont(new Font("Times New Roman", Font.BOLD, 20));
        taVehicleDetail.setForeground(Color.BLACK);
        taVehicleDetail.setBounds(100, 80, 400, 400);
        taVehicleDetail.setEditable(false);
        image.add(taVehicleDetail);

//        taVehicleDetail=new JTextArea("Details");
//        taVehicleDetail.setForeground(Color.BLACK);
//        taVehicleDetail.setBounds(100, 200, 400, 400);
//        taVehicleDetail.setEditable(false);
//        image.add(taVehicleDetail);

        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);
        add(search);

        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);

        update = new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(320, 70, 80, 20);
        back.addActionListener(this);
        add(back);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 673);
        setLocation(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            vNoSearch=cVehicleNo.getText();
            pIdSearch=cParkingId.getText();
                try {
                    if (vNoSearch.isEmpty() && pIdSearch.isEmpty()){
                        JOptionPane.showMessageDialog(null, "ERROR... Search the Vehicle First");
                        setVisible(false);
                        new ViewCar();
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            if (Home.vehicleList.isEmpty()){
                JOptionPane.showMessageDialog(null, "Parking is Empty");
                setVisible(false);
                new ViewCar();
                return;
            }
            boolean isFounded=false;
                Vehicle v=null;
            for (Vehicle value : Home.vehicleList) {
                v = value;
                if (vNoSearch.isEmpty()) {
                    if (v.getVehicleNo().equalsIgnoreCase(pIdSearch)) {
                        isFounded = true;
                        break;
                    }
                }
                if (pIdSearch.isEmpty()) {
                    if (v.getVehicleNo().equalsIgnoreCase(vNoSearch)) {
                        isFounded = true;
                        break;
                    }
                }
            }
            if (isFounded){
                String cost=ReturnCar.totalChargesMethod(v.getParkingDays(),v.getParkingCharges());
                taVehicleDetail.setText(v.toString(cost));
            }

        } else if (ae.getSource() == print) {
            try {
                taVehicleDetail.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == update) {
            vNoSearch=cVehicleNo.getText();
            pIdSearch=cParkingId.getText();
            try {
                if (vNoSearch.isEmpty() && pIdSearch.isEmpty()){
                    JOptionPane.showMessageDialog(null, "ERROR... Search the Vehicle First");
                    setVisible(false);
                    new ViewCar();
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (Home.vehicleList.isEmpty()){
                JOptionPane.showMessageDialog(null, "Parking is Empty");
                setVisible(false);
                new ViewCar();
                return;
            }
            boolean isFounded=false;
            Vehicle v=null;
            for (Vehicle value : Home.vehicleList) {
                v = value;
                if (vNoSearch.isEmpty()) {
                    if (v.getVehicleNo().equalsIgnoreCase(pIdSearch)) {
                        isFounded = true;
                        break;
                    }
                }
                if (pIdSearch.isEmpty()) {
                    if (v.getVehicleNo().equalsIgnoreCase(vNoSearch)) {
                        isFounded = true;
                        break;
                    }
                }
            }
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
            setVisible(false);
            new UpdateVehicle(v);
//            Home.vehicleList.remove(v);
//            setVisible(false);
//            new UpdateVehicle(v.getParkingId(),v.getName(),v.getContact(),v.getVehicleNo(),
//                    v.getParkingSlot(),v.getParkingDays(),v.getParkingCharges());
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new ViewCar();
    }
}
