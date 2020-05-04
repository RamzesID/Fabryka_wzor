package NJPO;

public class TextFactory {

    public Text addTag(int number, String text){
        switch (number){
            case 1 :
                return new PDFactory(text);
            case  2 :
                return  new StrongFactory(text);
            case 3 :
                return new EmFactory(text);
            case 4 :
                return new MarkFactory(text);
        }
        return null;
    }
}
