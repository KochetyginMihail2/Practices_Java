public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        // Создаем массив из пяти объектов типа GeometricObject
        GeometricObject[] objects = new GeometricObject[5];

        // Заполняем массив разными фигурами
        objects[0] = new Circle(5.0);
        objects[1] = new Rectangle(2.0, 4.0);
        objects[2] = new Square(3.0);
        objects[3] = new Triangle(3.0, 4.0, 5.0);
        objects[4] = new ComparableCircle(4.0);

        // Проходимся по массиву и обрабатываем каждый объект
        for (int i = 0; i < objects.length; ++i) {
            System.out.println("Объект №" + (i + 1) + " [" + objects[i].getClass().getSimpleName() + "]");
            System.out.printf("Площадь: %.2f\n", objects[i].getArea());
            if (objects[i] instanceof Colorable) { ((Colorable) objects[i]).howToColor(); }
            else { System.out.println("Этот объект нельзя раскрасить."); }
            System.out.println();
        }
    }
}