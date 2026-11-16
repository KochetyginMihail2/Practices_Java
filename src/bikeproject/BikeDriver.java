package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		
		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();
		
		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		bike4.printDescription();

		// 8. Обновление высоты стойла для bike1 до 20 вместо 22
		bike1.setPostHeight(20);
		
		// 9. Вывод значений bike1 на экран для подтверждения изменения
		System.out.println("\n--- После изменения высоты стойла (postHeight) для bike1 ---");
		bike1.printDescription();
	}//end method main

}//end class BikeDriver