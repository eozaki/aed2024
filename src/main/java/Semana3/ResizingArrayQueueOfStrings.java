package Semana3;

public class ResizingArrayQueueOfStrings {
  private String[] queue;
  private int first, last;

  public ResizingArrayQueueOfStrings(){
    this.queue = new String[1];
    this.first = -1;
    this.last = -1;
  }

  private int size() {
    if(isEmpty()) return 0;

    if(this.last >= this.first)
      return this.last - this.first + 1;
    else
      return this.queue.length - this.first + 1 + this.last;
  }

  private int next(int position) {
    return (position + 1) % this.queue.length;
  }

  public void enqueue(String item) {
    if(this.first == next(this.last))
      resize(2 * this.queue.length);

    this.last = next(this.last);
    this.queue[this.last] = item;
  }

  public String dequeue() {
    if(isEmpty())
      throw new IllegalStateException("Queue underflow!");

    String result = this.queue[this.first];
    this.queue = null;
    if(this.first == this.last) {
      this.first = -1;
      this.last = -1;
    } else {
      this.first = next(this.first);
    }
    return result;
  }

  public boolean isEmpty() {
    return this.first == -1;
  }

  private void resize(int newSize) {
    String[] newA = new String[newSize];

    for(int i = this.first; i < last + size(); i++)
      newA[i - this.first] = this.queue[i % this.queue.length];

    this.queue = newA;
  }
}
