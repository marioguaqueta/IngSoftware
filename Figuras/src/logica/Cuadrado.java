package logica;

public class Cuadrado extends Figura {

	public Cuadrado(double valor) {
		super(valor);
	}

	@Override
	public void calcularArea() {
		this.area =  this.valor*this.valor;
	}

	@Override
	public void calcularPerimetro() {
		this.perimetro = 4*this.valor;
	}


	
}
