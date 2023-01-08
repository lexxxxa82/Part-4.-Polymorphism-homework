package Driver;

import transport.Competition;
import transport.Transport;

public class DriverC<T extends Transport & Competition> extends Driver {

    public DriverC() {
        super("", true, 0);
    }

    public DriverC(String fullName, boolean driversLicence, int drivingExperience) {
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
        System.out.println("водитель " + getFullName() + " управляет: " + transport.getBrand() + " " +
                transport.getModel() + " и примет участие в соревнованиях");
    }

    @Override
    public void startMoving() {
        System.out.println("водитель с правами  категорией C начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("водитель с правами категории C остановился");
    }

    @Override
    public void refuelCar() {

    }

    @Override
    public void refuelTheVehicle() {
        System.out.println("водитель с правами категории C заправляет машину");
    }
}