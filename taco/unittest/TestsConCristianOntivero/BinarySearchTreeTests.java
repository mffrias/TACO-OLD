package TestsConCristianOntivero;

import ar.uba.dc.rfm.dynalloy.visualization.VizException;
import ar.edu.taco.regresion.CollectionTestBase;
public class BinarySearchTreeTests extends CollectionTestBase{
	
	public void test_contains() throws VizException {
		setConfigKeyRelevantClasses("SourcesCristianOntivero.BinarySearchTree,SourcesCristianOntivero.BSTNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesCristianOntivero.BinarySearchTree:1, SourcesCristianOntivero.BSTNode:6");
		setConfigKeyLoopUnroll(2);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"contains_0", false);
	}

	public void test_insert() throws VizException {
		setConfigKeyRelevantClasses("SourcesCristianOntivero.BinarySearchTree,SourcesCristianOntivero.BSTNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesCristianOntivero.BinarySearchTree:1, SourcesCristianOntivero.BSTNode:4");
		setConfigKeyLoopUnroll(4);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"insert_0", false);
	}
	
	public void test_delete() throws VizException {
		setConfigKeyRelevantClasses("SourcesCristianOntivero.BinarySearchTree,SourcesCristianOntivero.BSTNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesCristianOntivero.BinarySearchTree:1, SourcesCristianOntivero.BSTNode:4");
		setConfigKeyLoopUnroll(1);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"delete_0", false);
	}

	@Override
	protected String getClassToCheck() {
		return "SourcesCristianOntivero.BinarySearchTree";
	}
}
