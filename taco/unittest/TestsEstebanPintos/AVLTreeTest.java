package TestsEstebanPintos;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;
//-XX:-UseSplitVerifier
public class AVLTreeTest extends CollectionTestBase {

	public AVLTreeTest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String getClassToCheck() {
		return "SourcesEstebanPintos.AVLTree";
	}

	public void test_AVLTreeTest1() throws VizException {
		setConfigKeyRelevantClasses("SourcesEstebanPintos.AVLTree, SourcesEstebanPintos.AVLStack, SourcesEstebanPintos.AVLNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesEstebanPintos.AVLTree:1, SourcesEstebanPintos.AVLStack:1, SourcesEstebanPintos:4");
		setConfigKeyLoopUnroll(3);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES, "insert_0", false);
	}
	
	public void test_AVLTreeTest2() throws VizException {
		setConfigKeyRelevantClasses("SourcesEstebanPintos.AVLTree, SourcesEstebanPintos.AVLStack, SourcesEstebanPintos.AVLNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesEstebanPintos.AVLTree:1, SourcesEstebanPintos.AVLStack:1, SourcesEstebanPintos.AVLNode:4");
		setConfigKeyLoopUnroll(3);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES, "find_0", false);
	}
	
	
}


