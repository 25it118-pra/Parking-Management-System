 class Parking {

    private String vehicleNumber;
    private int slotNumber;
    private String entryTime;
    private String exitTime;
    private double parkingFee;


    static int totalVehicles = 0;


    public void input() {
        vehicleNumber = "TN36AT8008";
        slotNumber = 36;
        entryTime = "8:46 AM";
        exitTime = "12:05 PM";
        parkingFee = 200.0;

        totalVehicles++;
    }


    public static void vehicle() {
        System.out.println(
            "------------ PARKING MANAGEMENT SYSTEM ------------"
        );
        System.out.println("Total Vehicles: " + totalVehicles);
    }

    public void display(String vehicleNumber, int slotNumber) {

        this.vehicleNumber = vehicleNumber;
        this.slotNumber = slotNumber;

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Slot Number: " + slotNumber);
    }
    public void display(String vehicleNumber,
                        int slotNumber,
                        double parkingFee) {

        this.vehicleNumber = vehicleNumber;
        this.slotNumber = slotNumber;
        this.parkingFee = parkingFee;

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Slot Number: " + slotNumber);
        System.out.println("Parking Fee: Rs." + parkingFee);
    }
    public void display(String vehicleNumber,
                        int slotNumber,
                        String entryTime,
                        String exitTime,
                        double parkingFee) {

        this.vehicleNumber = vehicleNumber;
        this.slotNumber = slotNumber;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.parkingFee = parkingFee;

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Slot Number: " + slotNumber);
        System.out.println("Entry Time: " + entryTime);
        System.out.println("Exit Time: " + exitTime);
        System.out.println("Parking Fee: Rs." + parkingFee);
    }
}


class Main {

    public static void main(String[] args) {

        Parking p = new Parking();
        p.input();

        Parking.vehicle();

        System.out.println();

        p.display("TN36AT8008", 36);

        System.out.println();

        p.display("TN36AT8008", 36, 200.0);

        System.out.println();

        p.display(
                "TN36AT8008",
                36,
                "8:46 AM",
                "12:05 PM",
                200.0
        );
    }
}