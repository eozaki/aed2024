package Semana7;

import java.util.Arrays;

public class QuickSorting {
  public static boolean lessOrEqual(Comparable a, Comparable b) {
    return a.compareTo(b) <= 0;
  }

  public static void exchange(Comparable[] a, int i, int j) {
    Comparable c = a[i];
    a[i] = a[j];
    a[j] = c;
  }

  public static void shuffle(Comparable[] a) {
    for(int i = 0; i < a.length; i++) {
      int random = (int) ((i + 1) * Math.random());
      exchange(a, i, random);
    }
  }

  public static boolean isSorted(Comparable[] a) {
    for(int i = 0; i < a.length - 1; i++)
      if(!lessOrEqual(a[i], a[i + 1])) return false;
    return true;
  }

  public static int partition(Comparable[] a, int lo, int hi) {
    int i = lo;
    int j = hi + 1;
    while(true) {
      while(lessOrEqual(a[++i], a[lo]))
        if(i == hi) break;

      while(lessOrEqual(a[lo], a[--j]))
        if(j == lo) break;

      if(i >= j) break;

      exchange(a, i, j);
    }

    exchange(a, lo, j);

    return j;
  }

  public static void sortSubarray(Comparable[] a, int lo, int hi) {
    if(lo >= hi) return;

    int j = partition(a, lo, hi);
    sortSubarray(a, lo, j - 1);
    sortSubarray(a, j + 1, hi);
  }

  public static void sort(Comparable[] a) {
    sortSubarray(a, 0, a.length - 1);
  }

  public static void main(String[] args) {
    int n = 10000000;
    Double[] a = new Double[n];
    for(int i = 0; i < a.length; i++)
      a[i] = n * Math.random();

    System.out.println("Before sorting: " + Arrays.toString(a));
    System.out.println("Is sorted? " + isSorted(a));

    sort(a);

    System.out.println("After sorting: " + Arrays.toString(a));
    System.out.println("Is sorted? " + isSorted(a));
  }
}


// Sortear 3, escolhe o mediano, troca com a 1a posicao
// Segunda melhoria eu não lembro, verificar