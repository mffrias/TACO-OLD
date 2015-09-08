package modelfield;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class TreeSetTest extends CollectionTestBase {

	@Override
	protected String getClassToCheck() {
		return "modelfields.TreeSet";
	}
	
	public void test_contains() throws VizException {
		setConfigKeyRelevantClasses("modelfields.TreeSet,modelfields.TreeSetEntry");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyUseJavaArithmetic(false);
		setConfigKeyNestedLoopUnroll(true);
		setConfigKeyInferScope(false);
		setConfigKeyUseJavaSBP(true);
		setConfigKeySkolemizeInstanceInvariant(true);
		setConfigKeySkolemizeInstanceAbstraction(true);
		setConfigKeyLoopUnroll(3);
		setConfigKeyRemoveQuantifiers(true);
		setConfigKeyGenerateUnitTestCase(true);
		setConfigKeyNoVerify(false);
		setConfigKeyTypeScopes("modelfields.TreeSet:1,modelfields.TreeSetEntry:4");
		check(GENERIC_PROPERTIES,"contains_0",false);
	}

}
