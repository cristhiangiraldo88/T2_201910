package model.data_structures;

/**
 * Abstract Data Type for a linked list of generic objects
 * This ADT should contain the basic operations to manage a list
 * add, addAtEnd, AddAtK, getElement, getCurrentElement, getSize, delete, deleteAtK
 * next, previous
 * @param <T>
 */
public interface ILinkedList<T> extends Iterable<T> {

	Integer getSize();
	public void agregar(Node<T> obj) ;
	public T darObj(int pos);
	public T darPrimer();
	public int darTamanho();
	public boolean siguiente();
	public boolean anterior();
}
