package org.example;

public class Vigenère {

    public Vigenère() {

    }

    public String cifra(String input, String verme) {
        verme = calcoloVerme(input, verme);
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if((int)input.charAt(i) >= 65 && (int)input.charAt(i) <= 90){
                if((int)input.charAt(i) + (int)verme.charAt(i) > 90) {
                    output += (char)((int)input.charAt(i) - (26 - (int)verme.charAt(i)));
                } else {
                    output += (char)((int)input.charAt(i) +  (int)verme.charAt(i));
                }
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }

    public String decifra(String input, String verme) {
        verme = calcoloVerme(input, verme);
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if((int)input.charAt(i) >= 65 && (int)input.charAt(i) <= 90){
                if((int)input.charAt(i) - (int)verme.charAt(i) < 65) {
                    output += (char)((int)input.charAt(i) + (26 - (int)verme.charAt(i)));
                } else {
                    output += (char)((int)input.charAt(i) - (int)verme.charAt(i));
                }
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }

    public String calcoloVerme(String input, String verme) {
        int ripetizioneVerme = input.length() / verme.length();
        for(int i = 0; i < ripetizioneVerme; i++) {
            verme += verme;
        }
        for(int j = 0; j < (input.length() % verme.length()); j++) {
            verme += verme.charAt(j);
        }
        return verme;
    }
}
