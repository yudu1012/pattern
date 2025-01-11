public class CircleAdapter implements Shape{
    public Circle circle;

    public CircleAdapter(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double getArea() {
        return  circle.getArea();
    }
}
