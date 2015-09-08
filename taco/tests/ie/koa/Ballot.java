package ie.koa;

/**
 * The Ballot class represents a ballot paper in an Irish election,
 * which uses the Proportional Representation Single Transfer Vote.
 * (PRSTV) system.
 * 
 * @see <a href="http://www.cev.ie/htm/tenders/pdf/1_2.pdf">
 * Department of Environment and Local Government, 
 * Count Requirements and Commentary on Count Rules,
 * section 3-14</a>
 */

// refine "Ballot.spec";
public class Ballot {
	public static int MAX_POSSIBLE_BALLOTS = 150000;

	/**
	 * Candidate ID value to use for nontransferable ballot papers
	 * 
	 * @design A special candidate ID value is used to indicate
	 * non-transferable votes i.e., when the list of preferences has
	 * been exhausted and none of the continuing candidates are in the preference list, 
	 * the ballot is deemed to be non-transferable
	 * 
	 * @see <a href="http://www.cev.ie/htm/tenders/pdf/1_2.pdf">
	 * Department Of Environment and Local Government,
	 * Count requirements and Commentaryan Count Rules,
	 * section 7, pages 23-27</a>
	 */
	public static long NONTRANSFERABLE = 0;

	/** Ballot ID number */
	//@ invariant (ballotID == 0) | (0 < ballotID);
	/*@ invariant (\forall Ballot a,b;
    @                                    a != null && b != null && 0 < a.ballotID && 0 < b.ballotID;
    @                                    a.ballotID == b.ballotID <==> a==b);
    @*/
	public long ballotID;

	/** Candidate ID to which this ballot is assigned */
  /*@ invariant (0 < candidateID) ||
    @  (candidateID == NONTRANSFERABLE);
    @ invariant (0 <= positionInList &&
    @   positionInList < numberOfPreferences) ==>
    @   candidateID == preferenceList[positionInList];
    @ public invariant ( positionInList == numberOfPreferences) ==>
    @   candidateID == NONTRANSFERABLE;
    @*/
	public long candidateID;

	/** Preference list of candidate IDs */	
  /*@  invariant (\forall int i;
    @   0 <= i && i < numberOfPreferences;
    @   preferenceList[i] > 0 &&
    @   preferenceList[i] != NONTRANSFERABLE);
    @  invariant (\forall int i,j;
    @   0 < i && i < numberOfPreferences && 0 <= j && j < i;
    @   preferenceList[i] != preferenceList[j]);
    @*/

	//@ invariant preferenceList.length == numberOfPreferences;

	public int[] preferenceList = new int [0];

	/** Total number of valid preferences on this ballot paper */
	//@  invariant (0 == numberOfPreferences) | (0 < numberOfPreferences);
	public int numberOfPreferences;

	/** Position within preference list */
	//@ public initially positionInList == 0;
	//@ public invariant 0 <= positionInList;
	//@ public invariant positionInList <= numberOfPreferences;
	//@ public constraint \old(positionInList) <= positionInList;
	public int positionInList;

	/** Maximum possible numbers of counting rounds*/
	// @design Patrick must justify the length of this array.
	public static int MAXIMUM_ROUNDS_OF_COUNTING = 50;

	/** Candidate ID to which the vote is assigned at the end of each count */
	//@ public invariant candidateIDAtCount.length == MAXIMUM_ROUNDS_OF_COUNTING;	
	public int[] candidateIDAtCount = new int [MAXIMUM_ROUNDS_OF_COUNTING];


	/** Last count number in which this ballot was transferred */
	//@ public invariant 0 <= countNumberAtLastTransfer;
	//@ public invariant countNumberAtLastTransfer < MAXIMUM_ROUNDS_OF_COUNTING;
	//@ public initially countNumberAtLastTransfer == 0;
	public int countNumberAtLastTransfer;

	/** Random number used for proportional distribution of surplus votes */
	/*@ public invariant (\forall Ballot a,b; a != null && b != null;
    @   (a.randomNumber == b.randomNumber) <==> (a == b));
    @ public constraint randomNumber == \old (randomNumber);
    @*/
	public int randomNumber;

	/** 
	 * Default constructor
	 */
  /*@ 
    @   ensures numberOfPreferences == 0;
    @   ensures countNumberAtLastTransfer == 0;
    @   ensures positionInList == 0;
    @   ensures candidateID == NONTRANSFERABLE; 
    @   ensures ballotID == 0;
    @*/
	public /*@ pure @*/ Ballot() {

		numberOfPreferences = 0;
		countNumberAtLastTransfer = 0;
		positionInList = 0;
		candidateID = NONTRANSFERABLE; 
		ballotID = 0;
		randomNumber = getUniqueNumber(); 
	}


	public static int uniqueID = 0;

	public int SystemcurrentTimeMillis = 1;
	
  /*@
  	@ ensures \result >= 0;
    @*/	
	public int getUniqueNumber() {
		int num = (SystemcurrentTimeMillis * uniqueID++) % MAX_POSSIBLE_BALLOTS;
		if(num>0){
			return num;
		}
		return 0;
	}

}