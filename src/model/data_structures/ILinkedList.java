package model.data_structures;

/**
 * Abstract Data Type for a linked list of generic objects
 * This ADT should contain the basic operations to manage a list
 * add, addAtEnd, AddAtK, getElement, getCurrentElement, getSize, delete, deleteAtK
 * next, previous
 * @param <T>
 */
public interface ILinkedList<T> extends Iterable<T> {

	public int getCounter();
	public void add(T obj);
	public T get(int i);
//	public void agregar(Node<T> obj) ;
//	public T darObj(int pos);
//	public T darPrimer();
//	public int darTamanho();
//	public boolean siguiente();
//	public boolean anterior();
}
