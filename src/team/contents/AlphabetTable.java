package team.contents;

import java.util.Hashtable;

public class AlphabetTable {

	static Hashtable<String, Integer> inputTable;
	static Hashtable<Integer, String> outputTable;
	
	public static void initInputTable() {
		inputTable = new Hashtable<String, Integer>();
		inputTable.put("A", 0);
		inputTable.put("a", 0);
		inputTable.put("B", 1);
		inputTable.put("b", 1);
		inputTable.put("C", 2);
		inputTable.put("c", 2);
		inputTable.put("D", 3);
		inputTable.put("d", 3);
		inputTable.put("E", 4);
		inputTable.put("e", 4);
		inputTable.put("F", 5);
		inputTable.put("f", 5);
		inputTable.put("G", 6);
		inputTable.put("g", 6);
		inputTable.put("H", 7);
		inputTable.put("h", 7);
		inputTable.put("I", 8);
		inputTable.put("i", 8);
		inputTable.put("J", 9);
		inputTable.put("j", 9);
		inputTable.put("K", 10);
		inputTable.put("k", 10);
		inputTable.put("L", 11);
		inputTable.put("l", 11);
		inputTable.put("M", 12);
		inputTable.put("m", 12);
		inputTable.put("N", 13);
		inputTable.put("n", 13);
		inputTable.put("O", 14);
		inputTable.put("o", 14);
		inputTable.put("P", 15);
		inputTable.put("p", 15);
		inputTable.put("Q", 16);
		inputTable.put("q", 16);
		inputTable.put("R", 17);
		inputTable.put("r", 17);
		inputTable.put("S", 18);
		inputTable.put("s", 18);
		inputTable.put("T", 19);
		inputTable.put("t", 19);
		inputTable.put("U", 20);
		inputTable.put("u", 20);
		inputTable.put("V", 21);
		inputTable.put("v", 21);
		inputTable.put("W", 22);
		inputTable.put("w", 22);
		inputTable.put("X", 23);
		inputTable.put("x", 23);
		inputTable.put("Y", 24);
		inputTable.put("y", 24);
		inputTable.put("Z", 25);
		inputTable.put("z", 25);
	}
	
	public static void initOutPutTable() {
		outputTable = new Hashtable<Integer, String>();
		outputTable.put(0, "A");
		outputTable.put(1, "B");
		outputTable.put(2, "C");
		outputTable.put(3, "D");
		outputTable.put(4, "E");
		outputTable.put(5, "F");
		outputTable.put(6, "G");
		outputTable.put(7, "H");
		outputTable.put(8, "I");
		outputTable.put(9, "J");
		outputTable.put(10, "K");
		outputTable.put(11, "L");
		outputTable.put(12, "M");
		outputTable.put(13, "N");
		outputTable.put(14, "O");
		outputTable.put(15, "P");
		outputTable.put(16, "Q");
		outputTable.put(17, "R");
		outputTable.put(18, "S");
		outputTable.put(19, "T");
		outputTable.put(20, "U");
		outputTable.put(21, "V");
		outputTable.put(22, "W");
		outputTable.put(23, "X");
		outputTable.put(24, "Y");
		outputTable.put(25, "Z");
	}
		
	/**
	 * 
	 * @param string
	 * @return
	 */
	public static int getHashValue(String string) {
		return inputTable.get(string);
	}
	public static String translateValue(int number) {
		return outputTable.get(number);
	}
	
}
