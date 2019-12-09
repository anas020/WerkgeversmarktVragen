import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Eng {

	public static void main(String[] args) {
		//string of questions
				String [] questions = new String [6]; 
				
				// questions:
				questions[0] = "Why have you chosen for software engineering?";
				questions[1] = "Can you tell something about yourself?";
				questions[2] = "What do you think of programmging and what do you know about it?";
				questions[3] = "Why do you want to work for this company?";
				questions[4] = "Why should we hire you?";
				questions[5] = "What are your strengths & weaknesses?";
			
			
				
				
				 // converting array to a List
			    List<String> list = Arrays.asList(questions);
			    
			    // Shuffling list elements
			    Collections.shuffle(list);
				
				// introduction
			    System.out.println("This programm will ask " + questions.length + " questions in random order to the candidate.");
				System.out.println(" ");
				System.out.println("Do you want to know more about this candidate?");
				
				// for loop for the listed questions
				for (int i =0; i<questions.length; i++   ) {
					//multiply by "size of array" to get a fractional number between numbers 0 and end number of the array length
					int lucky = (int) (Math.random()*questions.length);
				
					// Programm will ask the user if you want to continue
					System.out.println("Enter yes to continue or no to close the programm.");
					
					// Scanner input for answer "yes" or "no"
					Scanner scanner = new Scanner(System.in); 
					String answer = scanner.nextLine();
					System.out.println(" ");	
					
					// if condition statement if answer equals yes
					if(answer.equalsIgnoreCase("yes")) {
						System.out.println("Question " + (i+1) +", Moraad: " +  questions[i] );
						if (i+1==questions.length) {
							System.out.println(" ");
							System.out.println("This was the last question, thank you for the conversation!");
						}
						
					} else {
						System.out.println("The programm has closed.");
						break;
					}
					
				}
				
				
				
	}

}
