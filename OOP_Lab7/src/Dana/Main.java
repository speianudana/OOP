package Dana;

import java.util.Scanner;

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
		fragment.wordFrequency(consoletext);

	}}

