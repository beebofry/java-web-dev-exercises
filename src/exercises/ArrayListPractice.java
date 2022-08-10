package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(4);
        numList.add(3);
        numList.add(5);
        numList.add(6);
        numList.add(2);
        numList.add(5);
        numList.add(8);
        numList.add(4);
        numList.add(1);

        Integer evenSum = AddEvenNumbers.getSum(numList);
        System.out.println(evenSum);

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("word");
        wordList.add("words");
        wordList.add("wordle");
        wordList.add("wordy");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter in a word length: ");
        int wordLength = input.nextInt();

        System.out.println(FiveLetters.fiveLetterFinder(wordList, wordLength));
    }
}
