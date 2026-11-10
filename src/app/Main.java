package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Демонстрация полиморфизма: переменные типа Vehicle ссылаются на дочерние объекты
        Vehicle myCar = new Car("Toyota Camry", "A123BC", "Черный", 2018, "Иван", 123456, "Бензин");
        Vehicle myEV = new ElectricCar("Tesla Model 3", "E777EE", "Белый", 2022, "Петр", 987654, 85);

        System.out.println("--- Исходные данные ---");
        System.out.println(myCar.toString());
        System.out.println("\n------------------------\n");
        System.out.println(myEV.toString());
        System.out.println("\n------------------------\n");

        // Изменение свойств через сеттеры (инкапсуляция)
        myCar.setColor("Красный");
        myCar.setOwnerName("Александр");
        
        myEV.setOwnerName("Дмитрий");
        ((ElectricCar)myEV).setBatteryCapacity(100);

        System.out.println("--- После изменения через сеттеры ---");
        System.out.println(myCar.toString());
        System.out.println("\n------------------------\n");
        System.out.println(myEV.toString());
    }
}