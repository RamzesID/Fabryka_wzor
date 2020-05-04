package NJPO;

public class MarkFactory extends PlainText{

    public MarkFactory(String text) {
        super(text);
    }

    @Override
    public void write() {
        System.out.print("<mark>");
        super.write();
        System.out.print("</mark>");
    }
}
