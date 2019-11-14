import java.util.*;

class Scrabble {
    private String word;
    //private HashMap<List<Character>, Integer> scrabbleMap = new HashMap<>();
    public static Map<Character, Integer> scrabbleMap = new HashMap<Character,Integer>();

    Scrabble(String word) {
        this.word = word.toUpperCase();
//        ArrayList<String> firstArray = ("A", "E", "I", "O", "U", "L", "N", "R", "S", "T");
//        scrabbleMap.put(firstArray, 1);
//        List<Character> secondArray = Arrays.asList("D", "G");
//        scrabbleMap.put(secondArray, 2);
//        List<Character> thirdArray = Arrays.asList("B", "C", "M", "P");
//        scrabbleMap.put(thirdArray, 3);
//        List<Character> fourthArray = Arrays.asList("F", "H", "V", "W", "Y");
//        scrabbleMap.put(fourthArray, 4);
//        List<Character> fifthArray = Arrays.asList("K");
//        scrabbleMap.put(fifthArray, 5);
//        List<Character> sixthArray = Arrays.asList("J", "X");
//        scrabbleMap.put(sixthArray, 8);
//        List<Character> seventhArray = ["Q", "Z"];
//        scrabbleMap.put(seventhArray, 10);
        scrabbleMap.put('A', 1);
        scrabbleMap.put('B', 3);
        scrabbleMap.put('C', 3);
        scrabbleMap.put('D', 2);
        scrabbleMap.put('E', 1);
        scrabbleMap.put('F', 4);
        scrabbleMap.put('G', 2);
        scrabbleMap.put('H', 4);
        scrabbleMap.put('I', 1);
        scrabbleMap.put('J', 8);
        scrabbleMap.put('K', 5);
        scrabbleMap.put('L', 1);
        scrabbleMap.put('M', 3);
        scrabbleMap.put('N', 1);
        scrabbleMap.put('O', 1);
        scrabbleMap.put('P', 3);
        scrabbleMap.put('Q', 10);
        scrabbleMap.put('R', 1);
        scrabbleMap.put('S', 1);
        scrabbleMap.put('T', 1);
        scrabbleMap.put('U', 1);
        scrabbleMap.put('V', 4);
        scrabbleMap.put('W', 4);
        scrabbleMap.put('X', 8);
        scrabbleMap.put('Y', 4);
        scrabbleMap.put('Z', 10);

    }

    int getScore() {
        int score = 0;

        for (int i = 0; i < word.length(); i++) {

            char character = word.charAt(i);

            score = score + scrabbleMap.get(character);

        }
        return score;

    }
}
