package Vector;

public class Main {
  public static void main(String[] args) {
    Vector[] vectors = Vector.random(10);

    System.out.println(vectors[0]);

    System.out.println(vectors[1]);

    System.out.println(vectors[0].length());

    System.out.println(vectors[0].scalarProduct(vectors[1]));

    System.out.println(vectors[0].crossProduct(vectors[1]));

    System.out.println(vectors[0].cos(vectors[1]));

    System.out.println(vectors[0].sum(vectors[1]));

    System.out.println(vectors[0].subtract(vectors[1]));
  }
}
