package team.contents.application;

import java.util.ArrayList;
import java.util.Scanner;

import team.contents.AlphabetTable;

public class Decipher extends AlphabetTable {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		AlphabetTable.init_table();
		
		while(true) {										//can have input after input						//ask for input
			System.out.println("Enter"); 					//can input string
			String input = scanner.nextLine(); 				//reads input
			
			String[] newInput = input.split("");
			
			for (int i = 0; i < input.length(); i++) {
//				try {
					String letter = newInput[i];
					int hashNumber = AlphabetTable.getHashValue(letter);
					System.out.println(hashNumber);
//				}
//				catch (Exception e) {
//					System.out.println("You messed up");
//				}
			}	
		}
		
	}
	
}

