package model.data_structures;

public class Node<T> {

	private Node<T> siguiente;
	private Node<T> anterior;
	private T dato;

	public Node(T datoo) {
		siguiente = null;
		anterior = null;
		dato = datoo;
	}

	public void setSiguiente(Node<T> sig) {
		siguiente = sig;
	}

	public void setAnterior(Node<T> ant) {
		anterior = ant;
	}

	public void setDato(T dat) {
		dato = dat;
	}

	public Node<T> getSiguiente() {
		return siguiente;
	}

	public Node<T> getAnterior() {
		return anterior;
	}

	public T getDato() {
		return dato;
	}
}
