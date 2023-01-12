package transport;

import Driver.Driver;
import Driver.DriverC;
import mechanic.CarRepairSpecialization;
import mechanic.Mechanic;

import java.util.ArrayList;
import java.util.Objects;

public class Truck extends Transport implements Competition {
    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, DriverC driver, ArrayList<Mechanic> mechanics, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver, mechanics);
        this.loadCapacity = loadCapacity;
    }

    public Truck(String brand, String model, double engineVolume, DriverC driver,
                 ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("не указана грузоподъемность");
        } else {
            String loadCapacityLowerLimit = loadCapacity.getLoadCapacityLowerLimit() == null ? "" : " от " +
                    loadCapacity.getLoadCapacityLowerLimit() + " тон";
            String loadCapacityUpperLimit = loadCapacity.getLoadCapacityUpperLimit() == null ? "" : " до " +
                    loadCapacity.getLoadCapacityUpperLimit() + " тон";
            System.out.println("грузоподъемность " + loadCapacityLowerLimit + loadCapacityUpperLimit);
        }

    }

    @Override
    public void startMoving() {
        System.out.println("грузовая машина начала движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("грузовая машина остановилась");

    }

    @Override
    public void pitStop() {
        System.out.println("грузовая машина заехала на пит стоп");

    }

    @Override
    public void getBestLapTime() {
        System.out.println("лучшее время ");

    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("максимальная скорость");

    }

    @Override
    public void diagnosticsPass() {
        System.out.println("машина " + getBrand() + " " + getModel() + " проходит диагностику ");
    }

    @Override
    public void getInformationAboutDriverAndMechanic() {
        if (mechanics != null || drivers != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_TRUCK ||
                        mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_UNIVERSAL && mechanics.size() < 3) {
                    System.out.println(" машина " + getBrand() + ", " + getModel() + ", с объемом двигателя" + getEngineVolume() + ", обслуживает механик" +
                            mechanic.getFullName());
                }
            }
            for (Driver driver : drivers) {
                if (Objects.equals(driver.getFullName(), getDriver().getFullName())) {
                    System.out.println("машина " + getBrand() + " " + getModel() + ", с объемом двигателя"
                            + getEngineVolume() + ", управляет " + driver.getFullName());
                }
            }
        } else {
            System.out.println("В этом автобусе нет водителя и механика");
        }
    }

    @Override
    public void fixTheCar() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_TRUCK ||
                        mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_UNIVERSAL) {
                    mechanic.fixTheCar(this);
                }
            }
        }
    }

    @Override
    public void carryOutMaintenance() {
        if (mechanics != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_CAR ||
                        mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_UNIVERSAL) {
                    mechanic.carryOutMaintenance(this);
                }
            }
        }
    }

    @Override
    public void addMechanicInList(Mechanic mechanic) {
        if (mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_BUS ||
                mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_UNIVERSAL) {
            mechanics.add(mechanic);
        }
        System.out.println(mechanics);
    }

}
