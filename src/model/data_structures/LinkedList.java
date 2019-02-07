package model.data_structures;

import java.util.Iterator;

public class LinkedList<T> implements ILinkedList<T> {

	private Node<T> primero;

	private int tamanio;

	public LinkedList() {
		primero = null;
		tamanio = 0;
	}

	public void agregar(Node<T> nodo) {
		if (primero == null) {
			primero = nodo;
			tamanio++;
		} else {
			boolean done = false;
			Node<T> actual = primero;
			while (!done) {
				if (actual.getSiguiente() == null) {
					actual.setSiguiente(nodo);
					tamanio++;
					done = true;
				}
				actual = primero.getSiguiente();
			}

		}

	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T darObj(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T darPrimer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int darTamanho() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean siguiente() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean anterior() {
		// TODO Auto-generated method stub
		return false;
	}

}
