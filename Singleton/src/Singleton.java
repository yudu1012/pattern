public class Singleton {
    // Статическая переменная, которая хранит единственный экземпляр класса
    private static Singleton instance;

    // Приватный конструктор, чтобы предотвратить создание объектов извне
    private Singleton() {}

    // Метод для получения экземпляра класса
    public static Singleton getInstance() {
        // Проверка на null, чтобы создать объект только при необходимости
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Пример метода, который можно использовать в Singleton
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}