package Task2;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Вы открыли документ в формете TXT");
    }

    @Override
    public void create() {
        System.out.println("Вы создали документ в формете TXT");
    }

    @Override
    public void change() {
        System.out.println("Вы изменили документ в формете TXT");
    }

    @Override
    public void save() {
        System.out.println("Вы сохранили документ в формете TXT");
    }
}
