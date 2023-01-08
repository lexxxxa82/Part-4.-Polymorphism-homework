package transport;

public class Truck extends Transport implements Competition {
//    public class Truck() {
//    super("","",0);
//    }

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println(" грузовая машина начала движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("грузовая машина остановилась");

    }
    @Override
    public void pitStop() {
        System.out.println( "  грузовая машина заехала на пит стоп");

    }

    @Override
    public void getBestLapTime() {
        System.out.println("лучшее время ");

    }

    @Override
    public void getMaximumSpeed() {
        System.out.println("максимальная скорость");

    }



}
