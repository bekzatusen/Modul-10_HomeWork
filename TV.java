package Модуль10dz;

public class TV {
    public void on() {
        System.out.println("Телевизор включен.");
    }
    public void off() {
        System.out.println("Телевизор выключен.");
    }
    public void setChannel(int channel) {
        System.out.println("Канал телевизора установлен на " + channel + ".");
    }
}

class AudioSystem {
    public void on() {
        System.out.println("Аудиосистема включена.");
    }
    public void off() {
        System.out.println("Аудиосистема выключена.");
    }
    public void setVolume(int level) {
        System.out.println("Громкость аудиосистемы установлена на " + level + ".");
    }
}

class DVDPlayer {
    public void play() {
        System.out.println("DVD-проигрыватель воспроизводит.");
    }
    public void pause() {
        System.out.println("DVD-проигрыватель на паузе.");
    }
    public void stop() {
        System.out.println("DVD-проигрыватель остановлен.");
    }
}

class GameConsole {
    public void on() {
        System.out.println("Игровая консоль включена.");
    }
    public void startGame(String game) {
        System.out.println("Запуск игры: " + game);
    }
}


class HomeTheaterFacade {
    private TV tv;
    private AudioSystem audioSystem;
    private DVDPlayer dvdPlayer;
    private GameConsole gameConsole;

    public HomeTheaterFacade(TV tv, AudioSystem audioSystem, DVDPlayer dvdPlayer, GameConsole gameConsole) {
        this.tv = tv;
        this.audioSystem = audioSystem;
        this.dvdPlayer = dvdPlayer;
        this.gameConsole = gameConsole;
    }

    public void watchMovie() {
        System.out.println("Подготовка к просмотру фильма...");
        tv.on();
        audioSystem.on();
        dvdPlayer.play();
        System.out.println("Фильм начался. Приятного просмотра!");
    }

    public void stopMovie() {
        System.out.println("Остановка фильма...");
        dvdPlayer.stop();
        audioSystem.off();
        tv.off();
        System.out.println("Фильм остановлен.");
    }

    public void startGame(String game) {
        System.out.println("Подготовка к игре...");
        tv.on();
        gameConsole.on();
        gameConsole.startGame(game);
        System.out.println("Игра началась. Приятного времяпрепровождения!");
    }

    public void listenToMusic() {
        System.out.println("Подготовка к прослушиванию музыки...");
        tv.on();
        audioSystem.on();
        System.out.println("Аудиосистема настроена на музыкальный режим.");
    }

    public void adjustVolume(int level) {
        System.out.println("Регулировка громкости...");
        audioSystem.setVolume(level);
    }

    public void shutdown() {
        System.out.println("Выключение системы...");
        tv.off();
        audioSystem.off();
        dvdPlayer.stop();
        System.out.println("Система выключена.");
    }
}


