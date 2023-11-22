package core;

import org.junit.jupiter.api.Assertions;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {

	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0,size);
		boolean empty = s1.isEmpty();
		assertTrue(empty);
	}
	public void testPushElmToStack() {
		Stack s2 = new Stack();
		s2.push(1);
		int size = s2.getSize();		
		
		assertEquals(1, size);
		boolean empty = s2.isEmpty();
		assertFalse(empty);
		
	}
	public void testLastInFirstOut() {
		
	}
}
