package Driver;

import exception.CarLicenseException;
import transport.Competition;
import transport.Transport;

public class DriverB<T extends Transport & Competition> extends Driver {

    public DriverB() throws CarLicenseException {
        super("", true, 0);
    }

    public DriverB(String fullName, boolean driversLicence, int drivingExperience) throws CarLicenseException {
        super(fullName, driversLicence, drivingExperience);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void drive(T transport) {
        System.out.println("водитель " + getFullName() + " управляет: " + transport.getBrand() + " " + transport.getModel() + " и примет участие в соревнованиях");
    }

    @Override
    public void startMoving() {
        System.out.println("водитель с правами  категорией B начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("водитель с правами категории B остановился");
    }

    @Override
    public void refuelCar() {

    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("водитель с правами категории B заправляет машину");
    }
}