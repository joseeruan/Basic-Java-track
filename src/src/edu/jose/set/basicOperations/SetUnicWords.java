package edu.jose.set.basicOperations;

import java.util.HashSet;
import java.util.Set;

public class SetUnicWords {
    private Set<String> wordsSet;

    public SetUnicWords() {
        this.wordsSet = new HashSet<>();
    }

    public void addWord(String word) {
        wordsSet.add(word);
    }

    public void removeWord(String word) {
        if (!wordsSet.isEmpty()) {
            if (wordsSet.contains(word)) {
                wordsSet.remove(word);
            } else {
                System.out.println("This word not present in the set.");
            }
        } else {
            System.out.println("This set is empty.");
        }
    }

    public boolean verificationWord(String word) {
        return wordsSet.contains(word);
    }
    public void showWords() {

        if(!wordsSet.isEmpty()) {
            System.out.println(wordsSet);
        }
        else {
            System.out.println("This set is empty.");
        }
    }

    public static void main(String[] args) {
        SetUnicWords setWords = new SetUnicWords();

        setWords.addWord("Messi");
        setWords.addWord("Fernando");
        setWords.addWord("Cristiano");
        setWords.addWord("Messi");

        setWords.showWords();
        setWords.removeWord("Messi");
        System.out.println(setWords.verificationWord("Messi"));
    }
}
