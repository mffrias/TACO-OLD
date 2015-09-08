package ar.edu.itba.santiago.bermudez;
import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class SinglyLinkedListTest extends CollectionTestBase {

	@Override
	protected String getClassToCheck() {
		return "ar.edu.itba.santiago.bermudez.SinglyLinkedListContains2Bug7Dx21D";
	}

	public void test_addTest() throws VizException {
		setConfigKeyRelevantClasses("ar.edu.itba.santiago.bermudez.SinglyLinkedListContains2Bug7Dx21D,roops.core.objects.SinglyLinkedListNode");
        setConfigKeyRelevancyAnalysis(true);
        setConfigKeyCheckNullDereference(true);
        setConfigKeyUseJavaArithmetic(true);
        setConfigKeyObjectScope(3);
        setConfigKeyInferScope(true);
        setConfigKeySkolemizeInstanceInvariant(false);
        setConfigKeySkolemizeInstanceAbstraction(false);
        setConfigKeyGenerateUnitTestCase(true);
		check(GENERIC_PROPERTIES, "contains_0", false);
	}
}