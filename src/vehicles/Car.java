package vehicles;

public class Car extends Vehicle {

    // Конструктор
    public Car(String model, String license, String color, int year, String ownerName, int insuranceNumber, String engineType) {
        super(model, license, color, year, ownerName, insuranceNumber, engineType);
    }

    // Переопределенный метод vehicleType
    @Override
    public String vehicleType() { return "Car"; }
}
