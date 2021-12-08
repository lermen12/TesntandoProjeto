package estruturasdeselecao;

import java.util.Scanner;

public class EstruturaSimples {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    /*double x;
    System.out.println("Informe Valor de x:");
    x = ler.nextDouble();

    if (x<10) {
      System.out.println("O numero é menor do que 10!");
      System.out.printf("Resultado da exppressão x<10: %b\n", x<10);
    }
    if (x > 10) {
      System.out.println("O numero é menor que 10!");
    }

    if (x == 10) {
      System.out.println("O numero é igual a 10!");
    }*/

    System.out.println("Digeite o tempo na empresa:");
    int x = ler.nextInt();

    if (x>10) {
      System.out.println("Digite valor do salario:");
      double s = ler.nextInt();
      double ns = 1.10 * s;
      System.out.printf("Valor do novo salario é: %.1f", ns);
    }
    if (x<10 || x==10){
      System.out.println("O salario não terá ajuste");
    }







  }
}
