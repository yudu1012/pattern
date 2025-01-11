public class DrawingAPI1 implements DrawingAPI{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing circle using API1 at (" + x + ", " + y + ") with radius " + radius);
    }
}