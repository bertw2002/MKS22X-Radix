public class MyLinkedList{
  private Node<E> start, end;
  int size;
  //    not REQUIRED, but it would be crazy of you not to have this
  public String toString(){
    String str = "[";
    Node nodeIdx = start;
    if (end == null){
      return str + "]";
    }
    while (nodeIdx.getNext() != null){
      str += nodeIdx.getData() + ",";
      nodeIdx = nodeIdx.getNext();
    }
    str += nodeIdx.getData() + "]";
    return str;
  }

//construct an empty list
  public MyLinkedList(){
    size = 0;
  }


  //  reset the list to an empty state. Very similar to the constructor.
  public void clear(){
    start = null;
    end = null;
    size = 0;
  }


  //add an element to the end of the list (the boolean would be true all the time if you want to conform to list standards)
  public boolean add(E){
    
  }


  /*       in O(1) time, connect the other list to the end of this list.
        The other list is then reset to size 0 (do not wipe out the nodes, just disconnect them.)
        This is how you will merge lists together for your radix sort.*/
  public void extend(MyLinkedList<E> other){

  }
  //remove the 1st element of the list, and return that value.
  public E removeFront(){

  }

}
