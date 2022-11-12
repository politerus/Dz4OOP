package Task2;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Вы открыли документ в формете XML");
    }

    @Override
    public void create() {
        System.out.println("Вы создали документ в формете XML");
    }

    @Override
    public void change() {
        System.out.println("Вы изменили документ в формете XML");
    }

    @Override
    public void save() {
        System.out.println("Вы сохранили документ в формете XML");
    }
}
