package com.lisz.iterator;

public class LinkedList<E> implements Collection<E> {
	private Node<E> head;
	private Node<E> tail;
	private Node<E> cur;
	private int size = 0;
	private Iterator<E> iterator = new LinkedListIterator<>();
	
	public void add(E e) {
		if (head == null && tail == null) {
			head = tail = cur = new Node<E>(e);
		} else {
			tail.next = new Node<E>(e);
			tail = tail.next;
		}
		size ++;
	}
	
	public E get(int i) {
		if (i >= size || i < 0) {
			throw new IndexOutOfBoundsException("Index " + i + " is out of bound!");
		}
		Node<E> cur = head;
		for (int j = 0; j < i; j++) {
			cur = cur.next;
		}
		return cur.data;
	}
	
	public int size() {
		return size;
	}
	
	private static class Node<E> {
		E data;
		Node<E> next;
		public Node(E data) {
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		Collection<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@Override
	public Iterator<E> iterator() {
		return iterator;
	}
	
	private class LinkedListIterator<E> implements Iterator<E> {
		@Override
		public boolean hasNext() {
			return cur != null;
		}

		@Override
		public E next() {
			E ret = (E)cur.data;
			cur = cur.next;
			return ret;
		}
		
	}
}
