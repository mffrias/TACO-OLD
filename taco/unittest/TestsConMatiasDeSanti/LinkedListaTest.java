package TestsConMatiasDeSanti;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class LinkedListaTest extends CollectionTestBase {
	
	public LinkedListaTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void test_Search() throws VizException {
		setConfigKeyRelevantClasses("SourcesMatiasDeSanti.LinkedList, SourcesMatiasDeSanti.Node");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesMatiasDeSanti.LinkedList:1, SourcesMatiasDeSanti.Node:5, JavaPrimitiveIntegerValue:10");
		setConfigKeyLoopUnroll(3);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"add_0", false);
	}

	@Override
	protected String getClassToCheck() {
		return "SourcesMatiasDeSanti.LinkedList";
	}

}
