package exception;

import Driver.Driver;

public class CarLicenseException extends Exception {
    private final Driver driver;

    public CarLicenseException(Driver driver, String message) {
        super(message);
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}
