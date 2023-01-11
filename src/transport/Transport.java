package transport;

import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
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

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
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

    public abstract void diagnosticsPass() throws RuntimeException;
//    public static void performDiagnostics(Transport... transports) {
//        for (Transport transport : transports) {
//            try {
//                transport.passDiagnostics();
//            } catch (UnsupportedOperationException e) {
//                System.out.println("An error occurred");
//                System.out.println(e.getMessage());
//            }
//        }
//    }
}