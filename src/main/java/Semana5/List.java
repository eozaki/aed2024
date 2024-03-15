package Semana5;

public class List<T> implements Iteratable<T> {
  public class Node {
    public T item;
    public Node next, previous;

    public Node(T item, Node next, Node previous) {
      this.item = item;
      this.next = next;
      this.previous = previous;
    }
  }

  private Node first, last;
  private int size;

  public boolean isEmpty() {
    return first == null;
  }

  public int size() {
    return size;
  }

  public void add(T item) {
    if(isEmpty()) {
      this.last = new Node(item, null, null);
      this.first = this.last;
    } else {
      this.last.next = new Node(item, null, this.last);
      this.last = this.last.next;
    }
    this.size++;
  }

  public boolean contains(T item) {
    for(Node current = first; current != null; current = current.next) {
      if(current.item == item) {
        return true;
      }
    }
    return false;
  }
}
