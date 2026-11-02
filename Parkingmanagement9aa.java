class ParkingThread extends Thread {

    String vehicleNumber;

    ParkingThread(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void run() {
        System.out.println("Vehicle " + vehicleNumber + " is entering the parking area.");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Parking process: " + i);
        }

        System.out.println("Vehicle " + vehicleNumber + " parked successfully.");
    }
}

class ParkingManagement {
    public static void main(String[] args) {

        ParkingThread t1 = new ParkingThread("TN36AT8008");

        t1.start();
    }
}