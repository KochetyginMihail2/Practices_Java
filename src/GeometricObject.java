import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject>{
    protected String color;
    protected boolean filled;
    protected Date dateCreated;

    // Конструкторы
    public GeometricObject() {
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // Геттеры
    public String getColor() { return color; }
    public boolean isFilled() { return filled; }
    public Date getDateCreated() { return dateCreated; }
    public abstract double getArea();

    // Сеттеры
    public void setColor(String color) { this.color = color; }
    public void setFilled(boolean filled) { this.filled = filled; }

    // Реализация интерфейса Comparable (сравнение по площади)
    @Override
    public int compareTo(GeometricObject other) {
        double my_area = getArea(), other_area = other.getArea();
        if (my_area > other_area) { return 1; }
        else if (my_area < other_area) { return -1; }
        else { return 0; }
    }

    // Статический метод поиска наибольшего объекта
    public static GeometricObject max(GeometricObject figureOne, GeometricObject figureTwo) {
        if (figureOne.compareTo(figureTwo) >= 0) { return figureOne; } 
        else { return figureTwo; }
    }

    // Вывод информации
    @Override
    public String toString() {
        return "Создан:" + dateCreated + ", цвет: " + color + ", закрашен: " + filled + ".";
    }
}