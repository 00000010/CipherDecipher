package team.contents.application;

import java.util.ArrayList;
import java.util.Scanner;

import team.contents.AlphabetTable;

public class Decipher extends AlphabetTable {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		AlphabetTable.initInputTable();
		AlphabetTable.initOutPutTable();
		
		while(true) {										//can have input after input						//ask for input
			System.out.println("");
			System.out.println("Encrypt or decrypt?"); 					//can input string
			String answerInput = scanner.nextLine(); 				//reads input
			
			if (answerInput.equals("E") || answerInput.equals("e") || answerInput.equals("Encrypt") || answerInput.equals("encrypt") || answerInput.equals("Encrypted please")) {
				System.out.print("Type in what you'd like to encrypt: ");
				String stringEncryptInput = scanner.nextLine();
				String[] encryptArray = stringEncryptInput.split("");
				
				for (int i = 0; i < stringEncryptInput.length(); i++) {
					String letter = encryptArray[i];
					if (letter.equals(",") || letter.equals(" ") || letter.equals("!") || letter.equals("?") || letter.equals("'")) {
				      	System.out.print(encryptArray[i]);
				    }
					else {
						int hashNumber = AlphabetTable.getHashValue(letter);
						String decryption = AlphabetTable.translateValue(hashNumber + 1);
						System.out.print(decryption);
					}
					//System.out.println(hashNumber);
				}
			}
			else if (answerInput.equals("D") || answerInput.equals("d") || answerInput.equals("Decrypt") || answerInput.equals("decrypt") || answerInput.equals("Decrypted please")){
				System.out.println("Type in what you'd like to decrypt: ");
				String stringDecryptInput = scanner.nextLine();
				String[] decryptArray = stringDecryptInput.split("");
				
				for (int i = 0; i < stringDecryptInput.length(); i++) {
					String letter = decryptArray[i];
					if (letter.equals(",") || letter.equals(" ") || letter.equals("!") || letter.equals("?") || letter.equals("'") || letter.equals("\"") || letter.equals(".")) {
				      	System.out.print(decryptArray[i]);
				    }
					else {
						int hashNumber = AlphabetTable.getHashValue(letter);
						String decryption = AlphabetTable.translateValue(hashNumber - 1);
						System.out.print(decryption);
					}
					//System.out.println(hashNumber);
				}
			}
			else {
				System.out.println("You have entered an invalid input. Please try again.");
			}
		}	
	}		
}
	

