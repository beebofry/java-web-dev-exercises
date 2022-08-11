package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        HashMap<Character, Integer> characters = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a passage: ");
        String passage = input.nextLine().toUpperCase();

        char [] charactersInString = passage.toCharArray();
        for (char i : charactersInString) {
            if (!characters.containsKey(i)) {
                characters.put(i, 1);
            } else {
                characters.put(i, characters.get(i) +1);
            }
        }
        for (Map.Entry<Character, Integer> letter : characters.entrySet()){
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
}
