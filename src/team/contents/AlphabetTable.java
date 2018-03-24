package team.contents;

import java.util.Hashtable;

public class AlphabetTable {

	static Hashtable<String, Integer> table;
	
	public static void init_table() {
		table = new Hashtable<String, Integer>();
		table.put("A", 0);
		table.put("B", 1);
		table.put("C", 2);
		table.put("D", 3);
		table.put("E", 4);
		table.put("F", 5);
		table.put("G", 6);
		table.put("H", 7);
		table.put("I", 8);
		table.put("J", 9);
		table.put("K", 10);
		table.put("L", 11);
		table.put("M", 12);
		table.put("N", 13);
		table.put("O", 14);
		table.put("P", 15);
		table.put("Q", 16);
		table.put("R", 17);
		table.put("S", 18);
		table.put("T", 19);
		table.put("U", 20);
		table.put("V", 21);
		table.put("W", 22);
		table.put("X", 23);
		table.put("Y", 24);
		table.put("Z", 25);
	}
		
	/**
	 * 
	 * @param string
	 * @return
	 */
	public static int getHashValue(String string) {
		return table.get(string);
	}
	
}
