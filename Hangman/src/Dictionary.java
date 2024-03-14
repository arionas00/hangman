import java.math.*;
import java.util.Random;
public class Dictionary extends Main{
	
		/*String[] words1 = {"UNIVERSITY", "COMPUTER", "LAPTOP","HEADPHONES","FUZZY","STARPLATINUM","KILLERQUEEN","ROUNDABOUT","MUDA","OMAEWAMU","SHINDEYRU","EMU","OSCAR","FOXTROT","ALPHA","ROMES","INDIA","SIERRA","TANGO","ECHO","DELTA","KILO","CAT","BUILDING","HELLO","THERE","MIKE"};
		 String s = "";
		for (String n:sArray)
	        s+= n;
		char[] words = words1.toCharArray();
		return words;
		*/
	
		

	public static  String ChooseWord() {
		int index;
		Random r = new Random();
		index= r.nextInt((33-0)+1)+0;
		
		switch (index) {
		case 0: return "UNIVERSITY";
		case 1: return "COMPUTER";
		case 2: return "LAPTOP";
		case 3: return "HEADPHONES";
		case 4: return "FUZZY";
		case 5: return "DOG";
		case 6: return "KEYHOLE";
		case 7: return "TELEPHONE";
		case 8: return "PRINTER";
		case 9: return "BUILDING";
		case 10: return "CAT";
		case 11: return "BOOK";
		case 12: return "JAZZ";
		case 13: return "STARPLATINUM";
		case 14: return "KILLERQUEEN";
		case 15: return "ROUNDABOUT";
		case 16: return "JOJO";
		case 17: return "MUDA";
		case 18: return "ORA";
		case 19: return "NANI";
		case 20: return "OMAEWAMU";
		case 21: return "SHINDEYRU";
		case 22: return "EMU";
		case 23: return "OSCAR";
		case 24: return "FOXTROT";
		case 25: return "ALPHA";
		case 26: return "ROMES";
		case 27: return "INDIA";
		case 28: return "SIERRA";
		case 29: return "TANGO";
		case 30: return "ECHO";
		case 31: return "DELTA";
		case 32: return "KILO";
		case 33: return "MIKE";

		default: return "Illegal index";
		}
		}; 


	}

