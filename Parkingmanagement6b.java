import java.util.Scanner;

interface Vehicle {
    void input(Scanner sc);
}

interface Parking {
    void display();
}

class ParkingManagement implements Vehicle, Parking {

    String vehicleNumber;
    int slotNumber;
    String entryTime;
    String exitTime;
    double parkingFee;

    public void input(Scanner sc) {

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

    public void display() {

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

        // Call by Reference using interface reference
        Vehicle v = new ParkingManagement();

        v.input(sc);

        Parking p = (Parking) v;
        p.display();

        sc.close();
    }
}