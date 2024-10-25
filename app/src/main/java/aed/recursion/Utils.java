package aed.recursion;


import es.upm.aedlib.Pair;
import es.upm.aedlib.positionlist.*;



public class Utils {

  public static int sqrt(int n) {
    return sqrtRec(n, 1, n);
  }

  private static int sqrtRec(int n, int start, int end) {
    int mitad = start + (end - start) / 2; //no hago (start + end)/2 para evitar overflow con numeros grandes
    if((mitad*mitad <= n && (mitad+1)*(mitad+1) > n)) return mitad;
    if(mitad*mitad > n) return sqrtRec(n, start, mitad-1);
    return sqrtRec(n, mitad+1, end);

  }

  public static Iterable<Integer> primes(int n) {
    return null;
  }

  public static <E> boolean equals(PositionList<Pair<E,Integer>> p1, PositionList<Pair<E,Integer>> p2) {
    return false;
  }

}
