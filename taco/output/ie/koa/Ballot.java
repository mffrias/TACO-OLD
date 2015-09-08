package ie.koa;

//@ model import org.jmlspecs.lang.*;

/** The Ballot class represents a ballot paper in an Irish election,
 which uses the Proportional Representation Single Transfer Vote.
 (PRSTV) system.
 
 @see <a href="http://www.cev.ie/htm/tenders/pdf/1_2.pdf">
 Department of Environment and Local Government, 
 Count Requirements and Commentary on Count Rules,
 section 3-14</a>
*/
public class Ballot extends java.lang.Object {

  public static int MAX_POSSIBLE_BALLOTS = 150000;
  public static long NONTRANSFERABLE = 0L;
  public long ie_koa_Ballot_ballotID;
  public long ie_koa_Ballot_candidateID;
  public int[] ie_koa_Ballot_preferenceList;
  public int ie_koa_Ballot_numberOfPreferences;
  public int ie_koa_Ballot_positionInList;
  public static int MAXIMUM_ROUNDS_OF_COUNTING = 50;
  public int[] ie_koa_Ballot_candidateIDAtCount;
  public int ie_koa_Ballot_countNumberAtLastTransfer;
  public int ie_koa_Ballot_randomNumber;
  public static int uniqueID = 0;
  public int ie_koa_Ballot_SystemcurrentTimeMillis;
  /*@ invariant (this.ie_koa_Ballot_ballotID  ==  0L)  |  (0L  <  this.ie_koa_Ballot_ballotID);
    @*/
  /*@ invariant (\forall ie.koa.Ballot a, b; a  !=  null && b  !=  null && 0L  <  a.ie_koa_Ballot_ballotID && 0L  <  b.ie_koa_Ballot_ballotID; a.ie_koa_Ballot_ballotID  ==  b.ie_koa_Ballot_ballotID <==> a  ==  b);
    @*/
  /*@ invariant (0L  <  this.ie_koa_Ballot_candidateID) || (this.ie_koa_Ballot_candidateID  ==  ie.koa.Ballot.NONTRANSFERABLE);
    @*/
  /*@ invariant (0  <=  this.ie_koa_Ballot_positionInList && this.ie_koa_Ballot_positionInList  <  this.ie_koa_Ballot_numberOfPreferences) ==> this.ie_koa_Ballot_candidateID  ==  ((long)(((int)this.ie_koa_Ballot_preferenceList[this.ie_koa_Ballot_positionInList])));
    @*/
  /*@ invariant (this.ie_koa_Ballot_positionInList  ==  this.ie_koa_Ballot_numberOfPreferences) ==> this.ie_koa_Ballot_candidateID  ==  ie.koa.Ballot.NONTRANSFERABLE;
    @*/
  /*@ invariant (\forall int i; 0  <=  i && i  <  this.ie_koa_Ballot_numberOfPreferences; ((int)this.ie_koa_Ballot_preferenceList[i])  >  0 && ((long)(((int)this.ie_koa_Ballot_preferenceList[i])))  !=  ie.koa.Ballot.NONTRANSFERABLE);
    @*/
  /*@ invariant (\forall int i, j; 0  <  i && i  <  this.ie_koa_Ballot_numberOfPreferences && 0  <=  j && j  <  i; ((int)this.ie_koa_Ballot_preferenceList[i])  !=  ((int)this.ie_koa_Ballot_preferenceList[j]));
    @*/
  /*@ invariant this.ie_koa_Ballot_preferenceList.length  ==  this.ie_koa_Ballot_numberOfPreferences;
    @*/
  /*@ invariant (0  ==  this.ie_koa_Ballot_numberOfPreferences)  |  (0  <  this.ie_koa_Ballot_numberOfPreferences);
    @*/
  /*@ invariant 0  <=  this.ie_koa_Ballot_positionInList;
    @*/
  /*@ invariant this.ie_koa_Ballot_positionInList  <=  this.ie_koa_Ballot_numberOfPreferences;
    @*/
  /*@ invariant this.ie_koa_Ballot_candidateIDAtCount.length  ==  ie.koa.Ballot.MAXIMUM_ROUNDS_OF_COUNTING;
    @*/
  /*@ invariant 0  <=  this.ie_koa_Ballot_countNumberAtLastTransfer;
    @*/
  /*@ invariant this.ie_koa_Ballot_countNumberAtLastTransfer  <  ie.koa.Ballot.MAXIMUM_ROUNDS_OF_COUNTING;
    @*/
  /*@ invariant (\forall ie.koa.Ballot a, b; a  !=  null && b  !=  null; (a.ie_koa_Ballot_randomNumber  ==  b.ie_koa_Ballot_randomNumber) <==> (a  ==  b));
    @*/
  /*@ constraint \old(this.ie_koa_Ballot_positionInList)  <=  this.ie_koa_Ballot_positionInList;
    @*/
  /*@ constraint this.ie_koa_Ballot_randomNumber  ==  \old(this.ie_koa_Ballot_randomNumber);
    @*/

  /*@ 
    @ ensures this.ie_koa_Ballot_numberOfPreferences  ==  0;
    @ ensures this.ie_koa_Ballot_countNumberAtLastTransfer  ==  0;
    @ ensures this.ie_koa_Ballot_positionInList  ==  0;
    @ ensures this.ie_koa_Ballot_candidateID  ==  ie.koa.Ballot.NONTRANSFERABLE;
    @ ensures this.ie_koa_Ballot_ballotID  ==  0L;
    @*/
  public /*@ pure @*/ Ballot() {
    int[] t_1;
    int[] t_2;

    this.ie_koa_Ballot_ballotID = (byte)0;
    this.ie_koa_Ballot_candidateID = (byte)0;
    t_1 = new int[0];
    this.ie_koa_Ballot_preferenceList = t_1;
    this.ie_koa_Ballot_numberOfPreferences = (byte)0;
    this.ie_koa_Ballot_positionInList = (byte)0;
    t_2 = new int[ie.koa.Ballot.MAXIMUM_ROUNDS_OF_COUNTING];
    this.ie_koa_Ballot_candidateIDAtCount = t_2;
    this.ie_koa_Ballot_countNumberAtLastTransfer = (byte)0;
    this.ie_koa_Ballot_randomNumber = (byte)0;
    this.ie_koa_Ballot_SystemcurrentTimeMillis = 1;
    {
      int t_3;

      this.ie_koa_Ballot_numberOfPreferences = 0;
      this.ie_koa_Ballot_countNumberAtLastTransfer = 0;
      this.ie_koa_Ballot_positionInList = 0;
      this.ie_koa_Ballot_candidateID = ie.koa.Ballot.NONTRANSFERABLE;
      this.ie_koa_Ballot_ballotID = 0L;
      t_3 = this.getUniqueNumber();
      this.ie_koa_Ballot_randomNumber = t_3;
    }
  }


  /*@ 
    @ ensures \result  >=  0;
    @*/
  public int getUniqueNumber() {
    {
      int t_4;
      int t_5;
      int t_6;
      boolean t_7;

      t_4 = ie.koa.Ballot.uniqueID;
      t_5 = this.ie_koa_Ballot_SystemcurrentTimeMillis * t_4;
      t_6 = t_5 % ie.koa.Ballot.MAX_POSSIBLE_BALLOTS;
      ie.koa.Ballot.uniqueID = ie.koa.Ballot.uniqueID + (byte)1;
      int var_1_num = t_6;

      t_7 = var_1_num  >  0;
      if (t_7) {
        {
          {
            {
              {
                {
                  return var_1_num;
                }
              }
            }
          }
        }
      }

      return 0;
    }
  }

}
