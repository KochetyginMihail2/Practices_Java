package vehicles;

public class ElectricCar extends Car implements ElecticVehicle{
    private int batteryCapacity;

    // Конструктор
    public ElectricCar(String model, String license, String color, int year, String ownerName, int insuranceNumber, int batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber);
        setEngineType("Electric");
        this.batteryCapacity = batteryCapacity;
    }

    // Геттер (реализация метода интерфейса)
    public int getBatteryCapacity() {return batteryCapacity; }

    // Сеттер (реализация метода интерфейса)
    public void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }

    // Переопределенные методы
    @Override
    public String vehicleType() { return "Electric Car"; }

    @Override
    public String toString() { return super.toString() + "\nЕмкость батареи: " + batteryCapacity; }
}