package TestsPauli;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class ListLinkedTests extends CollectionTestBase {

	public void test_add() throws VizException {
		setConfigKeyRelevantClasses("SourcesPauli.ListLinked,SourcesPauli.LinkNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesPauli.ListLinked:1,SourcesPauli.LinkNode:6 ");
		setConfigKeyLoopUnroll(4);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"add_0", false);
	}
	
	public void test_remove() throws VizException {
		setConfigKeyRelevantClasses("SourcesPauli.ListLinked,SourcesPauli.LinkNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesPauli.ListLinked:1,SourcesPauli.LinkNode:5 ");
		setConfigKeyLoopUnroll(5);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"remove_0", false);
	}
	
	@Override
	protected String getClassToCheck() {
		return "SourcesPauli.ListLinked";
	}

}
