class ParkingResource {
    String name;

    ParkingResource(String name) {
        this.name = name;
    }
}

class Vehicle1 extends Thread {
    ParkingResource slot;
    ParkingResource gate;

    Vehicle1(ParkingResource slot, ParkingResource gate) {
        this.slot = slot;
        this.gate = gate;
    }

    public void run() {
        synchronized (slot) {
            System.out.println("Vehicle 1 locked " + slot.name);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            synchronized (gate) {
                System.out.println("Vehicle 1 locked " + gate.name);
            }
        }
    }
}

class Vehicle2 extends Thread {
    ParkingResource slot;
    ParkingResource gate;

    Vehicle2(ParkingResource slot, ParkingResource gate) {
        this.slot = slot;
        this.gate = gate;
    }

    public void run() {
        synchronized (gate) {
            System.out.println("Vehicle 2 locked " + gate.name);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            synchronized (slot) {
                System.out.println("Vehicle 2 locked " + slot.name);
            }
        }
    }
}

class ParkingManagement {
    public static void main(String[] args) {

        ParkingResource slot = new ParkingResource("Parking Slot");
        ParkingResource gate = new ParkingResource("Parking Gate");

        Vehicle1 v1 = new Vehicle1(slot, gate);
        Vehicle2 v2 = new Vehicle2(slot, gate);

        v1.start();
        v2.start();
    }
}