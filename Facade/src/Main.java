public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie(); // Запуск фильма
        System.out.println();
        homeTheater.endMovie(); // Завершение фильма
    }
}