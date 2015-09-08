package ie.koa;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;
import ar.edu.taco.regresion.GenericTestBase;

public class BallotTest extends CollectionTestBase {

	
	public BallotTest() {
		// TODO Auto-generated constructor stub
	}


	@Override
	protected String getClassToCheck() {
		return "ie.koa.Ballot";
	}

	
	public void test_ballotConstructorTest() throws VizException {
		setConfigKeyRelevantClasses("ie.koa.Ballot");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeyInferScope(true);
		setConfigKeyObjectScope(0);
		setConfigKeyIntBithwidth(4);
        setConfigKeyLoopUnroll(3);
		setConfigKeySkolemizeInstanceInvariant(true);
		setConfigKeySkolemizeInstanceAbstraction(true);
		setConfigKeyGenerateUnitTestCase(true);
		setConfigKeyAttemptToCorrectBug(false);
		setConfigKeyMaxStrykerMethodsPerFile(50);
		setConfigKeyRemoveQuantifiers(true);
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		setConfigKeyTypeScopes("ie.koa.Ballot:5");
		check(GENERIC_PROPERTIES,"Ballot_0",false);
	}
	
	


}
