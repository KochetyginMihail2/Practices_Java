public class Square extends GeometricObject implements Colorable {
    private double side;

    // Конструкторы
    public Square() {
        super();
        this.side = 0.0;
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    // Геттеры
    public double getSide() { return side; }
    public double getArea() { return side * side; }
    public double getPerimeter() { return 4 * side; }

    // Сеттеры
    public void setSide(double side) { this.side = side; }

    // Реализация метода из интерфейса Colorable
    @Override
    public void howToColor() {
        System.out.println("Раскрасьте все четыре стороны.");
    }
}