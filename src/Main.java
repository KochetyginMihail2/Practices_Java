public class Main {
    // Объявление переменных
    public Car car_one = new Car();
    public Car car_two = new Car(1998);
    public Car car_three = new Car("Tesla", "Лицензия на грузоперевозки", "grey", 2006); 

    public void main(String args[]){
        // Вывод информации об объектах
        car_one.ToString();
        car_two.ToString();
        car_three.ToString();
    }
}
