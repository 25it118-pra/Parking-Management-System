import java.util.Scanner;

class Parking {

    String vehicleNumber;
    int slotNumber;

    void inputParking(Scanner sc) {

        System.out.print("Enter Vehicle Number: ");
        vehicleNumber = sc.nextLine();

        System.out.print("Enter Slot Number: ");
        slotNumber = sc.nextInt();
        sc.nextLine();
    }
}

class ParkingDetails extends Parking {

    String entryTime;
    String exitTime;
    double parkingFee;

    void inputDetails(Scanner sc) {

        System.out.print("Enter Entry Time: ");
        entryTime = sc.nextLine();

        System.out.print("Enter Exit Time: ");
        exitTime = sc.nextLine();

        System.out.print("Enter Parking Fee: ");
        parkingFee = sc.nextDouble();
    }

    void display() {

        System.out.println("\n------ Parking Management System ------");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Slot Number    : " + slotNumber);
        System.out.println("Entry Time     : " + entryTime);
        System.out.println("Exit Time      : " + exitTime);
        System.out.println("Parking Fee    : Rs." + parkingFee);
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ParkingDetails p = new ParkingDetails();

        p.inputParking(sc);
        p.inputDetails(sc);
        p.display();

        sc.close();
    }
}