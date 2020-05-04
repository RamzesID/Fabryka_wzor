package NJPO;

public class StrongFactory extends PlainText{

    public StrongFactory(String text) {
        super(text);
    }

    @Override
    public void write() {
        System.out.print("<strong>");
        super.write();
        System.out.print("</strong>");
    }
}
