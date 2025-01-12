public class HomeTheaterFacade {
    private AudioSystem audioSystem;
    private VideoSystem videoSystem;
    private Projector projector;

    public HomeTheaterFacade() {
        this.audioSystem = new AudioSystem();
        this.videoSystem= new VideoSystem();
        this.projector = new Projector();
    }
    public void watchMovie(){
        System.out.println("Подготовка к просмотру фильма...");
        audioSystem.turnOn();
        audioSystem.setVolume(12);
        videoSystem.turnOn();
        videoSystem.setResolution("1080");
        projector.turnOn();
        projector.setMode("movie");
        System.out.println("Приятного просмотра!");
    }
    public void endMovie() {
        System.out.println("Завершение просмотра фильма...");
        System.out.println("Все системы выключены.");
    }
}
