import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class NL {

	public static void main(String[] args) {
		
		//string of questions
		String [] questions = new String [6]; 
		
		// questions:
		questions[0] = "Waarom heb je gekozen voor software engineering?";
		questions[1] = "Kun je iets over jezelf vertellen?";
		questions[2] = "Wat vindt je van programmeren en wat weet je hierover?";
		questions[3] = "Waarom wil je voor dit bedrijf werken?";
		questions[4] = "Waarom zouden we jou moeten aannemen?";
		questions[5] = "Wat zijn je sterke en zwakke punten?";
		
		
		
		
		 // converting array to a List
	    List<String> list = Arrays.asList(questions);
	    
	    // Shuffling list elements
	    Collections.shuffle(list);
		
		// introduction
		System.out.println("Dit programma gaat " + questions.length + " vragen in een willekeurige volgorde aan de kandidaat stellen .");

		System.out.println(" ");
		System.out.println("Wilt u meer weten over deze kandidaat?");
		
		// for loop for the listed questions
		for (int i =0; i<questions.length; i++   ) {
			//multiply by "size of array" to get a fractional number between numbers 0 and end number of the array length
			int lucky = (int) (Math.random()*questions.length);
		
			// Programm will ask the user if you want to continue
			System.out.println("Toets ja om naar de volgende vraag te gaan of toets nee om het programma af te sluiten.");
			
			// Scanner input for answer "yes" or "no"
			Scanner scanner = new Scanner(System.in); 
			String answer = scanner.nextLine();
			System.out.println(" ");	
			
			// if condition statement if answer equals yes
			if(answer.equalsIgnoreCase("ja")) {
				System.out.println("De " + (i+1)+"e" +" vraag Moraad: " +  questions[i] );
				if (i+1==questions.length) {
					System.out.println(" ");
					System.out.println("Dit was de laatse vraag, dankjewel voor het gesprek!");

				}
				
			} else {
				System.out.println("Het programma is afgesloten.");
				break;
			}
		
		}
		
	}

}
