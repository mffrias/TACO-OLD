package TestsEstebanPintos;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;
//-XX:-UseSplitVerifier
public class AVLTree2Test extends CollectionTestBase {

	public AVLTree2Test() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String getClassToCheck() {
		return "SourcesEstebanPintos.AVLTree2";
	}

	public void test_AVLTree2Test1() throws VizException {
		setConfigKeyRelevantClasses("SourcesEstebanPintos.AVLTree2, SourcesEstebanPintos.AVLNode2");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesEstebanPintos.AVLTree2:1, SourcesEstebanPintos.AVLNode2:6");
		setConfigKeyLoopUnroll(3);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES, "lookup_0", false);
	}
	
	public void test_AVLTree2Test2() throws VizException {
		setConfigKeyRelevantClasses("SourcesEstebanPintos.AVLTree2, SourcesEstebanPintos.AVLNode2");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesEstebanPintos.AVLTree2:1, SourcesEstebanPintos.AVLNode2:4");
		setConfigKeyLoopUnroll(3);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES, "insert_0", false);
	}
	
	public void test_AVLTree2Test3() throws VizException {
		setConfigKeyRelevantClasses("SourcesEstebanPintos.AVLTree2, SourcesEstebanPintos.AVLNode2");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesEstebanPintos.AVLTree2:1, SourcesEstebanPintos.AVLNode2:4");
		setConfigKeyLoopUnroll(3);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES, "delete_0", false);
	}
	
	
}


