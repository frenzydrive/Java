public class Cargo {
    private final double mass;
    private final String address;
    private boolean canBeTurned;
    private String regNumber;
    private boolean fragile;
    private final Dimensions volume;

    public Cargo(Dimensions volume, double mass, String address, boolean canBeTurned, String regNumber, boolean fragile) {
        this.volume = volume;
        this.mass = mass;
        this.address = address;
        this.canBeTurned = canBeTurned;
        this.regNumber = regNumber;
        this.fragile = fragile;
    }

    public Cargo setAddress(String address) {
        return new Cargo(volume, mass, address, canBeTurned,regNumber, fragile);
    }

    public Cargo setMass(double mass) {
        return new Cargo(volume, mass, address, canBeTurned,regNumber, fragile);
    }

    public Cargo setDimensions(Dimensions volume) {
        return new Cargo(volume, mass, address, canBeTurned,regNumber, fragile);
    }

    public String toString() {
        return "Посылка: " + "\n" +
                "Масса: " + mass + "\n" +
                "Адрес доставки: " + address + "\n" +
                "Резрешено ли переворачивать груз: " + canBeTurned + "\n" +
                "Регистрационный номер: " + regNumber + "\n" +
                "Хрупкий груз: " + fragile + "\n" +
                "Габариты: " + volume;
    }
}
