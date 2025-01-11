abstract class Shape{
    public DrawingAPI drawingAPI;

    public Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }
    public abstract void draw();
    public abstract void resizeByPercentage(double percent);
}