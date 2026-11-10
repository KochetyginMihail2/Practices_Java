package vehicles;
public class Car {
    // Объявление переменных
    String model, license, color;
    int year;
    final int YEAR_NOW = 2026;
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;

    // Конструктор со всеми параметрами
    public Car(String model, String license, String color, int year){
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // Конструктор с одним параметром
    public Car(int year){
        this.model = this.license = this.color = "Неизвестно";
        this.year = year;
    }

    // Конструктор по умолчанию
    public Car(){
        this.model = this.license = this.color = "Неизвестно";
        this.year = -1;
    }

    // Геттеры
    public String getModel() {return model;}
    public String getLicense() {return license;}
    public String getColor() {return color;}
    public String getOwnerName() {return ownerName;}
    public String getEngineType() {return engineType;}
    public int getYear() {return year;}
    public int getInsuranceNumber() {return insuranceNumber;}

    // Сеттеры
    public void setModel(String model) {this.model = model;}
    public void setLicense(String license) {this.license = license;}
    public void setColor(String color) {this.color = color;}
    public void setOwnerName(String ownerName) {this.ownerName = ownerName;}
    public void setEngineType(String engineType) {this.engineType = engineType;}
    public void setYear(int year) {this.year = year;}
    public void setInsuranceNumber(int insuranceNumber) {this.insuranceNumber = insuranceNumber;}

    // Получить возраст модели
    public int getAge() {return (year != -1)? YEAR_NOW - year : -1;}

    // Вывод информации
    public void ToString(){
        System.out.println("Модель автомобиля: " + getModel());
        System.out.println("Лицензия автомобиля: " + getLicense());
        System.out.println("Цвет автомобиля: " + getColor());
        System.out.println("Год выпуска автомобиля: " + getYear());
    }
}
