import java.util.Date;

public class GeometricObject {
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

    // Сеттеры
    public void setColor(String color) { this.color = color; }
    public void setFilled(boolean filled) { this.filled = filled; }

    // Вывод информации
    @Override
    public String toString() {
        return "Создан:" + dateCreated + ", цвет: " + color + ", закрашен: " + filled + ".";
    }
}