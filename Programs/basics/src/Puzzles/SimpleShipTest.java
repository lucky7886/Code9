package Puzzles;


import java.util.Random;
import java.util.Scanner;

public class SimpleShipTest {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		SimpleShip ship = new SimpleShip();
		int temp = rand.nextInt(5) + 1;
		String userGuess;
		int numOfGuess = 0;
		boolean isAlive = true;
		int[] locations = { temp, ++temp, ++temp };

		ship.setLocations(locations);

		while (isAlive) {
			String result;
			System.out.println("Enter a guess");
			userGuess = input.nextLine();
			result = ship.checkGuess(userGuess);
			numOfGuess++;
			if (result.equals("kill"))
				isAlive = false;
		}
		System.out.println("You took " + numOfGuess
				+ " guesses to sink the ship.");
	}
}
