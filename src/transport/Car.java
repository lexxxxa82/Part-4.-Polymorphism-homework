package transport;

import Driver.Driver;
import Driver.DriverB;
import mechanic.CarRepairSpecialization;
import mechanic.Mechanic;


import java.util.ArrayList;
import java.util.Objects;

public class Car extends Transport implements Competition {
    private BodyType bodyType;


    public Car(String brand, String model, double engineVolume, DriverB driver,
               ArrayList<Mechanic> mechanics, ArrayList<Driver> drivers, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("не введен тип кузова");
        } else {
            System.out.println(bodyType);
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("машина начала движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("машина остановилась");

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
    public void diagnosticsPass() {
        System.out.println("машина " + getBrand() + " " + getModel() + " проходит дтагностику ");

    }

    @Override
    public void getInformationAboutDriverAndMechanic() {
        if (mechanics != null || drivers != null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_CAR ||
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
                if (mechanic.getCarRepairSpecialization() == CarRepairSpecialization.SPECIFICATION_CAR ||
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
