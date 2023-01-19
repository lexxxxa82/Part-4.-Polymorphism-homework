//import Driver.DriverB;
//import Driver.DriverC;
//import Driver.DriverD;
//import exception.CarLicenseException;
//import transport.*;
//
//public class Main {
//    public static void main(String[] args) throws CarLicenseException {
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, BodyType.BODY_TYPE_COUPE);
//        Car bmw = new Car("BMW", "Z8", 3.2, BodyType.BODY_TYPE_SEDAN);
//        Car kia = new Car("Kia", "Shortage 4-го поколения", 2.4, BodyType.BODY_TYPE_CROSSOVER);
//        Car lada = new Car("Lada", "Granta", 1.7, BodyType.BODY_TYPE_HATCHBACK);
//
//
//        System.out.println(audi);
//        audi.startMoving();
//        audi.stopMoving();
//        audi.pitStop();
//        audi.getBestLapTime();
//        audi.getMaximumSpeed();
//        audi.printType();
//        System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println(lada);
//
//
//        Bus daewoo = new Bus("DAEWOO", "BS090", 8, SeatsCapacity.SEATS_CAPACITY_EXTREMELY_LARGE);
//        Bus kamaz = new Bus("Камаз", "5299", 6.7, SeatsCapacity.SEATS_CAPACITY_LARGE);
//        Bus mercedes = new Bus("MERCEDES ", "Tourismo", 10, SeatsCapacity.SEATS_CAPACITY_EXTREMELY_LARGE);
//        Bus foton = new Bus("foton", "BJ6126", 9.5, SeatsCapacity.SEATS_CAPACITY_EXTREMELY_SMALL);
//
//        System.out.println(daewoo);
//        daewoo.startMoving();
//        daewoo.stopMoving();
//        daewoo.pitStop();
//        daewoo.getBestLapTime();
//        daewoo.getMaximumSpeed();
//        daewoo.printType();
//        System.out.println(kamaz);
//        System.out.println(mercedes);
//        System.out.println(foton);
//
//        Truck kamaz4326 = new Truck("Kamaz", "4ф326", 18.5, LoadCapacity.LOAD_CAPACITY_N3);
//        Truck ivecoStralis = new Truck("Iveco", "Stralis", 12.9, LoadCapacity.LOAD_CAPACITY_N3);
//        Truck hino500 = new Truck("Hino", "500", 12.5, LoadCapacity.LOAD_CAPACITY_N2);
//        Truck dafX2 = new Truck("DAF", "X2", 11.5, LoadCapacity.LOAD_CAPACITY_N3);
//
//        System.out.println(kamaz4326);
//        kamaz4326.startMoving();
//        kamaz4326.stopMoving();
//        kamaz4326.pitStop();
//        kamaz4326.getBestLapTime();
//        kamaz4326.getMaximumSpeed();
//        kamaz4326.printType();
//        hino500.printType();
//        System.out.println(ivecoStralis);
//        System.out.println(hino500);
//        System.out.println(dafX2);
//
//        DriverD<Bus> baev = new DriverD<Bus>("Баев Алексей Петрович>", true, 5);
//        baev.drive(daewoo);
//        DriverB<Car> godun = new DriverB<Car>("Годун Владимир Николаевич", true, 8);
//        godun.drive(audi);
//        DriverC<Truck> serov = new DriverC<Truck>("Серов Виктор Александрович", true, 12);
//        serov.drive(dafX2);
//        System.out.println(serov);
//      //  serov.setDriversLicence(false);
//      // daewoo.diagnosticsPass();
//        Transport.performDiagnostics(audi,bmw,kia,lada,daewoo,kamaz,mercedes,foton,kamaz4326,ivecoStralis,hino500,dafX2);
//
//    }
//}
