
import java.util.Scanner;

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
        System.out.println("\nVehicle Number : " + vehicleNumber);
        System.out.println("Slot Number    : " + slotNumber);
        System.out.println("Entry Time     : " + entryTime);
        System.out.println("Exit Time      : " + exitTime);
        System.out.println("Parking Fee    : Rs." + parkingFee);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Slot Number: ");
        int slotNumber = sc.nextInt();

        sc.nextLine(); // Clears the newline left by nextInt()

        System.out.print("Enter Entry Time: ");
        String entryTime = sc.nextLine();

        System.out.print("Enter Exit Time: ");
        String exitTime = sc.nextLine();

        System.out.print("Enter Parking Fee: ");
        double parkingFee = sc.nextDouble();


        Parking p1 = new Parking();

        Parking p2 = new Parking(
            vehicleNumber,
            slotNumber,
            entryTime,
            exitTime,
            parkingFee
        );

        Parking p3 = new Parking(p2);

        System.out.println("\nDefault Constructor Details:");
        p1.display();

        System.out.println("Parameterized Constructor Details:");
        p2.display();

        System.out.println("Copy Constructor Details:");
        p3.display();

        sc.close();
    }
}
