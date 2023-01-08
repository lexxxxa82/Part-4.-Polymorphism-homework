package transport;

public class Bus extends Transport implements Competition {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
        System.out.println(" максимальная скорость");

    }

}
