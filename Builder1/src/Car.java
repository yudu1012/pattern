public class Car {
    private String brand;
    private String model;
    private String engine;
    private int year;

    // Приватный конструктор (для Builder)
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.engine = builder.engine;
        this.year = builder.year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", year=" + year +
                '}';
    }

    // Статический внутренний класс Builder
    public static class CarBuilder {
        private String brand;
        private String model;
        private String engine;
        private int year;

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    class CarFactory {
        public static Car createElectricCar() {
            return new Car.CarBuilder()
                    .setBrand("Tesla")
                    .setModel("Model S")
                    .setEngine("Electric")
                    .setYear(2025)
                    .build();
        }

        public static Car createSportsCar() {
            return new Car.CarBuilder()
                    .setBrand("Ferrari")
                    .setModel("488 GTB")
                    .setEngine("V8")
                    .setYear(2023)
                    .build();
        }

        public static Car createFamilyCar() {
            return new Car.CarBuilder()
                    .setBrand("Toyota")
                    .setModel("Camry")
                    .setEngine("Hybrid")
                    .setYear(2024)
                    .build();
        }
    }
}