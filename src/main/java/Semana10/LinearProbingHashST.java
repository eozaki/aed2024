package Semana10;

public class LinearProbingHashST<Key, Value> {
  private int N;
  private int M;
  private Key[] keys;
  private Value[] values;

  @SuppressWarnings("unchecked")
  public LinearProbingHashST(int M) {
    this.M = M;
    this.keys = (Key[]) new Object[M];
    this.values = (Value[]) new Object[M];
  }

  private int hash(Key key) {
    return (key.hashCode() & 0x7fffffff) % M;
  }

  public void put(Key key, Value value) {
    int i = hash(key);
    while(keys[i] != null && !key.equals(keys[i])) i = (i + 1) % M;

    keys[i] = key;
    values[i] = value;
    this.N++;
  }

  public Value get(Key key) {
    int i = hash(key);
    while(keys[i] != null && !key.equals(keys[i])) i = (i + 1) % M;

    return values[i];
  }


  public static void main(String[] args) {
    LinearProbingHashST<String, String> st = new LinearProbingHashST<>(10);
  }
}
