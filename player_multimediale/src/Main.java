import entities.Audio;
import entities.ElementoMultimediale;
import entities.Image;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Aggiungi elementi all'elenco");

        ElementoMultimediale[] elements = new ElementoMultimediale[6];

        for (byte i = 1; i < 6; i++){
//            System.out.println("Che tipo di file vuoi creare? 1=");
//            MediaType mediaType = scn.nextByte();
            System.out.println("Inserisci il nome del file.");
            String title = scn.nextLine();
            System.out.println("Inserisci la durata del file. (Se è un'immagine premi 0.)");
            int duration = scn.nextInt();
            scn.nextLine();
            elements[i] = new Audio(title, duration);
        }
//        ElementoMultimediale el1 = new ElementoMultimediale(title, duration);
        int choose = 1;
        while ( choose != 0) {
        System.out.println("Quale elemento vuoi visualizzare?");
        choose = Integer.parseInt(scn.nextLine());
        for (int i = 0; i < elements[choose].getDuration() || 1 ; i++){
            System.out.println(elements[choose].play());
            }
            }
        }
    }
