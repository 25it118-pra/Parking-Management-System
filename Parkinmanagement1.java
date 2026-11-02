
class Parking { 

    String vehicleNumber;
    int slotNumber;
    String entryTime;
    String exitTime;
    double parkingFee;

    Parking() {
        vehicleNumber = "Not Assigned";
        slotNumber = 0;
        entryTime = "--";
        exitTime = "--";
        parkingFee = 0.0;
    }
    
    Parking(String vehicleNumber, int slotNumber,
            String entryTime, String exitTime, double parkingFee) {

        this.vehicleNumber = vehicleNumber;
        this.slotNumber = slotNumber;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.parkingFee = parkingFee;
    }
   
    Parking(Parking p) {

        this.vehicleNumber = p.vehicleNumber;
        this.slotNumber = p.slotNumber;
        this.entryTime = p.entryTime;
        this.exitTime = p.exitTime;
        this.parkingFee = p.parkingFee;
    }

    void display() {

        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Slot Number    : " + slotNumber);
        System.out.println("Entry Time     : " + entryTime);
        System.out.println("Exit Time      : " + exitTime);
        System.out.println("Parking Fee    : Rs." + parkingFee);
        System.out.println();
    }

    public static void main(String[] args) {

        Parking p1 = new Parking();

        Parking p2 = new Parking(
                "TN38AB1234",
                15,
                "09:00 AM",
                "11:30 AM",
                120.0);

        Parking p3 = new Parking(p2);

        p1.display();
        p2.display();
        p3.display();
    }
}
