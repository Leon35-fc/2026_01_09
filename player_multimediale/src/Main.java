import entities.elementoMultimediale;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Inserisci il nome del file.");
        String title = scn.nextLine();
        System.out.println("Inserisci la durata. (se è un'immagine premi \"INVIO\".)");
        int duration = scn.nextInt();

        elementoMultimediale el1 = new elementoMultimediale(title, duration);
        System.out.println(el1.getTitle());
        System.out.println(el1.getDuration());
        }
    }
