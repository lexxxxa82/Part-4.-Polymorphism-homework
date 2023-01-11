package transport;

public class Bus extends Transport implements Competition {


    private SeatsCapacity seatsCapacity;

    public Bus(String brand, String model, double engineVolume, SeatsCapacity seatsCapacity) {
        super(brand, model, engineVolume);
        this.seatsCapacity = seatsCapacity;
    }

    @Override
    public void printType() {
        if (seatsCapacity == null) {
            System.out.println("не указанно количество посадочных мест");
        } else {
            System.out.println("количество посадочных мест " + seatsCapacity.getSeatsCapacityLowerLimit() + " мест до " +
                    seatsCapacity.getSeatsCapacityUpperLimit() + " мест");
        }
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
        System.out.println("максимальная скорость");

    }

    @Override
    public void diagnosticsPass() throws UnsupportedOperationException {
        throw new UnsupportedOperationException(" автобус диагностику проходить не может");

    }
}
