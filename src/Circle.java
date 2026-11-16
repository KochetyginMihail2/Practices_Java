public class Circle extends GeometricObject {
    private double radius;

    // Конструкторы
    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(); 
        setColor(color);
        setFilled(filled);
        this.radius = radius;
    }

    // Геттеры
    public double getRadius() { return radius; }
    public double getDiameter() { return 2 * radius; }
    public double getPerimeter() { return 2 * Math.PI * radius; }
    public double getArea() { return Math.PI * radius * radius; }

    // Сеттер
    public void setRadius(double radius) { this.radius = radius; }

    // Вывод информацци
    public void printCircle() {
        System.out.println("Круг с радиусом " + radius + ". " + super.toString());
    }
}