public class Car {
    // Объявление переменных
    private String model, license, color;
    private int year;
    private final int YEAR_NOW = 2026;

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
    public int getYear() {return year;}

    // Сеттеры
    public void setModel(String model) {this.model = model;}
    public void setLicense(String license) {this.license = license;}
    public void setColor(String color) {this.color = color;}
    public void setYear(int year) {this.year = year;}

    // Получить возраст модели
    public int getAge() {
        if (year != -1)
            return YEAR_NOW - year;
        return -1;
    }

    // Вывод информации
    public void ToString(){
        System.out.println("Модель автомобиля: " + getModel());
        System.out.println("Лицензия автомобиля: " + getLicense());
        System.out.println("Цвет автомобиля: " + getColor());
        System.out.println("Год выпуска автомобиля: " + getYear());
        System.out.println();
    }
}
