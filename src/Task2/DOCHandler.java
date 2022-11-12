package Task2;

public class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Вы открыли документ в формете Doc");
    }

    @Override
    public void create() {
        System.out.println("Вы создали документ в формете Doc");

    }

    @Override
    public void change() {
        System.out.println("Вы изменили документ в формете Doc");

    }

    @Override
    public void save() {
        System.out.println("Вы сохранили документ в формете Doc");
    }
}
