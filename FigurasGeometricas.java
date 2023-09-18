import Formas.Circulo;
import Formas.FiguraGenerica;
import Formas.Quadrado;
import Formas.Retangulo;

public class FigurasGeometricas {

	private Retangulo retangulo;
	private Quadrado quadrado;
	private Circulo circulo;

	public FigurasGeometricas(int altura, int largura, int lado, int raio) {
		this.retangulo = new Retangulo(altura, largura);
		this.quadrado = new Quadrado(lado);
		this.circulo = new Circulo(raio);
	}

	public void area(FiguraGenerica figura) {
		System.out.println("Área: " + figura.calcularArea());
	}

	public void perimetro(FiguraGenerica figura) {
		System.out.println("Perímetro: " + figura.calcularPerimetro());
	}
}
