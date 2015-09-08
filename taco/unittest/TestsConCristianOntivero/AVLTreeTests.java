package TestsConCristianOntivero;

import ar.uba.dc.rfm.dynalloy.visualization.VizException;
import ar.edu.taco.regresion.CollectionTestBase;
public class AVLTreeTests extends CollectionTestBase{
	
	public void test_find() throws VizException {
		setConfigKeyRelevantClasses("SourcesCristianOntivero.AVLTree,SourcesCristianOntivero.AVLNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesCristianOntivero.AVLTree:1, SourcesCristianOntivero.AVLNode:8");
		setConfigKeyLoopUnroll(2);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"find_0", false);
	}

	public void test_insert() throws VizException {
		setConfigKeyRelevantClasses("SourcesCristianOntivero.AVLTree,SourcesCristianOntivero.AVLNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesCristianOntivero.AVLTree:1, SourcesCristianOntivero.AVLNode:4,JavaPrimitiveIntegerValue:10");
		setConfigKeyLoopUnroll(2);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"insert_0", false);
	}

	@Override
	protected String getClassToCheck() {
		return "SourcesCristianOntivero.AVLTree";
	}
}