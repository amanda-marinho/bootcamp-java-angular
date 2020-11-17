// Entrada
// A primeira linha de entrada contém um inteiro N (N < 100) com a quantidade de casos de teste que vem a seguir, ou melhor, a quantidade de listas de compras para organizar. Cada lista de compra consiste de uma única linha que contém de 1 a 1000 itens ou palavras compostas apenas de letras minúsculas (de 1 a 20 letras), sem acentos e separadas por um espaço.

// Saída
// A saída contém N linhas, cada uma representando uma lista de compra, sem os itens repetidos e em ordem alfabética.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int N = Integer.parseInt(st.nextToken());

    for (int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine());
      List<String> lista = new ArrayList<String>();
      while ( st.hasMoreElements()){
        String item = st.nextToken();
        if (!lista.contains(item)){
          lista.add(item);
        }
      }
      Collections.sort(lista);
      for (String item : lista) {
        System.out.print(item + " ");
      }
      System.out.println();
    }
  }
}
