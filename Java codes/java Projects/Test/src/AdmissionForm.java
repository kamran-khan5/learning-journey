// Java program to implement a GUI
// application for the student
// management system

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javafx.print.Printer;
import java.io.*;


// Creating the AdmissionForm class
public class AdmissionForm extends Frame {

    JLabel admissionFormLabel, studentNameLabel, fatherNameLabel, rollNoLabel,
            emailLabel, contactNumberLabel, addressLabel, groupOfferedLabel,
            genderLabel, nationalityLabel, yearPassing12Label, marksIn10Label,
            marksIn12Label, yearPassing10Label, l15,campusLabel,educationLevelsLabel;

    JTextField studentNameTextField, fatherNameTextField, rollNoTextField,
            emailTextField, contactNumberTextField, nationalityTextField,
            marksIn10TextField, marksIn12TextField;

    JTextArea displayReceiptInfoTextArea, addressTextArea;

    JRadioButton morningRadioButton, eveningRadioButton, hostelRadioButton,
            dayScholarRadioButton;

    //JFileChooser f1;

    // Default constructor to
    // initialize the parameters
    AdmissionForm()
    {
        setTitle("Admission Form of COMSATS Abbottabad");
        admissionFormLabel = new JLabel("Admission Form");
        admissionFormLabel.setFont(new Font(admissionFormLabel.getFont().getName(), Font.PLAIN, 30));
        admissionFormLabel.setBounds(450, 50, 400, 40);

        studentNameLabel = new JLabel("Name of the Student:");
        studentNameLabel.setBounds(50, 150, 250, 20);

        studentNameTextField = new JTextField();
        studentNameTextField.setToolTipText("eg. Abdullah Zaheer");
        studentNameTextField.setBounds(250, 150, 250, 20);

        fatherNameLabel = new JLabel(
                "Name of the Father:");
        fatherNameLabel.setBounds(50, 200, 250, 20);

        fatherNameTextField = new JTextField();
        fatherNameTextField.setToolTipText("eg. Zaheer ud Din");
        fatherNameTextField.setBounds(250, 200, 250, 20);

        rollNoLabel = new JLabel("Roll Number:");
        rollNoLabel.setBounds(50, 250, 250, 20);

        rollNoTextField = new JTextField();
        rollNoTextField.setText("Sp22-BSE-");
        rollNoTextField.setToolTipText("eg. Sp22-Bse-004");
        rollNoTextField.setBounds(250, 250, 250, 20);

        emailLabel = new JLabel("Email ID:");
        emailLabel.setBounds(50, 300, 250, 20);

        emailTextField = new JTextField();
        emailTextField.setToolTipText("eg. abdullahzaheerofficial@gmail.com");
        emailTextField.setBounds(250, 300, 250, 20);

        contactNumberLabel = new JLabel("Contact Number:");
        contactNumberLabel.setBounds(50, 350, 250, 20);

        contactNumberTextField = new JTextField();
        contactNumberTextField.setText("+92 ");
        contactNumberTextField.setToolTipText("eg. +92 348 051 2223");
        contactNumberTextField.setBounds(250, 350, 250, 20);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 400, 250, 20);

