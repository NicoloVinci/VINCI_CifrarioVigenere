import org.example.Vigenère;

import static java.lang.IO.println;
import static java.lang.IO.readln;

void main() {
    Vigenère cifrario =  new Vigenère();
    String input = readln("Inserisci la frase: ");
    String scelta = readln("Vuoi cifrare o decifrare la frase che inserirai (C/D)? ").toUpperCase();
    String verme;
    String output;
    if(scelta.equals("C")) {
        verme = readln("Ora inserisci la chiave sottoforma di stringa: ");
        output = cifrario.cifra(input.toUpperCase(), verme.toUpperCase());
        println("Ecco qui la frase cifrata: " + output);
    } else if(scelta.equals("D")) {
        verme = readln("Ora inserisci la chiave sottoforma di stringa: ");
        output = cifrario.decifra(input.toUpperCase(), verme.toUpperCase());
        println("Ecco qui la frase decifrata: " + output);
    } else {
        println("Scelta non valida, termino il programma...");
    }
}