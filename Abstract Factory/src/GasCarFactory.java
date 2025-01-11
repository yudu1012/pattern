class GasCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new GasCar();
    }
}