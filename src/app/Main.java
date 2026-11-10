package app;
import vehicles.Car;
import vehicles.ElectricCar;
public class Main {
    public static void main(String args[]){
        System.out.println("[Тестирование класса Car]");
        
        // Создаем объект Car (используем конструктор со всеми параметрами)
        Car myCar = new Car("Toyota Camry", "A123BC", "Черный", 2018);
        
        // ДЕМОНСТРАЦИЯ ИНКАПСУЛЯЦИИ:

        // Инкапсуляция: правильный доступ через сеттеры
        myCar.setOwnerName("Иван Иванов");
        myCar.setInsuranceNumber(123456789);
        myCar.setEngineType("Бензин");
        
        // Инкапсуляция: вывод через геттеры
        myCar.ToString();
        System.out.println("Владелец: " + myCar.getOwnerName());
        System.out.println("Страховка: " + myCar.getInsuranceNumber());
        System.out.println("Двигатель: " + myCar.getEngineType());
        System.out.println("Возраст авто: " + myCar.getAge() + " лет\n");


        System.out.println("[Тестирование класса ElectricCar]");
        
        // Создаем объект ElectricCar (наследует все методы Car)
        ElectricCar myTesla = new ElectricCar("Tesla Model 3", "E777EE", "Белый", 2022);
        
        // Инкапсуляция: правильный доступ через сеттеры
        myTesla.setOwnerName("Петр Петров");
        myTesla.setInsuranceNumber(987654321);
        myTesla.setBatteryCapacity(85);
        
        // ДЕМОНСТРАЦИЯ НАСЛЕДОВАНИЯ:
        myTesla.ToString();
        System.out.println("Владелец: " + myTesla.getOwnerName());
        System.out.println("Двигатель: " + myTesla.getEngineType());
        System.out.println("Емкость батареи: " + myTesla.getBatteryCapacity() + " кВтч");
        System.out.println("Возраст авто: " + myTesla.getAge() + " лет");
    }
}
