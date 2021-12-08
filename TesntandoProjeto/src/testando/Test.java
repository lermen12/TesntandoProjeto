package testando;

public class Test {

  public static void main(String[] args) {
    int i = 2;
    int j = ~i;

    System.out.println(i + " "+ j);
    System.out.println(Integer.toBinaryString(j));
    System.out.println(Integer.toBinaryString(i|j));
    System.out.println(Integer.toBinaryString(i & j));

    i++;

    System.out.println("\nValores decimais de i e j:\t" + i + " "+ j);
    System.out.println(Integer.toBinaryString(i));
    System.out.println(Integer.toBinaryString(j));
    System.out.println(Integer.toBinaryString(i|j));
    System.out.println(Integer.toBinaryString(i&j));

    int x=2, y=5;
    System.out.println( x*3< 5 && ++x+y<10);
    System.out.println(x);
  }

}
