package PatronesComportamiento.PatronIterator;

public class Main {
    public static void main(String[] args) {
        Devices devices = new Devices();

        devices.create(new Device("Apple", "iPhone 8", 2018, 64, "iOS 13"));
        devices.create(new Device("Apple", "iPhone 9", 2019, 128, "iOS 14"));
        devices.create(new Device("Apple", "iPhone 10", 2020, 256, "iOS 15"));
        devices.create(new Device("Apple", "iPhone 11", 2021, 512, "iOS 16"));

        while (devices.haveMore()) {
            Device device = devices.next();
            System.out.println("El dispositivo es un: " + device.getModel() + " fabricado el " + device.getYear());
        }

        devices.create(new Device("Apple", "iPhone 12", 2022, 512, "iOS 17"));
        Device device = devices.next();
        System.out.println("El dispositivo es un: " + device.getModel() + " fabricado el " + device.getYear());


    }
}
