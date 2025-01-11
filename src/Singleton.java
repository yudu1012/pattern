public class Singleton {
    private static Singleton instance;

    public Singleton() {
    }
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void show(){
        System.out.println("i had like to work every day");
    }

}
