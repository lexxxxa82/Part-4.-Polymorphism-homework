package transport;

public class Truck extends Transport implements Competition {
    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("не указана грузоподъемность");
        } else {
            String loadCapacityLowerLimit = loadCapacity.getLoadCapacityLowerLimit() == null ? "" : " от " +
                    loadCapacity.getLoadCapacityLowerLimit() + " тон";
            String loadCapacityUpperLimit = loadCapacity.getLoadCapacityUpperLimit() == null ? "" : " до " +
                    loadCapacity.getLoadCapacityUpperLimit() + " тон";
            System.out.println("грузоподъемность " + loadCapacityLowerLimit + loadCapacityUpperLimit);
        }

    }

    @Override
    public void startMoving() {
        System.out.println("грузовая машина начала движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("грузовая машина остановилась");

    }

    @Override
    public void pitStop() {
        System.out.println("грузовая машина заехала на пит стоп");

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
        System.out.println( "машина"+ getBrand()+" "+ getModel()+ " проходит дтагностику ");
    }

}
