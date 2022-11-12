package Task2;

public class Main {
    public static void main(String[] args) {

AbstractHandler doc = new DOCHandler();
AbstractHandler txt = new TXTHandler();
AbstractHandler xml = new XMLHandler();
operete(doc);
operete(txt);
operete(xml);
    }

    public static void operete(AbstractHandler files) {
        if (files instanceof DOCHandler){
            System.out.println("DOC фаил");
            files.change();
            files.create();
            files.open();
            files.save();
            System.out.println("_______________________________");
        }
        if (files instanceof TXTHandler){
            System.out.println("TXT фаил");
            files.change();
            files.create();
            files.open();
            files.save();
            System.out.println("_______________________________");
        }
        if (files instanceof  XMLHandler){
            System.out.println("XML фаил");
            files.change();
            files.create();
            files.open();
            files.save();

        }

    }
}
     /*   Використовуючи IntelliJ IDEA, створіть проект.
        Потрібно: Створити клас AbstractHandler.
        У тілі класу створити методи void open(),
        void create(), void change(), void save().
        Створити похідні класи XMLHandler, TXTHandler, DOCHandler
        від базового класу AbstractHandler. Написати програму,
        яка виконуватиме визначення документа і для кожного формату
        мають бути методи відкриття, створення, редагування,
        збереження певного формату документа. */