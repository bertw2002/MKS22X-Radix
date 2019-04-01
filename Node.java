public class Node<E>{
  private E data;
  private Node<E> next,prev;
  public Node(E data, Node<E> next, Node<E> prev){
    this.data = data;
    this.next = next;
    this.prev = prev;
  }
  public Node (E datatwo){
    data = datatwo;
  }
  public Node<E> next(){
    return next;
  }
  public Node<E> prev(){
    return prev;
  }
  public void setNext(Node<E> nexttwo){
    next = nexttwo;
  }
  public void setPrev(Node<E> prevtwo){
    prev = prevtwo;
  }
  public E getData(){
    return data;
  }
  public void setData(E datatwo){
    data = datatwo;
  }
  public String toString(){
  	return data + "";
  }

}
