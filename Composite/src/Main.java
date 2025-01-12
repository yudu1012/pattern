public class Main {
    public static void main(String[] args) {
// Создаем файлы
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Создаем папки
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        // Добавляем файлы в папки
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        folder2.addComponent(file3);
        folder2.addComponent(folder1); // Вложенная папка

        // Показываем структуру
        folder2.showDetails();
    }
}
