import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь",
                     "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число от 1 до 12: ");
        if (input.hasNextInt()) {
            // Если ввели целое число
            int monthNumber = input.nextInt();
            try {
                String monthName = months[monthNumber - 1];
                int days = dom[monthNumber - 1];
                if (monthName == "февраль") {
                    int year;
                    System.out.print("Введите год: ");

                    if (input.hasNextInt()) {
                        year = input.nextInt();
                        if (isLeapYear(year)) { days++; } 
                    }
                    else {
                        System.out.println("Ошибка: год должен быть целым числом.");
                        input.close();
                        return;
                    }
                }
                
                System.out.println("Месяц: " + monthName);
                System.out.println("Количество дней: " + days);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Недопустимое число");
            }
        } else {
            // Если ввели не целое число
            System.out.println("Ошибка: необходимо ввести целое число.");
        }

        input.close();
    }

    // Метод для определения високосного года
    public static boolean isLeapYear(int year) {
        // Год високосный, если он кратен 400 или если он кратен 4, но не кратен 100.
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
