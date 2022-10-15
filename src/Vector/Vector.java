package Vector;

import java.util.Arrays;

public class Vector {
  private double x;
  private double y;
  private double z;

  public Vector(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double length() {
    return Math.sqrt(Math.pow(2.0, x) + Math.pow(2.0, y) + Math.pow(2.0, z));
  }

  public double scalarProduct(Vector vector) {
    return (x * vector.x) + (y * vector.y) + (z * vector.z);
  }

  public Vector crossProduct(Vector vector) {
    return new Vector(
            y * vector.z - z * vector.y,
            z * vector.x - x * vector.z,
            x * vector.y - y * vector.y);
  }

  public double cos(Vector vector) {
    return scalarProduct(vector) / (length() * vector.length());
  }

  public Vector sum(Vector vector) {
    return new Vector(
            x + vector.x,
            y + vector.y,
            z + vector.z);
  }

  public Vector subtract(Vector vector) {
    return new Vector(
            x - vector.x,
            y - vector.y,
            z- vector.z);
  }

  public static Vector[] random(int n){
    Vector[] vectors = new Vector[n];
    for(int i = 0; i < vectors.length; i++){
      vectors[i] = new Vector(
              Math.random() * 100,
              Math.random() * 100,
              Math.random() * 100
      );
    }
    return vectors;
  }

  public String toString() {
    return "Vector{" +
            "x=" + x +
            ", y=" + y +
            ", z=" + z +
            '}';
  }
}