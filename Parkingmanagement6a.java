import java.util.Scanner;

abstract class Parking {

    String vehicleNumber;
    int slotNumber;
    String entryTime;
    String exitTime;
    double parkingFee;

    void input(Scanner sc) {

        System.out.print("Enter Vehicle Number: ");
        vehicleNumber = sc.nextLine();

        System.out.print("Enter Slot Number: ");
        slotNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Entry Time: ");
        entryTime = sc.nextLine();

        System.out.print("Enter Exit Time: ");
        exitTime = sc.nextLine();

        System.out.print("Enter Parking Fee: ");
        parkingFee = sc.nextDouble();
    }

    abstract void display();
}

class ParkingDetails extends Parking {

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

        p.input(sc);
        p.display();

        sc.close();
    }
}