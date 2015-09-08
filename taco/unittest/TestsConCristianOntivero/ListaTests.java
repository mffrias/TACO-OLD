package TestsConCristianOntivero;

import ar.uba.dc.rfm.dynalloy.visualization.VizException;
import ar.edu.taco.regresion.CollectionTestBase;
public class ListaTests extends CollectionTestBase{
	
	public void test_AgregarNodo() throws VizException {
		setConfigKeyRelevantClasses("SourcesCristianOntivero.Lista,SourcesCristianOntivero.Nodo");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesCristianOntivero.Lista:1, SourcesCristianOntivero.Nodo:6");
		setConfigKeyLoopUnroll(2);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"AgregarNodo_0", false);
	}

	public void test_EliminarNodo() throws VizException {
		setConfigKeyRelevantClasses("SourcesCristianOntivero.Lista,SourcesCristianOntivero.Nodo");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesCristianOntivero.Lista:1, SourcesCristianOntivero.Nodo:6");
		setConfigKeyLoopUnroll(2);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"EliminarNodo_0", false);
	}

	public void test_Existe() throws VizException {
		setConfigKeyRelevantClasses("SourcesCristianOntivero.Lista,SourcesCristianOntivero.Nodo");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyCheckArithmeticException(false);
		setConfigKeyUseJavaArithmetic(true);
		setConfigKeySkolemizeInstanceInvariant(false);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyRemoveQuantifiers(true);
		// Infer-Scope
		setConfigKeyInferScope(true);
		setConfigKeyTypeScopes("SourcesCristianOntivero.Lista:1, SourcesCristianOntivero.Nodo:6");
		setConfigKeyLoopUnroll(2);
		// SBP+BOUND
		setConfigKeyUseJavaSBP(false);
		setConfigKeyUseTightUpperBounds(false);
		// JUNIT
		setConfigKeyGenerateUnitTestCase(true);

		check(GENERIC_PROPERTIES,"Existe_0", false);
	}

	@Override
	protected String getClassToCheck() {
		return "SourcesCristianOntivero.Lista";
	}
}