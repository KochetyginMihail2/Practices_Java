public class TaskTwo {
    // Объявление переменных
    private final double ROUBLES_PER_YUAN = 11.91;  // курс юаня к рублю
    private int yuan, digit;
    private double roubles;

    public void main(String args[]){
        // Получение с консоли числа юаней
        System.out.print("Введите конвертируемую сумму в юанях: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        yuan = input.nextInt();
        input.close();

        // Вывод юаней с правильным окончанием
        System.out.print("Ваша сумма: " + yuan + ' ');
        digit = yuan % 10;
        if (yuan % 100 >= 11 && yuan % 100 <= 14)
            System.out.println("юаней");
        else if (digit == 1)
            System.out.println("юань");
        else if (digit >= 2 &&  digit <= 4)
            System.out.println("юаня");
        else if (yuan >= 5 && yuan <= 9 || digit == 0)
            System.out.println("юаней");

        // Пперевод юаней в рубли и вывод в консоль
        roubles = Math.ceil(yuan * ROUBLES_PER_YUAN);
        System.out.print("Сумма в российских рублях: " + (int) roubles);
    }
}
