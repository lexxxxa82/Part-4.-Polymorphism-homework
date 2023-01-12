package mechanic;

import transport.Transport;

import java.util.Objects;

public class Mechanic {
    private final String fullName;
    private String company;
    private final CarRepairSpecialization carRepairSpecialization;

    public Mechanic(String fullName, String company, CarRepairSpecialization carRepairSpecialization) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Ф.И.О.";
        } else {
            this.fullName = fullName;
        }
        setCompany(company);

        this.carRepairSpecialization = carRepairSpecialization;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public CarRepairSpecialization getCarRepairSpecialization() {
        return carRepairSpecialization;
    }

    public void carryOutMaintenance(Transport transport) {
        System.out.println(this.toString() + "осуществляет техническое обслуживание " + transport.getBrand() + " " + transport.getModel());

    }

    public void fixTheCar(Transport transport) {
        System.out.println(this.toString() + " ремонтирует " + transport.getBrand() + " " + transport.getModel());
    }

    public void setCompany(String company) {
        if (company == null || company.isEmpty()) {
            this.company = "компания";
        } else {
            this.company = company;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(fullName, mechanic.fullName) && Objects.equals(company, mechanic.company) && carRepairSpecialization == mechanic.carRepairSpecialization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company, carRepairSpecialization);
    }

    @Override
    public String toString() {
        return "автомеханик :" + " Ф.И.О " + fullName + ",компания -'" + company + ",  специализация " + carRepairSpecialization;
    }
}
