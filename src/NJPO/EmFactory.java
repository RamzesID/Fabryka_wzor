package NJPO;

public class EmFactory extends PlainText {

    public EmFactory(String text) {
        super(text);
    }

    @Override
    public void write() {
        System.out.print("<em>");
        super.write();
        System.out.print("</em>");
    }
}
