package Puzzles;
/*
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	private ArrayList<Ship> ship = new ArrayList();
	int numGuess = 0;

	public static void main(String[] args) {
		Game game = new Game();
		game.setUp();

	}

	private void setUp() {
		//ship.add(new ship("Sub", 3));
		//ship.add(new ship("Battle Ship", 3));
		//ship.add(new ship("War Machine", 3));
		//setLocations();
		System.out
				.println("Welcome to the battleship game\nyour goal is to sink all of the ships as fast as possible\nGood Luck");
		play();
	}

	public void play() {

		String guess, result;
		Scanner input = new Scanner(System.in);
		while (!ship.isEmpty()) {

			result = "miss";
			numGuess++;
			System.out.println("Enter a guess");
			guess = input.nextLine();
			guess = guess.toUpperCase();
			for (int i = 0; i < ship.size(); i++) {

				result = ship.get(i).check(guess);
				if (result.equals("kill")) {
					result = "you sunk " + ship.get(i).getName();
					ship.remove(i);
					break;
				} else if (result.equals("hit")) {
					break;
				}
			}
			System.out.println(result);

		}
		input.close();
		finish();
	}

	private void finish() {

		if (numGuess == 9)
			System.out.println("congratulations you got a perfect score");
		else if (numGuess < 20)
			System.out.println("congratulations you did great. It took you "
					+ numGuess + " guesses.");
		else if (numGuess < 30)
			System.out.println("you did so so It took you " + numGuess
					+ " guesses.");

		else

			System.out.println("you suck. It took you " + numGuess
					+ " guesses.");
	}

	private void setLocation() {

		Random rand = new Random();
		ArrayList<String> locationSet = new ArrayList<String>();
		ArrayList<String> temp = null;
		int let, num, incl, incn;

		String alpha = "ABCDEFGHIJKL";
		boolean worked;
		for (int i = 0; i < ship.size(); i++) {
		//	worked = "false";
			//start: while (!worked) {
		//		locationToSet.clear();
				worked = true;
				let = rand.nextInt(5);
				num = 1 + rand.nextInt(5);
				if (num % 2 == 0) {
					incl = 1;
					incn = 0;
				}
				else
					incl=0;
				incn=1;
				
			}
//for(int j=0;j<ship.get(i).getSize();j++){
	String loc = "" + alpha.charAt(let)+num;
	let+=incl;
	num+=incn;
	
	for(int t=0;t<ship.size();t++)
	{
//		if(t!=i)
			temp = ship.get(t).getLocation();
		if(temp.contains(loc)){
			worked = false;
			continue start;
		}
	}
}
//locationToSet.add(loc);
		}
//ship.get(i).setLocation(locationToSet);
	
*/

