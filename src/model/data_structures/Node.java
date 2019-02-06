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

	public Node<T> darSiguiente() {
		return siguiente;
	}

	public Node<T> darAnterior() {
		return anterior;
	}

	public T darDato() {
		return dato;
	}
}
