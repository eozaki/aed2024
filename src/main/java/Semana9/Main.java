package Semana9;

import static Utils.Test.assertEquals;
import static Utils.Test.assertNull;

public class Main {
  public static void main(String[] args) {
    ST<String,String> st = new ST<>();

    assertEquals(st.isEmpty(), true);
    assertEquals(st.height(), 0);
    assertNull(st.get("chave"));
    assertNull(st.min());
    assertNull(st.max());

    st.put("chave", "altura 1");
    assertEquals(st.isEmpty(), false);
    assertEquals(st.height(), 1);
    assertEquals(st.get("chave"), "altura 1");

    st.put("aaaa", "esquerda");
    assertEquals(st.height(), 2);
    assertEquals(st.get("aaaa"), "esquerda");
    assertNull(st.get("direita da raiz"));

    assertEquals(st.floor("chave"), "chave");
    assertEquals(st.ceiling("bbbb"), "chave");
    assertEquals(st.floor("bbbb"), "aaaa");
    assertEquals(st.ceiling("chave"), "chave");
    assertNull(st.floor("a"));
    assertNull(st.ceiling("d"));

    st.put("direita da raiz", "agora sim");

    assertEquals(st.get("direita da raiz"), "agora sim");
    assertEquals(st.height(), 2);
    assertEquals(st.floor("eeee"), "direita da raiz");
    assertNull(st.ceiling("eeee"));

    st.put("faca", "cega");
    assertEquals(st.floor("eeee"), "direita da raiz");
    assertEquals(st.ceiling("eeee"), "faca");
    assertEquals(st.floor("faca"), "faca");
  }
}
