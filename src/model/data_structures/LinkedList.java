package model.data_structures;

import java.util.Iterator;

import model.logic.MovingViolationsManager;
import model.vo.VOMovingViolations;

public class LinkedList<T> implements ILinkedList<T> {

	/**
	 * Esta implementación de las listas encadenadas se obtuvo de crunchify
	 * Enlace: https://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/
	 */
	private static int tamano;
	private Node head;
 
	// Default constructor
	public LinkedList() {
 
	}
 
	// appends the specified element to the end of this list.
	public void add(T data ) {
 
		// Initialize Node only incase of 1st element
		if (head == null) {
			head = new Node(data);
		}
 
		Node crunchifyTemp = new Node(data);
		Node crunchifyCurrent = head;
 
		// Let's check for NPE before iterate over crunchifyCurrent
		if (crunchifyCurrent != null) {
 
			// starting at the head node, crawl to the end of the list and then add element after last node
			while (crunchifyCurrent.getSiguiente() != null) {
				crunchifyCurrent = crunchifyCurrent.getSiguiente();
			}
 
			// the last node's "next" reference set to our new node
			crunchifyCurrent.setSiguiente(crunchifyTemp);
		}
 
		// increment the number of elements variable
		incrementCounter();
	}
 
	public int getCounter() {
		return tamano;
	}
 
	private static void incrementCounter() {
		tamano++;
	}
 
	private void decrementCounter() {
		tamano--;
	}
 
	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		Node crunchifyTemp = new Node(data);
		Node crunchifyCurrent = head;
 
		// Let's check for NPE before iterate over crunchifyCurrent
		if (crunchifyCurrent != null) {
			// crawl to the requested index or the last element in the list, whichever comes first
			for (int i = 0; i < index && crunchifyCurrent.getSiguiente() != null; i++) {
				crunchifyCurrent = crunchifyCurrent.getSiguiente();
			}
		}
 
		// set the new node's next-node reference to this node's next-node reference
		crunchifyTemp.setSiguiente(crunchifyCurrent.getSiguiente());
 
		// now set this node's next-node reference to the new node
		crunchifyCurrent.setSiguiente(crunchifyTemp);
 
		// increment the number of elements variable
		incrementCounter();
	}
 
	public T get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node crunchifyCurrent = null;
		if (head != null) {
			crunchifyCurrent = head.getSiguiente();
			for (int i = 0; i < index; i++) {
				if (crunchifyCurrent.getSiguiente() == null)
					return null;
 
				crunchifyCurrent = crunchifyCurrent.getSiguiente();
			}
			return (T) crunchifyCurrent.getDato();
		}
		return (T) crunchifyCurrent;
 
	}
	
	
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
 
		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;
 
		Node crunchifyCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (crunchifyCurrent.getSiguiente() == null)
					return false;
 
				crunchifyCurrent = crunchifyCurrent.getSiguiente();
			}
			crunchifyCurrent.setSiguiente(crunchifyCurrent.getSiguiente().getSiguiente());
 
			// decrement the number of elements variable
			decrementCounter();
			return true;
 
		}
		return false;
	}
 
	// returns the number of elements in this list.
	public int size() {
		return getCounter();
	}
 
	public String toString() {
		String output = "";
 
		if (head != null) {
			Node crunchifyCurrent = head.getSiguiente();
			while (crunchifyCurrent != null) {
				output += "[" + crunchifyCurrent.getDato().toString() + "]";
				crunchifyCurrent = crunchifyCurrent.getSiguiente();
			}
 
		}
		return output;
	}
	
	
	/**
	 * Iterador sacado de: https://stackoverflow.com/questions/33072986/iterator-for-a-linkedlist
	 */
	 public Iterator<T> iterator() {
	        return new Iterator<T>() {

	            Node current = head;

	            @Override
	            public boolean hasNext() {
	                return current != null;
	            }

	            @Override
	            public T next() {
	                if (hasNext()) {
	                    T data = (T) current.getDato();
	                    current = current.getSiguiente();
	                    return data;
	                }
	                return null;
	            }

	            @Override
	            public void remove() {
	                throw new UnsupportedOperationException("Remove not implemented.");
	            }

	        };

	    }
	


}
