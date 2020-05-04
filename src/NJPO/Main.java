package NJPO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String text;
        int nmbOfTag;
        boolean loop = false;

        System.out.println("Wprowadz teskt:");
        text = scanner.nextLine();

        while(!loop) {
            Scanner secondScanner  = new Scanner(System.in);
            try {
                System.out.println("Wybierz tag :\n1.<p>\n2.<strong>\n3.<em>\n4.<mark>");
                nmbOfTag = secondScanner.nextInt();

                TextFactoryClient client = new TextFactoryClient();

                client.factoryText(new TextFactory(), nmbOfTag, text);
                loop = true;
            } catch (NullPointerException | InputMismatchException e) {
                loop = false;
                System.out.println("Nie ma takiej opcji");
            }
        }

    }
}
