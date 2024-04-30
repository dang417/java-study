package Exercise;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        String str = "This is an awsome occasion. " +
                "This has never happend before.";
        Map<String, Integer> wordMap = new HashMap<>();
        Map<Character, Integer> characterMap = new HashMap<>();

//        for (String character:str.split("")) {
//            characterMap.put(character, characterMap.getOrDefault(character, 0) + 1);
//        }
//
//        for (String word:str.split(" ")) {
//            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
//        }
//
//        System.out.println(characterMap);
//        System.out.println(wordMap);

        char[] characters = str.toCharArray();

        for(char character:characters) {
            Integer integer = characterMap.get(character);
            if(integer == null) {
                characterMap.put(character, 1);
            } else {
                characterMap.put(character, integer + 1);
            }
        }

        System.out.println(characterMap);

        String[] words = str.split(" ");

        for (String word:words) {
            Integer integer = wordMap.get(word);
            if(integer == null) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, integer + 1);
            }
        }

        System.out.println(wordMap);
    }
}
