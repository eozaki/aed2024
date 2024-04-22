package Semana8;

import static Utils.Test.assertEquals;

public class Main {
  public static void main(String[] args) {
    int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    assertEquals(HeapSorting.left(0), 1);
    assertEquals(HeapSorting.right(0), 2);

    assertEquals(HeapSorting.left(1), 3);
    assertEquals(HeapSorting.right(1), 4);

    assertEquals(HeapSorting.left(2), 5);
    assertEquals(HeapSorting.right(2), 6);

    assertEquals(HeapSorting.parent(0), 0);
    assertEquals(HeapSorting.parent(1), 0);
    assertEquals(HeapSorting.parent(2), 0);
    assertEquals(HeapSorting.parent(3), 1);
    assertEquals(HeapSorting.parent(4), 1);
    assertEquals(HeapSorting.parent(5), 2);
    assertEquals(HeapSorting.parent(6), 2);

    Integer[] b = {0, 1, 2, 3, 4, 5, 6};
    HeapSorting.sink(b, 0, 7);
    assertEquals(b[0], 5);
    assertEquals(b[6], 0);
  }
}
