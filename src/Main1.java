import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import exception.CarLicenseException;
import mechanic.CarRepairSpecialization;
import mechanic.Mechanic;
import transport.*;

import java.util.*;

public class Main1 {
    public static void main(String[] args) throws CarLicenseException {

        ArrayList<Driver> drivers = new ArrayList<>();
        DriverB<Car> andrej = new DriverB<Car>("Andrej Alekseevich Mihailov", true, 11, "B");
        DriverB<Car> ekaterina = new DriverB<Car>("Ekaterina Alekseevna Kuzmich", true,
                17, null);
        DriverB<Car> artjom = new DriverB<Car>("Artjom Nikolajevich Zhilin", true, 9,
                "Y");
        DriverB<Car> aleksandra = new DriverB<Car>("Aleksandra Evgenjevna Klimova", true,
                8, "B");
        DriverC<Truck> sergej = new DriverC<Truck>("Sergej Aleksandrovich Skvortcov", true,
                10, "C");
        DriverC<Truck> nina = new DriverC<Truck>("Nina Sergeevna Poznjakova", true, 10,
                "C");
        DriverC<Truck> arkadij = new DriverC<Truck>("Arkadij Sergeevich Tumanov", true, 20,
                "C");
        DriverC<Truck> tatjana = new DriverC<Truck>("Tatjana Alekseevna Guseva", true, 17,
                "C");
        DriverD<Bus> ilja = new DriverD<Bus>("Ilja Andreevich Semenov", true, 12,
                "D");
        DriverD<Bus> irina = new DriverD<Bus>("Irina Mihailovna Malisheva", true, 14,
                "D");
        DriverD<Bus> innokentij = new DriverD<Bus>("Innokentij Petrovich Muhin", true,
                10, "D");
        DriverD<Bus> elizaveta = new DriverD<Bus>("Elizaveta Petrovna Guschina", true, 8,
                "D");
        drivers.add(andrej);
        drivers.add(ekaterina);
        drivers.add(artjom);
        drivers.add(aleksandra);
        drivers.add(sergej);
        drivers.add(nina);
        drivers.add(arkadij);
        drivers.add(tatjana);
        drivers.add(ilja);
        drivers.add(irina);
        drivers.add(innokentij);
        drivers.add(elizaveta);
        andrej.setCategory("q");
        // System.out.println(drivers);
        drivers.forEach(System.out::println);

        ArrayList<Mechanic> mechanics = new ArrayList<>();
        Mechanic leonid = new Mechanic("Leonid Kirillov", "MTM",
                CarRepairSpecialization.SPECIFICATION_CAR);
        Mechanic aleksej = new Mechanic("Aleksej Sinitcin", "MehTeh",
                CarRepairSpecialization.SPECIFICATION_BUS);
        Mechanic vladimir = new Mechanic("Vladimir Nikiforov", "Avto Profi",
                CarRepairSpecialization.SPECIFICATION_TRUCK);
        Mechanic anton = new Mechanic("Anton Kovalev", "Spectrans",
                CarRepairSpecialization.SPECIFICATION_UNIVERSAL);
        Mechanic maria = new Mechanic("Maria Inina", "ABT",
                CarRepairSpecialization.SPECIFICATION_CAR);
        Mechanic ksenia = new Mechanic("Ksenia Starostina", "GP",
                CarRepairSpecialization.SPECIFICATION_BUS);
        Mechanic elena = new Mechanic("Elena German", "AutoDelo",
                CarRepairSpecialization.SPECIFICATION_TRUCK);
        Mechanic anastasia = new Mechanic("Anastasia Eremina", "Remservis",
                CarRepairSpecialization.SPECIFICATION_UNIVERSAL);
        Mechanic gennadij = new Mechanic("Gennadij Semenchuk", "STM",
                CarRepairSpecialization.SPECIFICATION_CAR);
        Mechanic matvej = new Mechanic("Matvej Gubin", "Busfix",
                CarRepairSpecialization.SPECIFICATION_BUS);
        Mechanic mark = new Mechanic("Mark Kent", "Schumtruck",
                CarRepairSpecialization.SPECIFICATION_TRUCK);
        Mechanic arsenij = new Mechanic("Arsenij Kisilev", "Unicar",
                CarRepairSpecialization.SPECIFICATION_UNIVERSAL);


        mechanics.add(leonid);
        mechanics.add(aleksej);
        mechanics.add(vladimir);
        mechanics.add(anton);
        mechanics.add(maria);
        mechanics.add(ksenia);
        mechanics.add(elena);
        mechanics.add(anastasia);
        mechanics.add(gennadij);
        mechanics.add(matvej);
        mechanics.add(mark);
        mechanics.add(arsenij);
        // System.out.println(mechanics);
        mechanics.forEach(System.out::println);
        System.out.println();

        ArrayList<Transport> transports = new ArrayList<>();
        Car bmwZ4 = new Car("BMW", "Z4", 4.0, ekaterina, mechanics, drivers,
                BodyType.BODY_TYPE_COUPE);
        Car audiR8 = new Car("Audi", "R8", 4.2, andrej, mechanics,
                drivers, BodyType.BODY_TYPE_COUPE);
        Car porsche911 = new Car("Porsche", "911", 4.5, artjom,
                mechanics, drivers, BodyType.BODY_TYPE_COUPE);
        Car mitsubishiLancerEvolution = new Car("Mitsubishi", "Lancer Evolution", 2.5,
                aleksandra, mechanics, drivers, BodyType.BODY_TYPE_SEDAN);

        Bus neoplanN5218 = new Bus("Neoplan", "N5218", 12.4, ilja,
                mechanics, drivers, SeatsCapacity.SEATS_CAPACITY_LARGE);
        Bus mercedesBenzTravego = new Bus("Mercedes-Benz", "Travego", 11.9,
                irina, mechanics, drivers, SeatsCapacity.SEATS_CAPACITY_MEDIUM);
        Bus scaniaTouring = new Bus("Scania", "Touring", 13.0, innokentij,
                mechanics, drivers, SeatsCapacity.SEATS_CAPACITY_LARGE);
        Bus ikarus386 = new Bus("Ikarus", "386", 10.3, elizaveta,
                mechanics, drivers, SeatsCapacity.SEATS_CAPACITY_LARGE);

        Truck kamaz4326 = new Truck("Kamaz", "4326", 18.5, sergej,
                mechanics, drivers, LoadCapacity.LOAD_CAPACITY_N2);
        Truck ivecoStralis = new Truck("Iveco", "Stralis", 12.9, nina, mechanics,
                drivers, LoadCapacity.LOAD_CAPACITY_N1);
        Truck hino500 = new Truck("Hino", "500", 12.5, arkadij, mechanics, drivers,
                LoadCapacity.LOAD_CAPACITY_N2);
        Truck dafX2 = new Truck("DAF", "X2", 11.5, tatjana, mechanics, drivers,
                LoadCapacity.LOAD_CAPACITY_N2);

        transports.add(bmwZ4);
        transports.add(audiR8);
        transports.add(porsche911);
        transports.add(mitsubishiLancerEvolution);

        transports.add(neoplanN5218);
        transports.add(mercedesBenzTravego);
        transports.add(scaniaTouring);
        transports.add(ikarus386);

        transports.add(kamaz4326);
        transports.add(ivecoStralis);
        transports.add(hino500);
        transports.add(dafX2);

        System.out.println(bmwZ4);
        bmwZ4.startMoving();
        bmwZ4.stopMoving();
        bmwZ4.pitStop();
        bmwZ4.getBestLapTime();
        bmwZ4.getMaximumSpeed();
        System.out.println(audiR8);
        System.out.println(porsche911);
        System.out.println(mitsubishiLancerEvolution);
        System.out.println("------------------------------------------------------------------");

        System.out.println(neoplanN5218);
        neoplanN5218.startMoving();
        neoplanN5218.stopMoving();
        neoplanN5218.pitStop();
        neoplanN5218.getBestLapTime();
        neoplanN5218.getMaximumSpeed();
        System.out.println(mercedesBenzTravego);
        System.out.println(scaniaTouring);
        System.out.println(ikarus386);
        System.out.println("------------------------------------------------------------------");

        System.out.println(kamaz4326);
        kamaz4326.startMoving();
        kamaz4326.stopMoving();
        kamaz4326.pitStop();
        kamaz4326.getBestLapTime();
        kamaz4326.getMaximumSpeed();
        System.out.println(ivecoStralis);
        System.out.println(hino500);
        System.out.println(dafX2);
        System.out.println("------------------------------------------------------------------");

        ilja.drive(neoplanN5218);
        andrej.drive(audiR8);
        sergej.drive(dafX2);
        Transport.performDiagnostics(bmwZ4, audiR8, porsche911, mitsubishiLancerEvolution, neoplanN5218,
                mercedesBenzTravego, scaniaTouring, ikarus386, kamaz4326, ivecoStralis, hino500, dafX2);
        System.out.println("------------------------------------------------------------------");

        bmwZ4.fixTheCar();
        audiR8.fixTheCar();
        porsche911.fixTheCar();
        mitsubishiLancerEvolution.fixTheCar();
        bmwZ4.carryOutMaintenance();
        neoplanN5218.carryOutMaintenance();
        dafX2.carryOutMaintenance();
        audiR8.getInformationAboutDriverAndMechanic();
        neoplanN5218.getInformationAboutDriverAndMechanic();
        kamaz4326.getInformationAboutDriverAndMechanic();


        Map<Mechanic, Transport> transportMechanicMap1 = new HashMap<>();

        transportMechanicMap1.put(leonid, bmwZ4);
        transportMechanicMap1.put(aleksej, neoplanN5218);
        transportMechanicMap1.put(vladimir, kamaz4326);

        transportMechanicMap1.put(anton, audiR8);
        transportMechanicMap1.put(maria, porsche911);
        transportMechanicMap1.put(ksenia, mercedesBenzTravego);
        transportMechanicMap1.put(elena, ivecoStralis);
        transportMechanicMap1.put(anastasia, scaniaTouring);
        transportMechanicMap1.put(gennadij, mitsubishiLancerEvolution);
        transportMechanicMap1.put(matvej, scaniaTouring);
        transportMechanicMap1.put(mark, hino500);
        transportMechanicMap1.put(arsenij, dafX2);
        for (Map.Entry<Mechanic, Transport> map : transportMechanicMap1.entrySet()) {
            System.out.println(map.getKey() + " обслуживает автомобиль - " + map.getValue());
        }
        System.out.println("----------------------------------------------------");
        System.out.println(transportMechanicMap1);
        System.out.println(transportMechanicMap1);
        Set<Driver> driverSet = new HashSet<>();
        driverSet.add(andrej);
        driverSet.add(ekaterina);
        driverSet.add(artjom);
        driverSet.add(artjom);
        driverSet.add(aleksandra);
        driverSet.add(sergej);
        driverSet.add(nina);
        driverSet.add(arkadij);
        driverSet.add(tatjana);
        driverSet.add(ilja);
        driverSet.add(irina);
        driverSet.add(innokentij);
        driverSet.add(innokentij);
        driverSet.add(elizaveta);

        Iterator<Driver> iterator = driverSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }


}



