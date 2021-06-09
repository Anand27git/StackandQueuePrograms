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
	
			// UC3 Creating simple  Queue and Inserting Value
			@Test
		    public void given3NumberWhenAddedToQueueShouldHaveFirstAddedNode() {
		        MyNode<Integer> myFirstNode = new MyNode<>(56);
		        MyNode<Integer> mySecondNode = new MyNode<>(30);
		        MyNode<Integer> myThirdNode = new MyNode<>(70);
		        Queue myQueue = new Queue();
		        myQueue.enqueue(myFirstNode);
		        myQueue.enqueue(mySecondNode);
		        myQueue.enqueue(myThirdNode);
		        INode peak = myQueue.peak();
		        myQueue.printQueue();
		        Assert.assertEquals(myFirstNode,peak);
		    }
	
			// UC4 deletion of queue in test case 
			@Test
			public void given3NumberWhenDeletedToQueueShouldHaveLastAddedNode() {
				MyNode<Integer> myFirstNode = new MyNode<>(56);
				MyNode<Integer> mySecondNode = new MyNode<>(30);
				MyNode<Integer> myThirdNode = new MyNode<>(70);
				Queue myQueue = new Queue();
				myQueue.enqueue(myFirstNode);
				myQueue.enqueue(mySecondNode);
				myQueue.enqueue(myThirdNode);
				myQueue.dequeue();
				INode peak = myQueue.peak();
				myQueue.printQueue();
				Assert.assertEquals(mySecondNode, peak);
			}
			
}
