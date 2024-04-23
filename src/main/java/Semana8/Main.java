package Semana8;

import java.util.Arrays;

import static Utils.Test.assertEquals;

public class Main {
  public static void main(String[] args) {
    Integer[] a = { 0, 1, 2, 3, 4, 5, 6 };
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

    HeapSorting.sink(a, 0, 7);
    int[] expected = {2, 1, 6, 3, 4, 5, 0};
    for(int i = 0; i < expected.length; i++) {
      assertEquals(a[i], expected[i]);
    }

    HeapSorting.heapify(a, a.length);
    expected = new int[]{6, 4, 5, 3, 1, 2, 0};
    for(int i = 0; i < expected.length; i++) {
      assertEquals(a[i], expected[i]);
    }

    Integer[] b = new Integer[15];
    for(int i = 0; i < 15; i++) { b[i] = (int) (Math.random() * 100); }
    HeapSorting.heapify(b, b.length);
    System.out.println(Arrays.toString(b));
  }
}
