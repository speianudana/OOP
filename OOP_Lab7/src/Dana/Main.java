package Dana;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//
		String consoletext;
		int letterNumber;
		Scanner text = new Scanner(System.in);
		System.out.println("Enter the text(After every sentence must be space):");
		consoletext = text.nextLine();
		System.out.println(consoletext);

		TextFragment fragment = new TextFragment(consoletext);

		//char[]  text1 =consoletext.toCharArray();transform the string into an array
		//System.out.println(text1);
		letterNumber = fragment.vowelNumber(consoletext) + fragment.consonantsNumber(consoletext);
		System.out.println("Task1:    Number of sentences: " + fragment.countS(consoletext));
		System.out.println("Task2:    Number of words: " + fragment.countWords(consoletext));
		System.out.println("Task3:    Number of letters: " + letterNumber);
		System.out.println("BonusTask:Number of vowels: " + fragment.vowelNumber(consoletext));
		System.out.println("BonusTask:Number of consonants is: " + fragment.consonantsNumber(consoletext));
		System.out.println(" ");
		System.out.println("Top 5 words:");
		fragment.top5words(consoletext);
    }}





/*
 class fragment {
	public void main(String[] args) {
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
		String currentLine = "a b c Test test test test text text adsasd asdaa asd asd";
		String[] words = currentLine.toLowerCase().split(" ");
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
			System.out.println(topValue + ". word: " + key + " count: " + value);
			if (topValue == 5) {
				break;
			}
			topValue++;
		}
	}

	private LinkedHashMap<String, Integer> sortHashMap(Map<String, Integer> words) {
		List<Map.Entry<String, Integer>> list = new LinkedList<>(words.entrySet());
		list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}}
}}
*/




