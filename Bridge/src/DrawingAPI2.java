public class DrawingAPI2 implements DrawingAPI{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing circle using API2 at (" + x + ", " + y + ") with radius " + radius);
    }
}
