import java.io.IOException;

import javax.swing.*;

public class lab5 {
	
	public static void main(String[] args) throws IOException {
		
		
		TextFileInput whateverIWant = new TextFileInput(args[0]);
		
		//String[] wordArray = {"hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon"};

		String [] wordArray = whateverIWant.returnArray();
		
		
		String isOrIsNot, inputWord;
	
		while(true) {
			
			// This line asks the user for input by popping out a single window with text input
			
			inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");

			if(inputWord.equalsIgnoreCase("STOP"))
				System.exit(0);

			// if the inputWord is contained within wordArray return true
			
			if (wordIsThere(inputWord, wordArray)) 
				
				isOrIsNot = "is"; // set to is if the word is on the list
			else
				isOrIsNot = "is not"; // set to is not if the word is not on the list

			// Output to a JOptionPane window whether the word is on the list or not
			
			JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
		}
	}//main

	public static boolean wordIsThere(String findMe, String[] theList) {
		for(int i=0; i<theList.length; i++) {
			if(findMe.equals(theList[i]))
				return true;
		}

		return false;
	} // wordIsThere
}
//	public static String[] inputFromFile(String textInputFile) {
//		//Step1: Read the file and count the line
//		TextFileInput tf=new TextFileInput(textInputFile);
//
//		int size=0;
//		while(tf.readLine()!=null)
//			size++;
//
//		tf.close();
//
//		//Step2: create the array
//		String[] wordArray=new String[size];
//
//		//Step3: Read the file again and save it into the arrray
//		tf=new TextFileInput(textInputFile);
//
//		int index=0;
//		String line=tf.readLine();
//		while(line!=null) {
//			wordArray[index]=line;
//			line=tf.readLine();
//			index++;
//		}
//
//		tf.close();
//		
//		return wordArray;
//	}
//}
//
