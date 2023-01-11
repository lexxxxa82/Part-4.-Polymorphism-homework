package transport;

import java.sql.SQLOutput;

public class Car extends Transport implements Competition {
    private BodyType bodyType;


    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
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


}
