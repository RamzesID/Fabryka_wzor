package NJPO;

public class PDFactory extends PlainText {

    public PDFactory(String text) {
        super(text);
    }

    @Override
    public void write() {
        System.out.print("<p>");
        super.write();
        System.out.print("</p>");
    }
}