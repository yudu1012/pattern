//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создание автомобиля с помощью Builder
        Car customCar = new Car.CarBuilder()
                .setBrand("BMW")
                .setModel("X5")
                .setEngine("Diesel")
                .setYear(2023)
                .build();
        System.out.println("Custom Car: " + customCar);

        // Использование фабрики
        Car electricCar = Car.CarFactory.createElectricCar();
        Car sportsCar = Car.CarFactory.createSportsCar();
        Car familyCar = Car.CarFactory.createFamilyCar();

        System.out.println("Electric Car: " + electricCar);
        System.out.println("Sports Car: " + sportsCar);
        System.out.println("Family Car: " + familyCar);
    }
}