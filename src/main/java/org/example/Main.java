import org.example.Vigenere;

import static java.lang.IO.println;
import static java.lang.IO.readln;

void main() {
    Vigenere cifrario =  new Vigenere();
    String input = readln("Inserisci la frase: ");
    String scelta = readln("Vuoi cifrare o decifrare la frase che inserirai (C/D)? ").toUpperCase();
    String verme;
    String output;
    if(scelta.equals("C")) {
        verme = readln("Ora inserisci la chiave sotto forma di stringa: ");
        if (!verme.matches("[A-Za-z]+")) {
            //Controlla che la chiave contenga solo lettere maiuscole o minuscole.
            // [A-Za-z]+ significa: una o più lettere comprese tra A-Z oppure a-z.
            println("Chiave non valida, termino il programma...");
            return;
        }
        output = cifrario.cifra(input.toUpperCase(), verme.toUpperCase());
        println("Ecco qui la frase cifrata: " + output);
    } else if(scelta.equals("D")) {
        verme = readln("Ora inserisci la chiave sotto forma di stringa: ");
        if (!verme.matches("[A-Za-z]+")) {
            //Controlla che la chiave contenga solo lettere maiuscole o minuscole.
            // [A-Za-z]+ significa: una o più lettere comprese tra A-Z oppure a-z.
            println("Chiave non valida, termino il programma...");
            return;
        }
        output = cifrario.decifra(input.toUpperCase(), verme.toUpperCase());
        println("Ecco qui la frase decifrata: " + output);
    } else {
        println("Scelta non valida, termino il programma...");
    }
}