import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.PrintJob;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;


public class TokenGenerator extends Frame implements ActionListener {
    Random ran = new Random();

    int number = ran.nextInt(99999)+1;
    JLabel patientIdLabel,patientNameLabel,patientSexLabel,currentTimeLabel,
            currentDateLabel,checkUpTimeLabel,checkUpDateLabel,doctorAvailableLabel,
            roomCategoryLabel,tokenGeneratorLabel,patientAgeLabel;

    JTextField patientIdTextField,patientNameTextField,patientAgeTextField, currentTimeTextField
            ,currentDateTextField,checkUpDateTextField,checkUpTimeTextField;

    JRadioButton maleRadioButton,femaleRadioButton;

    JTextArea tokenInfoTextArea;

    JButton generateTokenButton,resetButton,printButton;

    ButtonGroup sexRadioButtonGroup;

    final JComboBox roomAvailableComboBox;

    JCheckBox saveToFileCheckBox;

    final DefaultListModel<String> doctorsList
            = new DefaultListModel<>();

    final JList<String> doctorJList = new JList<>(doctorsList);

    String[] roomAvailable
            = { "Select Room", "Separate Room", "2 Beds Room","3 Beds Room",
            "4 Beds Room","5 Beds Room","6 Beds Room", "8 Beds Room","10 Beds Room"
            ,"12 Beds Room", "Hall"};
    TokenGenerator(){



        tokenGeneratorLabel = new JLabel("Token Generator");
        tokenGeneratorLabel.setFont(new Font(tokenGeneratorLabel.getFont().getName(), Font.PLAIN, 30));
        tokenGeneratorLabel.setBounds(450, 50, 400, 40);
        add(tokenGeneratorLabel);

        patientIdLabel = new JLabel("Patient ID:");
        patientIdLabel.setBounds(50, 150, 250, 20);
        add(patientIdLabel);

        patientIdTextField = new JTextField(number+"");
        patientIdTextField.setBounds(250, 150, 250, 20);
        patientIdTextField.setEditable(false);
        add(patientIdTextField);

        patientNameLabel = new JLabel("Name of the Patient:");
        patientNameLabel.setBounds(50, 200, 250, 20);
        add(patientNameLabel);

        patientNameTextField = new JTextField();
        patientNameTextField.setBounds(250, 200, 250, 20);
        add(patientNameTextField);

        patientAgeLabel = new JLabel("Patient Age:");
        patientAgeLabel.setBounds(50, 250, 250, 20);
        add(patientAgeLabel);

        patientAgeTextField = new JTextField();
        patientAgeTextField.setBounds(250, 250, 250, 20);
        add(patientAgeTextField);

        patientSexLabel = new JLabel("Sex:");
        patientSexLabel.setBounds(50, 310, 250, 30);
        add(patientSexLabel);

        maleRadioButton=new JRadioButton("Male");
        maleRadioButton.setBounds(250,310,100,30);
        add(maleRadioButton);

        femaleRadioButton=new JRadioButton("Female");
        femaleRadioButton.setBounds(350,310,100,30);
        add(femaleRadioButton);

        sexRadioButtonGroup = new ButtonGroup();
        sexRadioButtonGroup.add(maleRadioButton);
        sexRadioButtonGroup.add(femaleRadioButton);

        currentTimeLabel=new JLabel("current Time:");
        currentTimeLabel.setBounds(50,390,250,20);
        add(currentTimeLabel);

        currentTimeTextField =new JTextField(String.valueOf(LocalTime.now()));
        currentTimeTextField.setBounds(250, 390, 250, 20);
        currentTimeTextField.setEditable(false);
        add(currentTimeTextField);

        currentDateLabel=new JLabel("current Date:");
        currentDateLabel.setBounds(50,460,250,20);
        add(currentDateLabel);

        currentDateTextField =new JTextField(String.valueOf(LocalDate.now()));
        currentDateTextField.setBounds(250, 460, 250, 20);
        currentDateTextField.setEditable(false);
        add(currentDateTextField);

        checkUpTimeLabel=new JLabel("CheckUp Time:");
        checkUpTimeLabel.setBounds(50,530,250,20);
        add(checkUpTimeLabel);

        checkUpTimeTextField =new JTextField();
        checkUpTimeTextField.setBounds(250, 530, 250, 20);
        add(checkUpTimeTextField);

        checkUpDateLabel=new JLabel("CheckUp Date:");
        checkUpDateLabel.setBounds(50,600,250,20);
        add(checkUpDateLabel);

        checkUpDateTextField =new JTextField();
        checkUpDateTextField.setBounds(250, 600, 250, 20);
        add(checkUpDateTextField);

        doctorAvailableLabel=new JLabel("Available Doctors:");
        doctorAvailableLabel.setBounds(550,150,250,20);
        add(doctorAvailableLabel);

        roomCategoryLabel=new JLabel("Room Category:");
        roomCategoryLabel.setBounds(800, 150, 250, 20);
        add(roomCategoryLabel);

        roomAvailableComboBox = new JComboBox(roomAvailable);
        roomAvailableComboBox.setBounds(800, 180, 150, 20);
        add(roomAvailableComboBox);

        doctorsList.addElement("Muhammad");
        doctorsList.addElement("Khan");
        doctorsList.addElement("Ali");
        doctorsList.addElement("raza");
        doctorsList.addElement("ahmad");
        doctorsList.addElement("farooq");


        doctorJList.setBounds(550, 180, 125, 125);
        add(doctorJList);

        saveToFileCheckBox=new JCheckBox("Save To file",true);
        saveToFileCheckBox.setBounds(550,320,250,40);
        add(saveToFileCheckBox);

        tokenInfoTextArea = new JTextArea();
        tokenInfoTextArea.setEditable(false);
        //displayReceiptInfoTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        tokenInfoTextArea.setBounds(550, 380, 450, 240);
        add(tokenInfoTextArea);

        generateTokenButton=new JButton("Generate Token");
        generateTokenButton.setBounds(550, 640, 150, 30);
        generateTokenButton.addActionListener(this);
        add(generateTokenButton);

        resetButton=new JButton("Reset");
        resetButton.setBounds(710, 640, 150, 30);
        resetButton.addActionListener(this);
        add(resetButton);

        printButton=new JButton("Print");
        printButton.setBounds(880, 640, 130, 30);
        printButton.addActionListener(this);
        add(printButton);

        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(
                            WindowEvent we)
                    {
                        System.exit(0);
                    }
                });



        setTitle("Patient TokenSlip Generator");
        setSize(1050, 700);
        setLayout(null);
        setBackground(Color.GREEN);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==printButton){
            boolean canPrint=true;
            try {
                if (isFormNotFill()){
                    JOptionPane.showMessageDialog(null, "ERROR... Fill the Form");
                    canPrint = false;
                }
            }catch (Exception a) {
                a.printStackTrace();
            }
            if (canPrint){
                try {
                    tokenInfoTextArea.print();
                }
                catch (java.awt.print.PrinterException a) {
                    System.err.format(
                            "NoPrinter Found",
                            a.getMessage());
                }

                if (saveToFileCheckBox.isSelected()){
                    try {
                        FileWriter fw
                                = new FileWriter(
                                "PatientTokenRecord.txt", true);
                        fw.write(tokenInfoTextArea.getText());
                        fw.close();
                    }
                    catch (Exception ae) {
                        System.out.println(ae);
                    }

                    JOptionPane.showMessageDialog(
                            tokenInfoTextArea, "DATA SAVED SUCCESSFULLY IN FILE");
                }
            }

        } else if (source==resetButton) {
            patientIdTextField.setText("");
            patientNameTextField.setText("");
            patientAgeTextField.setText("");
            sexRadioButtonGroup.clearSelection();
            tokenInfoTextArea.setText("");

        } else if (source==generateTokenButton) {
            boolean canGenerate=true;
            try {
                if (isFormNotFill()){
                    JOptionPane.showMessageDialog(null, "ERROR... Fill the Form");
                    canGenerate = false;
                }
            }catch (Exception a) {
                a.printStackTrace();
            }
            if (canGenerate){
                tokenInfoTextArea.setText("----------------------Token#"+patientIdTextField.getText()+"-------------------------------\n");
                tokenInfoTextArea.append(patientIdLabel.getText()+"\t"+patientIdTextField.getText());
                tokenInfoTextArea.append("\n"+patientNameLabel.getText()+"\t"+patientNameTextField.getText());
                if(maleRadioButton.isSelected()){
                    tokenInfoTextArea.append("\nSex:\tMale");
                } else if (femaleRadioButton.isSelected()) {
                    tokenInfoTextArea.append("\nSex:\tFemale");
                }
                tokenInfoTextArea.append("\n"+checkUpDateLabel.getText()+"\t"+checkUpDateTextField.getText());
                tokenInfoTextArea.append("\n"+checkUpTimeLabel.getText()+"\t"+checkUpTimeTextField.getText());
                int index=doctorJList.getSelectedIndex();
                if (index==0){
                    tokenInfoTextArea.append("\nDoctor:\tDr "+"Muhammad");
                } else if (index==1) {
                    tokenInfoTextArea.append("\nDoctor:\tDr "+"Khan");
                } else if (index==2) {
                    tokenInfoTextArea.append("\nDoctor:\tDr "+"Ali");
                } else if (index==3) {
                    tokenInfoTextArea.append("\nDoctor:\tDr "+"Amina");
                } else if (index==4) {
                    tokenInfoTextArea.append("\nDoctor:\tDr "+"Zainab ");
                } else if (index==5) {
                    tokenInfoTextArea.append("\nDoctor:\tDr "+"Ayesha");
                }
                int index2=roomAvailableComboBox.getSelectedIndex();
                if(index2==0)
                {
                    tokenInfoTextArea.append("\n"+roomCategoryLabel.getText()+"\t"+"No Room Selected");
                } else if (index2==1) {
                    tokenInfoTextArea.append("\n"+roomCategoryLabel.getText()+"\t"+"Separate Room");
                } else if (index2==2) {
                    tokenInfoTextArea.append("\n"+roomCategoryLabel.getText()+"\t"+"2 Beds Room");
                } else if (index2==3) {
                    tokenInfoTextArea.append("\n"+roomCategoryLabel.getText()+"\t"+"3 Beds Room");
                } else if (index2==4) {
                    tokenInfoTextArea.append("\n"+roomCategoryLabel.getText()+"\t"+"4 Beds Room");
                } else if (index2==5) {
                    tokenInfoTextArea.append("\n"+roomCategoryLabel.getText()+"\t"+"5 Beds Room");
                } else if (index2==6) {
                    tokenInfoTextArea.append("\n"+roomCategoryLabel.getText()+"\t"+"6 Beds Room");
                } else if (index2==7) {
                    tokenInfoTextArea.append("\n"+roomCategoryLabel.getText()+"\t"+"8 Beds Room");
                } else if (index2==8) {
                    tokenInfoTextArea.append("\n"+roomCategoryLabel.getText()+"\t"+"10 Beds Room");
                } else if (index2==9) {
                    tokenInfoTextArea.append("\n"+roomCategoryLabel.getText()+"\t"+"12 Beds Room");
                } else if (index2==10) {
                    tokenInfoTextArea.append("\n"+roomCategoryLabel.getText()+"\t"+"Hall");
                }
                tokenInfoTextArea.append("\n-----------------------Thanks-------------------------------\n");

                if (saveToFileCheckBox.isSelected()){
                    try {
                        FileWriter fw
                                = new FileWriter(
                                "PatientTokenRecord.txt", true);
                        fw.write(tokenInfoTextArea.getText());
                        fw.close();
                    }
                    catch (Exception ae) {
                        System.out.println(ae);
                    }

                    JOptionPane.showMessageDialog(
                            tokenInfoTextArea, "DATA SAVED SUCCESSFULLY IN FILE");
                }

            }
        }
    }

    private boolean isFormNotFill(){
        return patientNameTextField.getText().isEmpty() || patientAgeTextField.getText().isEmpty()||
        checkUpDateTextField.getText().isEmpty() || checkUpTimeTextField.getText().isEmpty();
    }



    public static void main(String[] args) {
        new TokenGenerator();
    }
}