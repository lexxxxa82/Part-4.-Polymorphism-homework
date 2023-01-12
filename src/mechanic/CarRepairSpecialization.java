package mechanic;

public enum CarRepairSpecialization {
    SPECIFICATION_CAR("РЕМОНТ ЛЕГКОВОГО ТРАНСПОРТА"),
    SPECIFICATION_TRUCK("РЕМОНТ ГРУЗОВОГО ТРАНСПОРТА"),
    SPECIFICATION_BUS("РЕМОНТ АВТОБУСОВ"),
    SPECIFICATION_UNIVERSAL("РЕМОНТ ВСЕХ ТИПОВ ТРАНСПОРТА");
    private final String CarRepairSpecialization;

    CarRepairSpecialization(String carRepairSpecialization) {
        CarRepairSpecialization = carRepairSpecialization;
    }

    public String getCarRepairSpecialization() {
        return CarRepairSpecialization;
    }

    @Override
    public String toString() {
        return getCarRepairSpecialization();
    }
}
