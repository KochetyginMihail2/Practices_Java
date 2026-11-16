package vehicles;

public class Car extends Vehicle {

    // Конструктор
    public Car(String model, String license, String color, int year, String ownerName, int insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber, "Combustion");
    }

    // Переопределенный метод vehicleType
    @Override
    public String vehicleType() { return "Car"; }
}