        addressTextArea = new JTextArea();
        addressTextArea.setToolTipText("eg. Mansehra , Postal Code (21300)");
        addressTextArea.setBounds(250, 400, 250, 90);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 500, 250, 20);

        JRadioButton gender_MaleRadioButton
                = new JRadioButton(" Male");
        JRadioButton gender_FemaleRadioButton
                = new JRadioButton(" Female");

        gender_MaleRadioButton.setBounds(250, 500, 100, 30);
        gender_FemaleRadioButton.setBounds(350, 500, 100, 30);

        ButtonGroup genderRadioButtonGroup = new ButtonGroup();
        genderRadioButtonGroup.add(gender_MaleRadioButton);
        genderRadioButtonGroup.add(gender_FemaleRadioButton);

        nationalityLabel = new JLabel("Nationality:");
        nationalityLabel.setBounds(50, 550, 250, 20);

        nationalityTextField = new JTextField();
        nationalityTextField.setToolTipText("eg. Pakistani");
        nationalityTextField.setBounds(250, 550, 250, 20);

        yearPassing10Label = new JLabel(
                "Year of passing 10th");
        yearPassing10Label.setBounds(50, 600, 250, 20);

        String[] tenthYearPassing
                = { "2023","2022","2021","2020","2019","2018","2017","2016",
                "2015", "2014","2013" ,"2012","2011","2010"};

        JComboBox yearPassing10ComboBox
                = new JComboBox(tenthYearPassing);

        yearPassing10ComboBox.setBounds(250, 600, 90, 20);

        yearPassing12Label = new JLabel(
                "Year of passing 12th");
        yearPassing12Label.setBounds(50, 650, 250, 20);

        String[] secondYearPassing
                = { "2023","2022","2021","2020","2019","2018","2017","2016",
                "2015", "2014","2013" ,"2012","2011","2010"};

        JComboBox yearPassing12ComboBox
                = new JComboBox(secondYearPassing);
        yearPassing12ComboBox.setBounds(250, 650, 90, 20);

        marksIn10Label = new JLabel(
                "Points Scored in 10th:");
        marksIn10Label.setBounds(50, 700, 250, 20);

        marksIn10TextField = new JTextField();
        marksIn10TextField.setToolTipText("eg. Marks in Matric/A-Levels");
        marksIn10TextField.setBounds(250, 700, 250, 20);

        marksIn12Label = new JLabel("Points Scored in 12th:");
        marksIn12Label.setBounds(50, 750, 250, 20);

        marksIn12TextField = new JTextField();
        marksIn12TextField.setToolTipText("eg. Marks in Second-Year/O-Levels");
        marksIn12TextField.setBounds(250, 750, 250, 20);

        //ImageIcon i2 = new ImageIcon("2.png");
        //JLabel l15
        // = new JLabel("", i2, JLabel.CENTER);

        //l15.setBounds(900, 50, 600, 200);


        groupOfferedLabel = new JLabel(
                "Groups Offered here are:");
        groupOfferedLabel.setBounds(800, 150, 250, 20);

        morningRadioButton = new JRadioButton("Morning");
        morningRadioButton.setBounds(550, 150, 100, 30);

        eveningRadioButton = new JRadioButton("Evening");
        eveningRadioButton.setBounds(660, 150, 100, 30);

        ButtonGroup morning_eveningRadioButtonGroup = new ButtonGroup();

        morning_eveningRadioButtonGroup.add(morningRadioButton);
        morning_eveningRadioButtonGroup.add(eveningRadioButton);

        hostelRadioButton = new JRadioButton("HOSTEL LITE");
        hostelRadioButton.setBounds(550, 200, 120, 30);

        dayScholarRadioButton = new JRadioButton("DAY SCHOLAR");
        dayScholarRadioButton.setBounds(660, 200, 130, 30);

        ButtonGroup hostel_dayScholarRadioButtonGroup = new ButtonGroup();
        hostel_dayScholarRadioButtonGroup.add(hostelRadioButton);
        hostel_dayScholarRadioButtonGroup.add(dayScholarRadioButton);

        String courses[]
                = { "CS", "SE", "EE",
                "ES", "ME", "CSY", "PHAR",
                "PHY", "CHEM", "MATH" };

        final JComboBox coursesComboBox = new JComboBox(courses);
        coursesComboBox.setBounds(800, 200, 90, 20);

        final JLabel afterShowButtonClickedJlabel
                = new JLabel();
        afterShowButtonClickedJlabel.setBounds(600, 430, 800, 30);

        JButton showButton = new JButton("Show");
        showButton.setBounds(930, 400, 80, 30);

        campusLabel =new JLabel("Campuses:");
        campusLabel.setBounds(600, 270, 800, 30);

        educationLevelsLabel =new JLabel("Education Levels:");
        educationLevelsLabel.setBounds(800, 270, 800, 30);

        final DefaultListModel<String> campuses
                = new DefaultListModel<>();

        campuses.addElement("Abbottabad");
        campuses.addElement("Islamabad");
        campuses.addElement("Wah Cant");
        campuses.addElement("Karachi");
        campuses.addElement("Lahore");
        campuses.addElement("Attock");


        final JList<String> campusesJList = new JList<>(campuses);

        campusesJList.setBounds(600, 300, 125, 125);

        DefaultListModel<String> educationLevels
                = new DefaultListModel<>();

        educationLevels.addElement(
                "Under Graduate");
        educationLevels.addElement(
                "Post Graduate");
        educationLevels.addElement(
                "Doctorate");
        educationLevels.addElement(
                "Post Doctorate");

        final JList<String> educationLevelsJList
                = new JList<>(educationLevels);
        educationLevelsJList.setBounds(
                800, 300, 125, 125);

        JButton generateReceiptButton
                = new JButton("Generate Receipt");
        generateReceiptButton.setBounds(600, 490, 150, 30);
        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(750, 490, 150, 30);
        JButton printButton = new JButton("Print");
        printButton.setBounds(900, 490, 150, 30);

        displayReceiptInfoTextArea = new JTextArea();
        displayReceiptInfoTextArea.setEditable(false);
        displayReceiptInfoTextArea.setBounds(600, 540, 450, 240);

        add(admissionFormLabel);
        add(studentNameLabel);
        add(fatherNameLabel);
        add(rollNoLabel);
        add(emailLabel);
        add(contactNumberLabel);
        add(addressLabel);
        add(groupOfferedLabel);
        add(genderLabel);
        add(nationalityLabel);
        add(yearPassing10Label);
        add(yearPassing12Label);
        add(marksIn10Label);
        add(marksIn12Label);
        add(studentNameTextField);
        add(fatherNameTextField);
        add(rollNoTextField);
        add(emailTextField);
        add(contactNumberTextField);
        add(nationalityTextField);
        add(marksIn10TextField);
        add(marksIn12TextField);
        add(addressTextArea);
        add(displayReceiptInfoTextArea);
        add(campusLabel);
        //add(l15);
        add(morningRadioButton);
        add(eveningRadioButton);
        add(hostelRadioButton);
        add(dayScholarRadioButton);
        add(gender_MaleRadioButton);
        add(gender_FemaleRadioButton);
        add(coursesComboBox);
        add(yearPassing10ComboBox);
        add(yearPassing12ComboBox);
        add(campusesJList);
        add(educationLevelsJList);
        add(showButton);
        add(afterShowButtonClickedJlabel);
        add(generateReceiptButton);
        add(resetButton);
        add(printButton);
        add(educationLevelsLabel);

        showButton.addActionListener(new ActionListener() {

            // Method to display the data
            // entered in the text fields
            public void actionPerformed(ActionEvent e)
            {
                String data = "";
                if (campusesJList.getSelectedIndex() != -1) {
                    data = "You had selected the Campus "
                            + campusesJList.getSelectedValue();
                    data+=" and";
                    afterShowButtonClickedJlabel.setText(data);
                }
                if (educationLevelsJList.getSelectedIndex() != -1) {
                    data += " Education Level ";

                    for (Object frame :
                            educationLevelsJList.getSelectedValues()) {
                        data += frame + " ";
                    }
                }
                afterShowButtonClickedJlabel.setText(data);
            }
        });

        // Reset the text fields
        resetButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(
                            ActionEvent e)
                    {
                        displayReceiptInfoTextArea.setText("");
                        addressTextArea.setText(" ");
                        studentNameTextField.setText("");
                        fatherNameTextField.setText("");
                        rollNoTextField.setText("");
                        emailTextField.setText("");
                        contactNumberTextField.setText("");
                        nationalityTextField.setText(" ");
                        morning_eveningRadioButtonGroup.clearSelection();
                        hostel_dayScholarRadioButtonGroup.clearSelection();
                        campusesJList.clearSelection();
                        educationLevelsJList.clearSelection();


                    }
                });

        // Implementing the Print action
        printButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(
                            ActionEvent e)
                    {
                        try {
                            displayReceiptInfoTextArea.print();
                        }
                        catch (java.awt.print
                                       .PrinterException a) {
                            System.err.format(
                                    "NoPrinter Found",
                                    a.getMessage());
                        }
                    }
                });

        // Generating the receipt
        generateReceiptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                displayReceiptInfoTextArea.setText(
                        "\n-------------"
                                + "-----------FEE RECEIPT----"
                                + "--------------------------\n");

                displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                        + "Student Name: "
                        + studentNameTextField.getText()
                        + "\n");
                displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                        + "Father's Name: "
                        + fatherNameTextField.getText()
                        + "\n");
                displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                        + "RollNumber: "
                        + rollNoTextField.getText()
                        + "\n");
                displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                        + "Email ID: "
                        + emailTextField.getText()
                        + "\n");
                displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                        + "Contact Number: "
                        + contactNumberTextField.getText()
                        + "\n");
                displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                        + "Wants to take: "
                        + coursesComboBox.getSelectedItem()
                        + "\n");

                if (morningRadioButton.isSelected()) {
                    displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                            + "Wants to Join in "
                            + "Morning\n");
                }
                if (eveningRadioButton.isSelected()) {
                    displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                            + "Wants to Join in "
                            + "Evening\n");
                }
                if (hostelRadioButton.isSelected()) {
                    displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                            + "Wants to be a "
                            + "Hostel Lite \n");
                }
                if (dayScholarRadioButton.isSelected()) {
                    displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                            + "Wants to be a "
                            + "Day Scholar \n");
                }
                displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                        + "Campus chosen: "
                        + campusesJList.getSelectedValue()
                        .toString()
                        + "\n");
                displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                        + "Education Level chosen: "
                        + educationLevelsJList.getSelectedValue()
                        .toString()
                        + "\n");

                int index2 = educationLevelsJList.getSelectedIndex();
                if (index2 == 0) {
                    displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                            + "Total amount to be "
                            + "paid is 4 Lacs \n"
                            +"-------------"
                            + "-----------THANK YOU----"
                            + "--------------------------");
                }

                if (index2 == 1) {
                    displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                            + "Total amount to be paid "
                            + "is 3 Lacs \n"
                            +"-------------"
                            + "-----------THANK YOU----"
                            + "--------------------------");
                }

                if (index2 == 2) {
                    displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                            + "Total amount to be paid "
                            + "is 2.8 Lacs \n"
                            +"-------------"
                            + "-----------THANK YOU----"
                            + "--------------------------");
                }

                if (index2 == 3) {
                    displayReceiptInfoTextArea.setText(displayReceiptInfoTextArea.getText()
                            + "Total amount to be paid "
                            + "is 2.4 Lacs \n"
                            +"-------------"
                            + "-----------THANK YOU----"
                            + "--------------------------");
                }



                if (e.getSource() == generateReceiptButton) {
                    try {
                        FileWriter fw
                                = new FileWriter(
                                "java.txt", true);
                        fw.write(displayReceiptInfoTextArea.getText());
                        fw.close();
                    }
                    catch (Exception ae) {
                        System.out.println(ae);
                    }
                }

                JOptionPane.showMessageDialog(
                        displayReceiptInfoTextArea, "DATA SAVED SUCCESSFULLY IN FILE");
            };
        });
        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(
                            WindowEvent we)
                    {
                        System.exit(0);
                    }
                });




        setSize(1100, 1000);
        setLayout(null);
        setVisible(true);
        setBackground(Color.cyan);
        setResizable(false);
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(3);  available in jFrame



    }
    public static void main(String[] args)
    {
        new AdmissionForm();
    }
}