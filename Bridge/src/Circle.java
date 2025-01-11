public class Circle extends Shape{
    private double x, y, radius;

    public Circle(double x, double y, double radius,DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double percent) {
        radius = radius * (1 + percent / 100);
    }
}