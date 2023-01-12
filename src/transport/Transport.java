package transport;

import Driver.Driver;
import mechanic.Mechanic;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;
    protected ArrayList<Driver> drivers;
    protected ArrayList<Mechanic> mechanics;
    //private int mechanicQuantity;
    private Driver driver;

    public Transport(String brand, String model, double engineVolume, Driver driver) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "ошибка";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "ошибка";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        // this.mechanicQuantity = mechanicQuantity;
        if (driver != null) {
            this.driver = driver;
        }
    }

    public Transport(String brand, String model, double engineVolume, Driver driver,
                     ArrayList<Mechanic> mechanics) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "ошибка";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "ошибка";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        // this.drivers = drivers;
        //this.mechanics = mechanics;
        //this.mechanicQuantity = mechanicQuantity;
        if (driver != null) {
            this.driver = driver;
        }
        this.mechanics = mechanics;
    }

    public Transport(String brand, String model, double engineVolume, ArrayList<Driver> drivers, ArrayList<Mechanic> mechanics, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.drivers = drivers;
        this.mechanics = mechanics;
        this.driver = driver;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public Driver getDriver() {
        return driver;
    }

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public void setMechanics(ArrayList<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    @Override
    public String toString() {

        return "марка" + brand + ", модель" + model + ", объем двигателя" + engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {

        return Objects.hash(brand, model, engineVolume);
    }

    public abstract void printType();

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void pitStop();

    public abstract void getBestLapTime();

    public abstract void getMaximumSpeed();

    public abstract void diagnosticsPass();

    public abstract void getInformationAboutDriverAndMechanic();

    public abstract void fixTheCar();

    public abstract void carryOutMaintenance();

    public abstract void addMechanicInList(Mechanic mechanic);


    public static void performDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.diagnosticsPass();
            } catch (UnsupportedOperationException e) {
                System.out.println("ошибка");
                System.out.println(e.getMessage());
            }
        }
    }
}