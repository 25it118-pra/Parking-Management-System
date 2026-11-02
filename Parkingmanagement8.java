import java.util.Scanner;
class InvalidParkingException extends Exception {
    InvalidParkingException(String message) {
        super(message);
    }
}
class Parking {
    String vehicleNumber;
    int slotNumber;

    Parking(String vehicleNumber, int slotNumber) {
        this.vehicleNumber = vehicleNumber;
        this.slotNumber = slotNumber;
    }

    void display() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Slot Number    : " + slotNumber);
    }
}
class ParkingManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Vehicle Number: ");
            String vehicleNumber = sc.nextLine();

            System.out.print("Enter Slot Number (1-50): ");
            int slotNumber = sc.nextInt();

            // Check for invalid slot
            if (slotNumber < 1 || slotNumber > 50) {
                throw new InvalidParkingException(
                    "Invalid Parking Slot! Slot must be between 1 and 50."
                );
            }

            Parking p = new Parking(vehicleNumber, slotNumber);

            System.out.println("\nParking Details");
            p.display();

        } catch (InvalidParkingException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}