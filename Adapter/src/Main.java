//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        // Используем адаптер для преобразования круга в Shape
        Shape shape = new CircleAdapter(circle);

        // Выводим площадь через интерфейс Shape
        System.out.println("Area of the circle: " + shape.getArea());
    }

}