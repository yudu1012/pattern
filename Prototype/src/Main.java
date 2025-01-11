
public class Main {
    public static void main(String[] args) {
        // Создаём оригинальный объект
        ConcretePrototype prototype1 = new ConcretePrototype("Hello", 42);

        // Клонируем оригинальный объект
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype1.clone();

        // Выводим оба объекта
        System.out.println("Original: " + prototype1);
        System.out.println("Cloned: " + clonedPrototype);
    }
}