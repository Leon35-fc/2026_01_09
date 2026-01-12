import entities.Audio;
import entities.ElementoMultimediale;
import entities.Image;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.println("Aggiungi elementi all'elenco");

        ElementoMultimediale[] elements = new ElementoMultimediale[6];
        byte elementCount = 0;

        for (byte i = 1; i < 6; i++){
            System.out.println("Aggiungi un nuovo file! \nChe tipo di file vuoi creare? \n(1=Audio, 2=Image, 3=Video)");
            byte mediaType = scn.nextByte();
            System.out.println("Inserisci il nome del file.");
            scn.nextLine();
            String title = scn.nextLine();
            int duration = 0;
            if(mediaType != 2){
            System.out.println("Inserisci la durata del file.");
            duration = scn.nextInt();
            scn.nextLine();
            }

            switch (mediaType) {
                case 1:
                    elements[i] = new Audio(title, duration);
                    break;
                case 2:
                    elements[i] = new Image(title);
                    break;
                case 3:
                    elements[i] = new Video(title, duration);
                    break;
            }

            elementCount++;

            System.out.println(STR."Nuovo file aggiunto! [\{elementCount}/5]");
        }
//        ElementoMultimediale el1 = new ElementoMultimediale(title, duration);
        int choose = 1;
        while ( choose != 0) {
        System.out.println("Quale elemento vuoi visualizzare? (Premi 0 per uscire)");
        choose = Integer.parseInt(scn.nextLine());

            if (choose > 0 && choose < 6) {
                if (elements[choose] instanceof Image) {
                    System.out.println(((Image) elements[choose]).show());
                } else if (elements[choose] instanceof Audio){
                    System.out.println(((Audio) elements[choose]).play());
                } else {
                    System.out.println(((Video) elements[choose]).play());
                }
            } else if (choose != 0) {
                System.out.println("Indice non valido");
            }
        }
    }
}
