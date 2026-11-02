class Parking {

    int slot = 0;

    synchronized void parkVehicle() {
        try {
            while (slot == 0) {
                System.out.println("No parking slot available.");
                wait();
            }

            slot--;
            System.out.println("Vehicle parked successfully.");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void releaseSlot() {
        slot++;
        System.out.println("Parking slot released.");
        notify();
    }
}

class ParkingManagement {

    public static void main(String[] args) {

        Parking p = new Parking();

        Thread vehicle = new Thread(() -> {
            p.parkVehicle();
        });

        Thread exit = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            p.releaseSlot();
        });

        vehicle.start();
        exit.start();
    }
}