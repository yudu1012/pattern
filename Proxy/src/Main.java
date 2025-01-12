public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Первое отображение загрузит файл с диска.
        image.display();
        System.out.println();

        // Второе отображение использует кэшированный объект.
        image.display();
    }
}