package Puzzles;

public class SimpleShip {

	private int[] location;
	private int numOfHits;

	public void setLocations(int[] loc) {
		location = loc;
	}

	public String checkGuess(String userGuess) {
		String result = "miss";
		int guess = Integer.parseInt(userGuess);
		for (int loc : location) {
			if (guess == loc) {

				numOfHits++;
				result = numOfHits == location.length ? "kill" : "hit";
				break;
			}
		}
		System.out.println(result);
		return result;
	}

}
