package com.BridgeLabz.linkedlistjava;

public class MyNode<K> implements INode<K> {

	// defining variable
	private K key;
	private INode<K> next;

	// constructor of MyNode Class
	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	// getter & Setter method
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode<K> next) {
		this.next = next;
	}
}