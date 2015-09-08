package TestsEstebanPintos;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;
//-XX:-UseSplitVerifier
public class AVLSymbolTableTest extends CollectionTestBase {

	public AVLSymbolTableTest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String getClassToCheck() {
		return "SourcesEstebanPintos.AVLSymbolTable";
	}

	public void test_AVLTreeTest1() throws VizException {
		setConfigKeyRelevantClasses("SourcesEstebanPintos.AVLSymbolTable, SourcesEstebanPintos.AVLStack2, SourcesEstebanPintos.Node");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesEstebanPintos.AVLSymbolTable:1, SourcesEstebanPintos.AVLStack2:3, SourcesEstebanPintos.Node:4");
		setConfigKeyLoopUnroll(3);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES, "insert_0", false);
	}
	
	public void test_AVLTreeTest2() throws VizException {
		setConfigKeyRelevantClasses("SourcesEstebanPintos.AVLSymbolTable, SourcesEstebanPintos.AVLStack2, SourcesEstebanPintos.Node");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesEstebanPintos.AVLSymbolTable:1, SourcesEstebanPintos.AVLStack2:1, SourcesEstebanPintos.Node:4");
		setConfigKeyLoopUnroll(3);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES, "search_0", false);
	}
	
	
}


