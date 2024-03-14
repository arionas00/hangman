import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				Scanner scan= new Scanner(System.in);	
		
				//New word
			String GWord= Dictionary.ChooseWord();
				int len =GWord.length() ;
				boolean retard;
			//starting the---
				char[] ChinaWord =GWord.toCharArray();
				char[]	GcWord  = GWord.toCharArray();
			 
			 //it is obvious
			 int right=0 ,wrong=0,wins=0,France=0, total=0;
			 char wannaCry;
			 //making the ---
			  for(int i=0;i<len;i++) {
					ChinaWord[i]='-';
			 }
			 	/*That helped me develop it. IT WORKS
				System.out.println(GcWord);
				System.out.println(GWord);
				System.out.println(ChinaWord);
				*/

				int life=5;
				boolean status=false;
				
				//Here it stars
				System.out.println("Wanna cry? Press Y to continue");
				 wannaCry=scan.nextLine().charAt(0);
				 wannaCry= Character.toUpperCase(wannaCry);
				
				if(wannaCry=='Y') {
						System.out.println("WELCOME TO THE HANGMAN");
					}
			//obvious
				System.out.println("Main Menu");
				System.out.println("Start New Game (Y)");
				System.out.println("Statistics (S)");
				System.out.println("Exit (E)");
				System.out.println("What is it that you desire?");
				
				 wannaCry=scan.nextLine().charAt(0);
				 wannaCry= Character.toUpperCase(wannaCry);
				 
				 do {//Loop so you either play or you exit Inteligence 100 dictionary 0
					 if(wannaCry=='S') {while((wannaCry!='Y')&&(wannaCry!='E')) {
						System.out.println("So far you have played "+total +" time(s). You won "+wins+" and lost "+France+" times");
						System.out.println("If you wish to continue to the game press Y else press E");

						 wannaCry=scan.nextLine().charAt(0);
						 wannaCry= Character.toUpperCase(wannaCry);
					 }}
					 if(wannaCry=='E') {
						 break;}
				
					
					while(life>0) 
				// game starts 
				{status=false;
					System.out.println("TYPE IN AN UPPERCASE LETTER");					
					String let=scan.nextLine();
					char l=let.charAt(0);
					l=Character.toUpperCase(l);
					
					
				// making sure you have above 69 IQ	
					if(Character.isDigit(l))  {do {
						System.out.println("TYPE IN AN UPPERCASE LETTER YOU MORRON, HOW DO YOU EVEN LIVE? BY CHARLES DARWIN YOU SHOULD BE EXTINCT BY NOW");					
						 let=scan.nextLine();
						 l=let.charAt(0);
						l=Character.toUpperCase(l);
						if(Character.isDigit(l)) {retard=true;}
						else {retard=false;}
					}while(retard==true);
						}
					
					// making sure your guess is correct
					for(int i=0;i<len;i++) {
						
						if (l==GcWord[i]) {
							status=true;
							ChinaWord[i]=l;
							right++;
						}
					}
					
					
					
					//if not you lose life
					if(status==false) {life--;
					System.out.println("The letter "+ l+" is not in the word");
					wrong++;
					}
					//it had a problem with the char[] format
					String str=new String(ChinaWord);
					
					System.out.println(str+" you have "+life+" attempts left");
					
					//you either lose or win so I put both together
					if(life==0) {
						System.out.println("You lose, the word is "+GWord+"\n Better luck next time");
						France++;
						}else if(Arrays.equals(ChinaWord,GcWord)) {
							System.out.println("YOU WON!!!!!");
							wins++;
							break;
						
						
						}
					
				}//End
					System.out.println("You have made "+right+" correct guesses and "+wrong+"wrong guesses");
					
					// Menu again 
					
				
				life=5;
				System.out.println("Main Menu");
				System.out.println("Start New Game (Y)");
				System.out.println("Statistics (S)");
				System.out.println("Exit (E)");
				System.out.println("What is it that you desire?");
				 
				 wannaCry=scan.nextLine().charAt(0);
				 wannaCry= Character.toUpperCase(wannaCry);
				 //THIS IS BAD BUT I HAVE TO IT IS 1am and I need to sleep Have a nice day
				 if(wannaCry=='S') {while((wannaCry!='Y')&&(wannaCry!='E')) {
						System.out.println("So far you have played "+total +" time(s). You won "+wins+" and lost "+France+" times");
						System.out.println("If you wish to continue to the game press Y else press E");

						 wannaCry=scan.nextLine().charAt(0);
						 wannaCry= Character.toUpperCase(wannaCry);
					 }}
					 if(wannaCry=='E') {
						 break;}
				}while(wannaCry=='Y');
			



		


	

}
}
