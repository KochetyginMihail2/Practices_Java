import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Пункты 1-3: Тестирование класса Triangle
        System.out.println("--- Тест 1: Треугольник ---");
        System.out.println("Введите три стороны треугольника:");
        System.out.print("Сторона 1: ");
        double side1 = input.nextDouble();
        System.out.print("Сторона 2: ");
        double side2 = input.nextDouble();
        System.out.print("Сторона 3: ");
        double side3 = input.nextDouble();
        System.out.print("Введите цвет: ");
        String color = input.next();
        System.out.print("Треугольник закрашен? (true/false): ");
        boolean filled = input.nextBoolean();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println("\nИнформация о треугольнике:");
            System.out.printf("Площадь: %.2f\n", triangle.getArea());
            System.out.printf("Периметр: %.2f\n", triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Закрашен: " + triangle.isFilled());

        } catch (IllegalTriangleException error) {
            System.out.println("\nОшибка: " + error.getMessage());
        }

        // Пункт 5: Тестирование метода max() для кругов и прямоугольников
        System.out.println("\n--- Тест 2: Метод max() ---");
        
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(10.0);
        GeometricObject maxCircle = GeometricObject.max(circle1, circle2);
        System.out.printf("Наибольший круг имеет площадь: %.2f (радиус %.2f)\n", maxCircle.getArea(), ((Circle) maxCircle).getRadius());

        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(10, 2);
        GeometricObject maxRect = GeometricObject.max(rect1, rect2);
        System.out.printf("Наибольший прямоугольник имеет площадь: %.2f\n", maxRect.getArea());

        // Пункт 6: Тестирование ComparableCircle и метода compareTo()
        System.out.println("\n--- Тест 3: Метод compareTo() ---");

        ComparableCircle cCircle1 = new ComparableCircle(3.0);
        ComparableCircle cCircle2 = new ComparableCircle(7.0);
        System.out.printf("Сравниваем круг (площадь %.2f) и круг (площадь %.2f):\n", cCircle1.getArea(), cCircle2.getArea());
        if (cCircle1.compareTo(cCircle2) > 0) { System.out.println("Первый ComparableCircle больше."); }
        else if (cCircle1.compareTo(cCircle2) < 0) { System.out.println("Второй ComparableCircle больше."); }
        else { System.out.println("Круги равны."); }

        Rectangle testRect = new Rectangle(5.0, 5.0); // площадь 25
        ComparableCircle testCircle = new ComparableCircle(2.0); // площадь ~12.56
        System.out.printf("Сравниваем круг (площадь %.2f) и прямоугольник (площадь %.2f):\n", testCircle.getArea(), testRect.getArea());
        if (testCircle.compareTo(testRect) > 0) { System.out.println("Круг больше прямоугольника."); }
        else if (testCircle.compareTo(testRect) < 0) { System.out.println("Прямоугольник больше круга."); }
        else { System.out.println("Фигуры равны по площади."); }

        input.close();
    }
}