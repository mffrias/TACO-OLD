package TestsPauli;

import ar.uba.dc.rfm.dynalloy.visualization.VizException;
import ar.edu.taco.regresion.CollectionTestBase;
public class BinarySearchTreeTests extends CollectionTestBase{
	
	public void test_contains() throws VizException {
		setConfigKeyRelevantClasses("SourcesPauli.BinarySearchTree,SourcesPauli.BSTNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesPauli.BinarySearchTree:1, SourcesPauli.BSTNode:6");
		setConfigKeyLoopUnroll(2);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"contains_0", false);
	}

	public void test_add() throws VizException {
		setConfigKeyRelevantClasses("SourcesPauli.BinarySearchTree,SourcesPauli.BSTNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesPauli.BinarySearchTree:1, SourcesPauli.BSTNode:6");
		setConfigKeyLoopUnroll(2);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"add_0", false);
	}

	@Override
	protected String getClassToCheck() {
		return "SourcesPauli.BinarySearchTree";
	}
}
