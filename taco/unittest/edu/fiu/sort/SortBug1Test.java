package edu.fiu.sort;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.edu.taco.regresion.GenericTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class SortBug1Test extends CollectionTestBase {
	
	@Override
	protected String getClassToCheck() {
		return "edu.fiu.sort.SortBug1";
	}

	public void test_insertionSort() throws VizException {
		setConfigKeyRelevantClasses("edu.fiu.sort.SortBug1");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeyNestedLoopUnroll(true);
		setConfigKeyInferScope(false);
		setConfigKeyUseJavaSBP(true);
		setConfigKeySkolemizeInstanceInvariant(true);
		setConfigKeySkolemizeInstanceAbstraction(true);
		setConfigKeyLoopUnroll(5);
		setConfigKeyRemoveQuantifiers(true);
		setConfigKeyGenerateUnitTestCase(true);
		setConfigKeyNoVerify(false);
		setConfigKeyTypeScopes("edu.fiu.sort.SortBug1:1");
		check(GENERIC_PROPERTIES,"insertionSort_0",false);
	}

}
