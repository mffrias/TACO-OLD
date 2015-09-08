package roops.core.objects;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class AvlTreeTest extends CollectionTestBase {

		@Override
		protected String getClassToCheck() {
			return "roops.core.objects.AvlTree";
		}
		
		public void test_findMinTest() throws VizException {
			setConfigKeyRelevantClasses("roops.core.objects.AvlTree,roops.core.objects.AvlNode");
			setConfigKeyRelevancyAnalysis(true);
			setConfigKeyCheckNullDereference(true);
			setConfigKeyUseJavaArithmetic(true);
			setConfigKeyObjectScope(3);
			setConfigKeyInferScope(true);
			setConfigKeySkolemizeInstanceInvariant(false);
			setConfigKeySkolemizeInstanceAbstraction(false);
			setConfigKeyGenerateUnitTestCase(true);
			setConfigKeyUseJavaSBP(true);
			setConfigKeyUseTightUpperBounds(true);
			setConfigKeyTypeScopes("roops.core.objects.AvlTree:1,roops.core.objects.AvlNode:5");
			check(GENERIC_PROPERTIES,"findMin_0", false);
		}
	
		public void test_insertTest() throws VizException {
			setConfigKeyRelevantClasses("roops.core.objects.AvlTree,roops.core.objects.AvlNode");
			setConfigKeyRelevancyAnalysis(true);
			setConfigKeyCheckNullDereference(true);
			setConfigKeyUseJavaArithmetic(true);
			setConfigKeyObjectScope(3);
			setConfigKeyInferScope(true);
			setConfigKeySkolemizeInstanceInvariant(false);
			setConfigKeySkolemizeInstanceAbstraction(false);
			setConfigKeyGenerateUnitTestCase(true);
			setConfigKeyUseJavaSBP(true);
			setConfigKeyLoopUnroll(1);
			setConfigKeyUseTightUpperBounds(true);
			setConfigKeyTypeScopes("roops.core.objects.AvlTree:1,roops.core.objects.AvlNode:5");
			check(GENERIC_PROPERTIES,"insert_0", false);
		}

		public void test_factorialTest() throws VizException {
			setConfigKeyRelevantClasses("roops.core.objects.AvlTree,roops.core.objects.AvlNode");
			setConfigKeyRelevancyAnalysis(true);
			setConfigKeyCheckNullDereference(true);
			setConfigKeyUseJavaArithmetic(true);
			setConfigKeyObjectScope(3);
			setConfigKeyInferScope(true);
			setConfigKeySkolemizeInstanceInvariant(false);
			setConfigKeySkolemizeInstanceAbstraction(false);
			setConfigKeyGenerateUnitTestCase(true);
			setConfigKeyUseJavaSBP(true);
			setConfigKeyUseTightUpperBounds(true);
			setConfigKeyTypeScopes("roops.core.objects.AvlTree:1,roops.core.objects.AvlNode:5");
			check(GENERIC_PROPERTIES,"factorial_0", false);
		}
		
		
		public void test_fiboTest() throws VizException {
			setConfigKeyRelevantClasses("roops.core.objects.AvlTree,roops.core.objects.AvlNode");
			setConfigKeyRelevancyAnalysis(true);
			setConfigKeyCheckNullDereference(true);
			setConfigKeyUseJavaArithmetic(true);
			setConfigKeyObjectScope(3);
			setConfigKeyInferScope(true);
			setConfigKeySkolemizeInstanceInvariant(false);
			setConfigKeySkolemizeInstanceAbstraction(false);
			setConfigKeyGenerateUnitTestCase(true);
			setConfigKeyUseJavaSBP(true);
			setConfigKeyUseTightUpperBounds(true);
			setConfigKeyTypeScopes("roops.core.objects.AvlTree:1,roops.core.objects.AvlNode:5");
			check(GENERIC_PROPERTIES,"fibo_0", false);
		}
}