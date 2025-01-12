public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }
    public void loadFromDisk(){
        System.out.println("Loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}
