package Dana;

import java.util.*;

public class TextFragment {
    String textfragment;

    public TextFragment() {
    }

    public TextFragment(String textfragment) {
        this.textfragment = textfragment;
    }

    int countS(String str1) {
        int sentenceCount = 1;
//		String myFile = "The quick brown fox jumps over the lazy dog. Wow!!!!";
        String SENTENCE_DELIMETERS = ".?!";
        for (int i = 0; i < str1.length() - 1; i++) {
            for (int j = 0; j < SENTENCE_DELIMETERS.length(); j++) {
                if (str1.charAt(i) == SENTENCE_DELIMETERS.charAt(j)) {
                    if (str1.charAt(i + 1) == SENTENCE_DELIMETERS.charAt(j)) {
                        sentenceCount--;
                    }
                    sentenceCount++;
                }
            }
        }
        return sentenceCount;
    }

    public int countWords(String s) {
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                count++;

            }
        }
        return count + 1;
    }

    int consonantsNumber(String sentence) {

        int consonantCount = 0;
        int i;
        String consonants = "qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM";
        for (i = 0; i < sentence.length(); i += 1) {
            char currentChar = sentence.charAt(i);
            int index;
            for (index = 0; index < consonants.length(); index += 1) {
                if (consonants.charAt(index) == (currentChar)) {
                    consonantCount++;
                }
            }
        }
        return consonantCount;
    }


    int vowelNumber(String sentence) {

        int vowelCount = 0;
        int i;
        String vowels = "aeiouAEIOU";
        for (i = 0; i < sentence.length(); i += 1) {
            char currentChar = sentence.charAt(i);
            int index;
            for (index = 0; index < vowels.length(); index += 1) {
                if (vowels.charAt(index) == (currentChar)) {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }


    private static LinkedHashMap<String, Integer> sortHashMap(Map<String, Integer> words) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(words.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public  void top5words(String sentence) {
        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        LinkedHashMap<String, Integer> stringIntegerLinkedHashMap = sortHashMap(wordCountMap);
        int topValue = 1;
        for (Map.Entry<String, Integer> entry : stringIntegerLinkedHashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(topValue + key + " : " + value+" times");
            if (topValue == 5) {
                break;
            }
            topValue++;
        }
    }




  }