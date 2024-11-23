package Модуль10dz;

public class HomeTheaterTest {
    public static void main(String[] args) {
        TV tv = new TV();
        AudioSystem audioSystem = new AudioSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();
        GameConsole gameConsole = new GameConsole();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, audioSystem, dvdPlayer, gameConsole);

        homeTheater.watchMovie();
        homeTheater.adjustVolume(15);
        homeTheater.stopMovie();
        homeTheater.startGame("Super Mario");
        homeTheater.listenToMusic();
        homeTheater.shutdown();
    }
}
