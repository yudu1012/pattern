
public class Main {
    public static void main(String[] args) {
        // Выбираем тип транспорта через фабрику
        TransportFactory factory;

        // Создаем машину
        factory = new CarFactory();
        Transport car = factory.createTransport();
        car.deliver();

        // Создаем велосипед
        factory = new BikeFactory();
        Transport bike = factory.createTransport();
        bike.deliver();
    }
}
