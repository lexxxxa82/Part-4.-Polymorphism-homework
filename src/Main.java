import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        Car bmw = new Car("BMW", "Z8", 3.2);
        Car kia = new Car("Kia", "Shortage 4-го поколения", 2.4);
        Car lada = new Car("Lada", "Granta", 1.7);

        System.out.println(audi);
        audi.startMoving();
        audi.stopMoving();
        audi.pitStop();
        audi.getBestLapTime();
        audi.getMaximumSpeed();
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(lada);

        Bus daewoo = new Bus("DAEWOO", "BS090", 8);
        Bus kamaz = new Bus("Камаз", "5299", 6.7);
        Bus mercedes = new Bus("MERCEDES ", "Tourismo", 10);
        Bus foton = new Bus("foton", "BJ6126", 9.5);
        System.out.println(daewoo);
        daewoo.startMoving();
        daewoo.stopMoving();
        daewoo.pitStop();
        daewoo.getBestLapTime();
        daewoo.getMaximumSpeed();
        System.out.println(kamaz);
        System.out.println(mercedes);
        System.out.println(foton);

        Truck kamaz4326 = new Truck("Kamaz", "4326", 18.5);
        Truck ivecoStralis = new Truck("Iveco", "Stralis", 12.9);
        Truck hino500 = new Truck("Hino", "500", 12.5);
        Truck dafX2 = new Truck("DAF", "X2", 11.5);

        System.out.println(kamaz4326);
        kamaz4326.startMoving();
        kamaz4326.stopMoving();
        kamaz4326.pitStop();
        kamaz4326.getBestLapTime();
        kamaz4326.getMaximumSpeed();
        System.out.println(ivecoStralis);
        System.out.println(hino500);
        System.out.println(dafX2);

        DriverD<Bus> baev = new DriverD<Bus>("Баев Алексей Петрович>", true, 5);
        baev.drive(daewoo);
        DriverB<Car> godun = new DriverB<Car>("Годун Владимир Николаевич", true, 8);
        godun.drive(audi);
        DriverC<Truck> serov = new DriverC<Truck>("Серов Виктор Александрович", true, 12);
        serov.drive(dafX2);

    }
}
