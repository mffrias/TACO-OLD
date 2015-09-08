package TestsHomovoc;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class AVLTreeTest extends CollectionTestBase {
	//-XX:-UseSplitVerifier

	public AVLTreeTest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String getClassToCheck() {
		return "SourcesHomovoc.AVLTree2";
	}

	public void test_LinearSearch1() throws VizException {
		setConfigKeyRelevantClasses("SourcesHomovoc.AVLTree2, SourcesHomovoc.AVLNode2");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		 setConfigKeyTypeScopes("SourcesHomovoc.AVLTree2:1");
		 setConfigKeyTypeScopes("SourcesHomovoc.AVLNode2:4");
//		 setConfigKeyTypeScopes("fefi.Stack:4");
//		setConfigKeyTypeScopes("JavaPrimitiveIntegerValue:10");
		setConfigKeyLoopUnroll(3);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES, "delete_0", false);
	}

}
