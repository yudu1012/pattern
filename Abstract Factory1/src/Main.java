//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Выбираем фабрику
        CarFactory electricCarFactory = new ElectricCarFactory();
        CarFactory gasCarFactory = new GasCarFactory();

        // Создаем автомобили
        Car electricCar = electricCarFactory.createCar();
        Car gasCar = gasCarFactory.createCar();

        // Используем автомобили
        electricCar.drive();
        gasCar.drive();
    }
}