public class ComparableCircle extends Circle implements Comparable<GeometricObject> {
    
    // Конструкторы
    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    
    // Метод compareTo наследуется от GeometricObject
}