package org.example;

public class Vigenere {

    public String cifra(String input, String verme) {
        verme = calcoloVerme(input, verme);
        int counterVerme = 0;
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if((int)input.charAt(i) >= 65 && (int)input.charAt(i) <= 90){
                if((int)input.charAt(i) + ((int)verme.charAt(counterVerme) - 65) > 90) {
                    output += (char)((int)input.charAt(i) - (26 - ((int)verme.charAt(counterVerme) - 65)));
                } else {
                    output += (char)((int)input.charAt(i) + ((int)verme.charAt(counterVerme) - 65));
                }
                counterVerme++;
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }

    public String decifra(String input, String verme) {
        verme = calcoloVerme(input, verme);
        int counterVerme = 0;
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if((int)input.charAt(i) >= 65 && (int)input.charAt(i) <= 90){
                if((int)input.charAt(i) - ((int)verme.charAt(counterVerme) - 65) < 65) {
                    output += (char)((int)input.charAt(i) + (26 - ((int)verme.charAt(counterVerme) - 65)));
                } else {
                    output += (char)((int)input.charAt(i) - ((int)verme.charAt(counterVerme) - 65));
                }
                counterVerme++;
            } else {
                output += input.charAt(i);
            }
        }
        return output;
    }

    public String calcoloVerme(String input, String verme) {
        String output = "";
        input = input.replace(" ", "");
        int ripetizioneVerme = input.length() / verme.length();
        for(int i = 0; i < ripetizioneVerme; i++) {
            output += verme;
        }
        for(int j = 0; j < (input.length() % verme.length()); j++) {
            output += verme.charAt(j);
        }
        return output;
    }
}
