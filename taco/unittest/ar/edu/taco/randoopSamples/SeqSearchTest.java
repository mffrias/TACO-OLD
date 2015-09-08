package ar.edu.taco.randoopSamples;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class SeqSearchTest extends CollectionTestBase {

		public SeqSearchTest() {
			// TODO Auto-generated constructor stub
		}

		@Override
		protected String getClassToCheck() {
			return "ar.edu.taco.randoopSamples.SeqSearch";
		}

		public void testSeqSearch() throws VizException {
			setConfigKeyRelevantClasses("ar.edu.taco.randoopSamples.SeqSearch");
			setConfigKeyRelevancyAnalysis(true);
			setConfigKeyCheckNullDereference(true);
			setConfigKeyCheckArithmeticException(false);
			setConfigKeyUseJavaArithmetic(true);
			setConfigKeySkolemizeInstanceInvariant(false);
			setConfigKeySkolemizeInstanceAbstraction(false);
			setConfigKeyRemoveQuantifiers(true);
			// Infer-Scope
			setConfigKeyInferScope(true);
			setConfigKeyTypeScopes("ar.edu.taco.randoopSamples.SeqSearch:1");
			setConfigKeyLoopUnroll(5);
			// SBP+BOUND
			setConfigKeyUseJavaSBP(false);
			setConfigKeyUseTightUpperBounds(false);
			// JUNIT
			setConfigKeyGenerateUnitTestCase(true);

			check(GENERIC_PROPERTIES, "seqSearch_0", false);
		}
}
