package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        // Создание экземпляров классов Car и ElectricCar
        Vehicle myCar = new Car("Toyota Camry", "A123BC", "Черный", 2018, "Иван", 123456);
        Vehicle myEV = new ElectricCar("Tesla Model 3", "E777EE", "Белый", 2022, "Петр", 987654, 85);

        System.out.println("--- Исходные данные ---");
        System.out.println(myCar.toString());
        System.out.println();
        System.out.println(myEV.toString());

        // Изменение года выпуска и имени владельца
        myCar.setYear(2019);
        myCar.setOwnerName("Александр");
        
        myEV.setYear(2023);
        myEV.setOwnerName("Дмитрий");

        // Изменение страхового номера
        myCar.setInsuranceNumber(111111);
        myEV.setInsuranceNumber(222222);
        
        // Получение информации о емкости батареи у электромобиля
        int evCapacity = ((ElectricCar)myEV).getBatteryCapacity();
        System.out.println("\nЕмкость батареи электромобиля: " + evCapacity + " кВт*ч\n");

        System.out.println("--- После изменений ---");
        System.out.println(myCar.toString());
        System.out.println();
        System.out.println(myEV.toString());
    }
}