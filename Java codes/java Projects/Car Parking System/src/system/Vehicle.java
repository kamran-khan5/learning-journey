package system;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private final String parkingId;
    private final String name;
    private final String contact;
    private final String vehicleType;
    private final String vehicleNo;
    private final String parkingSlot;
    private final String parkingDays;
    private final String parkingCharges;

    public Vehicle(String parkingId, String name, String contact, String vehicleType,
                   String vehicleNo, String parkingSlot, String parkingDays, String parkingCharges) {
        this.parkingId = parkingId;
        this.name = name;
        this.contact = contact;
        this.vehicleType = vehicleType;
        this.vehicleNo = vehicleNo;
        this.parkingSlot = parkingSlot;
        this.parkingDays = parkingDays;
        this.parkingCharges = parkingCharges;
    }

    public String getParkingId() {
        return parkingId;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getParkingSlot() {
        return parkingSlot;
    }

    public String getParkingDays() {
        return parkingDays;
    }

    public String getParkingCharges() {
        return parkingCharges;
    }

    public String display(){
        return String.format("  \t====== Parking System ======\n\n  Parking Id :    \t\t%s\n  Name :          \t\t%s\n  " +
                        "Contact no :    \t\t%s\n  Vehicle Type :  \t\t%s\n  Vehicle No :    \t\t%s\n  Parking Slot :  " +
                        "\t\t%s\n  Parking Days :  \t\t%s\n" +
                        "  Parking Charges :\t\t%s\n\t ====== Thank you ======"
                ,parkingId, name, contact, vehicleType, vehicleNo, parkingSlot, parkingDays,
                parkingCharges);
    }

    public String toString(String cost){
        return String.format("  \t    DETAILS\n====================================\n\n             ====== Parking System " +
                        "======\n\n  Parking Id : \t\t%s\n  Name :              \t%s\n  " +
                        "Contact no :        \t%s\n  Vehicle Type :      \t%s\n  Vehicle No :        \t%s\n  Parking Slot :  " +
                        "\t%s\n  Parking Days :  \t%s\n" +
                "  Parking Charges :\t%s\n  Total Charges :\t%s\n\n             ====== Thank you ======"
                ,parkingId, name, contact, vehicleType, vehicleNo, parkingSlot, parkingDays,
                parkingCharges,cost);
    }

    public String returnView(String cost){
        return String.format("             ====== Parking System ======\n" + "                   ====== Details "+
                        "======\n\n  Parking Id : \t\t%s\n  Name :       \t\t%s\n  " +
                        "Contact no :    \t%s\n  Vehicle Type :  \t%s\n  Vehicle No :    \t%s\n  Parking Slot :  " +
                        "\t%s\n  Parking Days :  \t%s\n" +
                        "  Parking Charges :\t%s\n  Total Charges :\t%s\n                === Challah Receipt ===\n" +
                        "             ====== Thank you ======"
                ,parkingId, name, contact, vehicleType, vehicleNo, parkingSlot, parkingDays,
                parkingCharges,cost);
    }
}
