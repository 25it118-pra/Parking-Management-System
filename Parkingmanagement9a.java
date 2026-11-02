class ParkingThread implements Runnable {

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

        ParkingThread obj = new ParkingThread("TN36AT8008");

        Thread t1 = new Thread(obj);

        t1.start();
    }
}