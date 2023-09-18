package Formas;

public class Quadrado extends FiguraGenerica {
  private double lado;

  public Quadrado(double lado) {
    this.lado = lado;
  }

  @Override
  public double calcularArea() {
    return lado * lado;
  }

  @Override
  public double calcularPerimetro() {
    return 4 * lado;
  }

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  @Override
  public String toString() {
    return "O quadrdado criado tem altura: " + lado + " e largura de: " + lado;
  }
}
