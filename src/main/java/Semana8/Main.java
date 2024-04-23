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

    assertEquals(a[0], 2);
    assertEquals(a[1], 1);
    assertEquals(a[2], 6);
    assertEquals(a[3], 3);
    assertEquals(a[4], 4);
    assertEquals(a[5], 5);
    assertEquals(a[6], 0);

    for(int i = 0; i < a.length / 2; i++) HeapSorting.sink(a, i, 7);
    System.out.println(Arrays.toString(a));
  }
}
