package parking;

public class Parking {

    String vehicleNumber;
    int slotNumber;
    double parkingFee;

    public Parking(String vehicleNumber, int slotNumber, double parkingFee) {
        this.vehicleNumber = vehicleNumber;
        this.slotNumber = slotNumber;
        this.parkingFee = parkingFee;
    }

    public void display() {
        System.out.println("\n--- PARKING MANAGEMENT SYSTEM ---");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Slot Number    : " + slotNumber);
        System.out.println("Parking Fee    : Rs." + parkingFee);
    }
}