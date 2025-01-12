public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(1, 1, "Oak", "Green", "Rough");
        forest.plantTree(2, 3, "Pine", "Dark Green", "Smooth");
        forest.plantTree(3, 5, "Oak", "Green", "Rough");
        forest.plantTree(5, 7, "Pine", "Dark Green", "Smooth");

        System.out.println("\nРисуем лес:");
        forest.draw();
    }
}