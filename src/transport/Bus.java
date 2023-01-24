package transport;

import Driver.Driver;
import Driver.DriverD;
import mechanic.CarRepairSpecialization;
import mechanic.Mechanic;

import java.util.ArrayList;
import java.util.Objects;

public class Bus extends Transport implements Competition {


    private SeatsCapacity seatsCapacity;

    public Bus(String brand, String model, double engineVolume, DriverD driver,
               SeatsCapacity seatsCapacity) {
        super(brand, model, engineVolume, driver);
        this.seatsCapacity = seatsCapacity;
    }

    public Bus(String brand, String model, double engineVolume, DriverD driver,
               ArrayList<Mechanic> mechanics, SeatsCapacity seatsCapacity) {
        super(brand, model, engineVolume, driver, mechanics);
        this.seatsCapacity = seatsCapacity;
    }

    public Bus(String brand, String model, double engineVolume, Driver<Bus> driver,
               ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers, SeatsCapacity seatsCapacity) {
        super(brand, model, engineVolume, driver);
        this.seatsCapacity = seatsCapacity;
    }


    public SeatsCapacity getSeatsCapacity() {
        return seatsCapacity;
    }

    public void setSeatsCapacity(SeatsCapacity seatsCapacity) {
        this.seatsCapacity = seatsCapacity;
    }

    @Override
    public void printType() {
        if (seatsCapacity == null) {
            System.out.println("не указанно количество посадочных мест");
        } else {
            System.out.println("количество посадочных мест " + seatsCapacity.getSeatsCapacityLowerLimit() + " мест до " +
                    seatsCapacity.getSeatsCapacityUpperLimit() + " мест");
        }
    }

    @Override
    public void startMoving() {
        System.out.println("автобус начала движение");

    }

    @Override
    public void stopMoving() {
        System.out.println("автобус остановился");

    }

    @Override
    public void pitStop() {
        System.out.println("машина заехала на пит стоп");

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
    public void diagnosticsPass() throws UnsupportedOperationException {
        throw new UnsupportedOperationException(" автобус диагностику проходить не может");

    }

    @Override
    public void getInformationAboutDriverAndMechanic() {
        if (mechanics != null || drivers != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_BUS ||
                        mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_UNIVERSAL && mechanics.size() < 4) {
                    System.out.println(" автобус " + getBrand() + ", " + getModel() + ", с объемом двигателя" + getEngineVolume() + ", обслуживает механик" +
                            mechanic.getFullName());
                }
            }
            for (Driver driver : drivers) {
                if (Objects.equals(driver.getFullName(), getDriver().getFullName())) {
                    System.out.println("автобус " + getBrand() + " " + getModel() + ", с объемом двигателя"
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
                if (mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_BUS ||
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
                if (mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_BUS ||
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return seatsCapacity == bus.seatsCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seatsCapacity);
    }
}
