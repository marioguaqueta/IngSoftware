package logica;

public class Circulo extends Figura {

	public Circulo(double valor) {
		super(valor);
	}

	@Override
	public void  calcularArea() {
		this.area = 2*Math.PI*this.valor;
	}

	@Override
	public void calcularPerimetro() {
		this.perimetro = Math.PI*Math.pow(this.valor, 2);
	}
}
