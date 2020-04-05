
public class ContestOrganizer {
	/** the number of rows of contestant */
	public static final int NUM_ROWS = 10;
	
	/** the number of columns of contestant */
	public static final int CONTESTANTS_PER_ROW = 10;
	
	/** the two-dimensional array of contestant */
	private Contestant[][] contestants; 
	
	/** Sorts arr in increasing order by score 
	 * Postcondition:
	 * - arr sorted in increasing order by score.
	 * - Location of each contestant correctly updated such that
	 * column number matches contestant's position in arr.
	 * @param arr the array to be sorted.*/
	public void sort(Contestant[] arr){
		/* code goes here */
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i + 1].getScore() < arr[i].getScore()) {
				int temp = arr[i].getScore();
				arr[i].setScore(arr[i + 1].getScore());
				arr[i + 1].setScore(temp);
			}
			
			
		}
	}
	
	/** Sorts each row of contestants into increasing order by score.
	 * Postcondition: Contestant with highest score in row[k] is
	 * 				  in the rightmost column of row[k], 0 <= k < NUM_ROWS */
	public void sortAllRows(){
		/* code goes here */ 
	}

	/** Returns name of contestant with highest score
	 * Precondition:
	 * - Contestants have not been sorted by score.
	 * - Top score is unique
	 * - Only one contestant has the highest score.
	 * @return name of contestant with highest score. */
	public String findWinnerName(){
		/* code goes here */
		
		return "";
	}
}
