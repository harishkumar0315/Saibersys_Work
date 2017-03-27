package javaCoding;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	
	public static void main(String[] args) {
		
		
		
		Random guess = new Random();
		Scanner input = new Scanner(System.in);
		
		
		int numoftries = 0;
		numoftries++;
		boolean to = false;
		
		while(to == false){
			
			int towin =guess.nextInt(20);
			
			int choice = input.nextInt();
			
		
		if(towin == choice){
			
			to=true;
			
			System.out.println("You Won");
			
			
		}
		else{
			System.out.println("POOR GUESS");
			System.out.println("choose another");

		}
		
		
		
		
		
	}
	}

}
