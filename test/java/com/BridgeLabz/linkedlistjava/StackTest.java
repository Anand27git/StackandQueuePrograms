package com.BridgeLabz.linkedlistjava;

import org.junit.Assert;
import org.junit.Test;
/******
 * 
 * @author ANAND
 *purpose:pop the elements from Stack
 *
 */
public class StackTest {

	@Test //UC-1 Push Method
	public void given3NumbersAddedInStackShouldHaveLastAddedNode() {
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
		//UC-2 Pop Method
	@Test
	public void given3NumbersPopInStackShouldHaveLastAddedNode() {
		Stack stack = new Stack();
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode pop = stack.pop();
		stack.printStack();
		Assert.assertEquals(myThirdNode, pop);

	}
}
