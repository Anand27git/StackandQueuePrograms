package com.BridgeLabz.linkedlistjava;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

	@Test
	public void given3NumbersAddedInStackShouldHaveLastAddedNode () {
		Stack stack = new Stack();
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		stack.printStack();
		INode peak = stack.peak();
		Assert.assertEquals(myThirdNode, peak);
	}

}
