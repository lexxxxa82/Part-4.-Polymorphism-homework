package Driver;

import exception.CarLicenseException;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean driversLicence;
    private int drivingExperience;
    private String category;

    public Driver(String fullName, boolean driversLicence, int drivingExperience,
                  String category) throws CarLicenseException {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Ф.И.О.";
        } else {
            this.fullName = fullName;
        }
        if (driversLicence == true) {
            this.driversLicence = true;
        } else {
            throw new CarLicenseException(this, "без прав управлять автомобилем нельзя");
        }

        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
        if (category == null || category.isEmpty()) {
            try {
                throw new DriversLicenceException("Необходимо указать категорию водительского удостоверения" +
                        " для водителя " + getFullName());
            } catch (DriversLicenceException e) {
                System.out.println(e.getMessage());
            }
        } else if (category.equals("B") || category.equals("C") || category.equals("D")) {
            this.category = category;
        } else {
            try {
                throw new DriversLicenceException("Необходимо указать категорию водительского удостоверения" +
                        " для водителя " + getFullName());
            } catch (DriversLicenceException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Ф.И.О.";
        } else {
            this.fullName = fullName;
        }
    }

    public boolean getDriversLicence() {
        return driversLicence;
    }

    public String getCategory() {
        return category;
    }

    public void setDriversLicence(boolean driversLicence) throws CarLicenseException {
        if (driversLicence == true) {
            this.driversLicence = true;
        } else {
            throw new CarLicenseException(this, "без прав управлять автомобилем нельзя");
        }
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }

    //    public void setCategory(String category) {
//        this.category = category;
//    }
    public void setCategory(String category) {
        if (category == null || category.isEmpty()) {
            try {
                throw new DriversLicenceException("Необходимо указать категорию водительского удостоверения" +
                        " для водителя " + getFullName());
            } catch (DriversLicenceException e) {
                System.out.println(e.getMessage());
            }
        } else if (category.equals("B") || category.equals("C") || category.equals("D")) {
            this.category = category;
        } else {
            try {
                throw new DriversLicenceException("Необходимо указать категорию водительского удостоверения" +
                        " для водителя " + getFullName());
            } catch (DriversLicenceException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuelCar();

    @Override
    public String toString() {
        return "Ф.И.О." + fullName + ",наличие водительских прав " + driversLicence +
                ", стаж вождения " + drivingExperience + " сатегория -" + getCategory();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driversLicence == driver.driversLicence && drivingExperience == driver.drivingExperience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driversLicence, drivingExperience);
    }

    public abstract void refuelTheVehicle();
}

