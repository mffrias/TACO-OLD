package TestsPabloPauli;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class SecondAVLTreeTests extends CollectionTestBase{
	
	public void test_lookup() throws VizException {
		setConfigKeyRelevantClasses("SourcesPabloPauli.SecondAVLTree,SourcesPabloPauli.SecondAVLNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesPabloPauli.SecondAVLTree:1, SourcesPabloPauli.SecondAVLNode:6");
		setConfigKeyLoopUnroll(2);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"lookup_0", false);
	}

	public void test_insert() throws VizException {
		setConfigKeyRelevantClasses("SourcesPabloPauli.SecondAVLTree,SourcesPabloPauli.SecondAVLNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesPabloPauli.SecondAVLTree:1, SourcesPabloPauli.SecondAVLNode:6");
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
		return "SourcesPabloPauli.SecondAVLTree";
	}
}
