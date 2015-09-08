package roops.core.objects;

import ar.edu.taco.regresion.CollectionTestBase;
import ar.uba.dc.rfm.dynalloy.visualization.VizException;

public class StrykerNodeCachingLinkedList extends CollectionTestBase {

	@Override
	protected String getClassToCheck() {
		return "issta.nodecachinglinkedlist.NodeCachingLinkedList";
	}

	public void test_removeTest() throws VizException {
		setConfigKeyRelevantClasses("issta.nodecachinglinkedlist.NodeCachingLinkedList,issta.nodecachinglinkedlist.LinkedListNode");
		setConfigKeyRelevancyAnalysis(true);
		setConfigKeyCheckNullDereference(true);
		setConfigKeyUseJavaArithmetic(false);
		setConfigKeyInferScope(true);
		setConfigKeyObjectScope(0);
		setConfigKeyIntBithwidth(4);
        setConfigKeyLoopUnroll(4);
		setConfigKeySkolemizeInstanceInvariant(true);
		setConfigKeySkolemizeInstanceAbstraction(false);
		setConfigKeyGenerateUnitTestCase(true);
		setConfigKeyAttemptToCorrectBug(false);
		setConfigKeyMaxStrykerMethodsPerFile(1);
		setConfigKeyRemoveQuantifiers(true);
		setConfigKeyUseJavaSBP(true);
		setConfigKeyUseTightUpperBounds(true);
		setConfigKeyTypeScopes("issta.nodecachinglinkedlist.NodeCachingLinkedListRemoveBug18:1,issta.nodecachinglinkedlist.LinkedListNode:6");
		check(GENERIC_PROPERTIES,"remove_0",false);
	}
	
}
