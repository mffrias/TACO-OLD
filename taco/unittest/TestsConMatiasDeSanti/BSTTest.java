package TestsConMatiasDeSanti;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class BSTTest extends CollectionTestBase {
	
	public BSTTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected String getClassToCheck() {
		return "SourcesMatiasDeSanti.BST";
	}
	
	public void test_insert() throws VizException {
		setConfigKeyRelevantClasses("SourcesMatiasDeSanti.BST, SourcesMatiasDeSanti.BSTNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesMatiasDeSanti.BST:1, SourcesMatiasDeSanti.BSTNode:4, JavaPrimitiveIntegerValue:10");
		setConfigKeyLoopUnroll(3);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"insert_0", false);
	}
	
	public void test_search() throws VizException {
		setConfigKeyRelevantClasses("SourcesMatiasDeSanti.BST, SourcesMatiasDeSanti.BSTNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesMatiasDeSanti.BST:1, SourcesMatiasDeSanti.BSTNode:3, JavaPrimitiveIntegerValue:10");
		setConfigKeyLoopUnroll(2);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"search_0", false);
	}

	public void test_deleteByCopying() throws VizException {
		setConfigKeyRelevantClasses("SourcesMatiasDeSanti.BST, SourcesMatiasDeSanti.BSTNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesMatiasDeSanti.BST:1, SourcesMatiasDeSanti.BSTNode:3, JavaPrimitiveIntegerValue:5");
		setConfigKeyLoopUnroll(2);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"deleteByCopying_0", false);
	}
}
