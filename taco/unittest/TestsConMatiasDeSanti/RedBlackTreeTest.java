package TestsConMatiasDeSanti;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class RedBlackTreeTest extends CollectionTestBase {
	
	public RedBlackTreeTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void test_Add() throws VizException {
		setConfigKeyRelevantClasses("SourcesMatiasDeSanti.StrykerException, SourcesMatiasDeSanti.RedBlackTree, SourcesMatiasDeSanti.RedBlackNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		setConfigKeyNumericTypeQuantificationRange(0, 6);
		// Infer-Scope
		setConfigKeyInferScope(false);
		setConfigKeyTypeScopes("SourcesMatiasDeSanti.RedBlackTree:1, SourcesMatiasDeSanti.RedBlackNode:5");
		setConfigKeyLoopUnroll(3);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"add_0",false);
	}

	@Override
	protected String getClassToCheck() {
		return "SourcesMatiasDeSanti.RedBlackTree";
	}

}
