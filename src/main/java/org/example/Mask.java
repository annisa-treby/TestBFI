package org.example;

public class Mask {

    public String mask(String original) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = original.split(" ");
        for(String word : words){
            String newWord;
            if (word.length() <= 2){
                newWord = word;
            } else {
                newWord = replaceWord(word, '*');
            }
            stringBuilder.append(newWord);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static String replaceWord(String word, char replacer) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word.charAt(0));
        for (int i = 1; i < word.length()-1; i++) {
            stringBuilder.append(replacer);
        }
        stringBuilder.append(word.charAt(word.length()-1));
        return stringBuilder.toString();
    }
}
