public class Main {
    public static void main(String[] args) {
        // Получаем экземпляр Singleton и вызываем метод
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}