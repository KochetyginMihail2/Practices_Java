package vehicles;

public class ElectricCar extends Car{
    int batteryCapacity;

    // Конструкторы
    public ElectricCar(String model, String license, String color, int year) { 
        super(model, license, color, year);
        this.engineType = "Electric";
    }
    public ElectricCar(int year) { 
        super(year);
        this.engineType = "Electric";
    }
    public ElectricCar() { 
        super(); 
        this.engineType = "Electric";
    }

    // Геттер
    public int getBatteryCapacity() { return batteryCapacity; }

    // Сеттер
    public void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }
}
