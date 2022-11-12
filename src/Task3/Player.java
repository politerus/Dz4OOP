package Task3;

public class Player  implements Playable,Recodable{
    @Override
    public void play() {
        System.out.println("Проигрываем музыку");
    }

    @Override
    public void record() {
        System.out.println("Записываем музыку");
    }

    @Override
    public void pause() {
        System.out.println("Поставили на паузу");
    }

    @Override
    public void stop() {
        System.out.println("Остановили");
    }

}
