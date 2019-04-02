public class MyLinkedList<E>{
  private Node<E> start, end;
  int size;
  //    not REQUIRED, but it would be crazy of you not to have this
  public String toString(){
    String str = "[";
    Node nodeIdx = start;
    if (end == null){
      return str + "]";
    }
    while (nodeIdx.next() != null){
      str += nodeIdx.getData() + ", ";
      nodeIdx = nodeIdx.next();
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
  public void add(E element){
    if(size == 1) {
      end = new Node(element);
      start.setNext(end);
    }
    else if(size == 0) {
      //sets start to the element, because nothing in it originally.
      start = new Node(element);
    }
    else {
      Node newNode = new Node(element);
      end.setNext(newNode);
      end = newNode;
    }
    //add 1 to size becuase all cases add the element.
    size++;
  }


  /*       in O(1) time, connect the other list to the end of this list.
        The other list is then reset to size 0 (do not wipe out the nodes, just disconnect them.)
        This is how you will merge lists together for your radix sort.*/
  public void extend(MyLinkedList other){
    if (size == 0) {
      start = other.start;
    }else{
      end.setNext(other.start);
    }
    end = other.end;
    other.start = null;
    other.end = null;
    //finally, add the size
    size += other.size;
    //set other size = 0
    other.size = 0;
  }
  //remove the 1st element of the list, and return that value.
  public E removeFront(){
    Node newNode = start;
    start = start.next();
    size--;
    //if no more elements, remember to set end to null.
    if (size == 0){
      end = null;
    }
    return newNode.getData();
  }

}
