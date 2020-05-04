package NJPO;

public class TextFactoryClient {

    public void factoryText(TextFactory factory,int nmb , String text){
        Text Tagtext = factory.addTag(nmb,text);
        Tagtext.write();
    }
}
