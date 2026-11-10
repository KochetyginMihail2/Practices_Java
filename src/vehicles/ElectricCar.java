package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    // Конструктор
    public ElectricCar(String model, String license, String color, int year, String ownerName, int insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber, "Electric");
        this.batteryCapacity = batteryCapacity;
    }

    // Геттер
    public int getBatteryCapacity() {return batteryCapacity; }

    // Сеттер
    public void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }

    // Переопределенные методы
    @Override
    public String vehicleType() { return "Electric Car"; }

    @Override
    public String toString() { return super.toString() + "\nЕмкость батареи: " + batteryCapacity; }
}