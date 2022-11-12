package Task3;

public class Main extends Player {
    public static void main(String[] args) {
        Player player1= new Player();

        player1.record();
        player1.pause();
        player1.play();
        player1.stop();


    }
}
/*      Використовуючи IntelliJ IDEA, створіть проект.
        Потрібно: Створіть 2 інтерфейси Playable та Recodable.
        У кожному з інтерфейсів створіть по 3 методи
        void play() / void pause() / void stop() та void record()
        / void pause() / void stop() відповідно.
        Створіть похідний клас Player від базових інтерфейсів Playable та Recodable.
        Написати програму, яка виконує програвання та запис. */