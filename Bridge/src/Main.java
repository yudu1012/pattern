//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(5, 10, 7, new DrawingAPI1());
        Shape circle2 = new Circle(15, 20, 10, new DrawingAPI2());

        circle1.draw();
        circle2.draw();

        circle1.resizeByPercentage(50);
        circle2.resizeByPercentage(25);

        circle1.draw();
        circle2.draw();
    }

}