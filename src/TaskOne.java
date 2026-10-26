public class TaskOne {
    // Объявление переменных
    final double ROUBLES_PER_YUAN = 11.91;  // курс юаня к рублю
    int yuan;
    double roubles;

    public void main(String args[]){
        // Получение с консоли числа юаней
        System.out.print("Введите конвертируемую сумму в юанях: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        yuan = input.nextInt();
        input.close();

        // Перевод юаней в рубли и вывод на консоль
        roubles = Math.ceil(yuan * ROUBLES_PER_YUAN);
        System.out.print("Сумма в российских рублях: " + (int) roubles);
    }
}
