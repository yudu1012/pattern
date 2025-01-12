public class ProxyImage implements Image{
     private String filename;
     private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(filename);
        }
        System.out.println("Access control: Checking permissions...");
        realImage.display();
    }
}
