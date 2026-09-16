//package system;
//
//import java.io.*;
//import java.util.ArrayList;
//
//public class FileHandler {
//    private static final String FILE_PATH = "objectFile.txt";
//
//    public static void writePatientRecords(ArrayList<Vehicle> patientList) {
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
//            objectOutputStream.writeObject(patientList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static ArrayList<Vehicle> readPatientRecords() {
//        ArrayList<Vehicle> patientList = new ArrayList<>();
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
//            patientList = (ArrayList<Vehicle>) objectInputStream.readObject();
//        } catch (ClassNotFoundException | IOException e) {
//            // Handle exceptions appropriately
//        }
//        return patientList;
//    }
//}
//
