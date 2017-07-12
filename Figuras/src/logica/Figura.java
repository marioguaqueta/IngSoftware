package logica;

public abstract class Figura {

	protected double valor;
	protected double area;
	protected double perimetro;

	public Figura(double valor) {
		super();
		this.valor = valor;
	}
	
	public abstract void calcularArea();
	public abstract void calcularPerimetro();
	
	public void calcular(){
		this.calcularArea();
		this.calcularPerimetro();
	}

	public double getValor() {
		return valor;
	}

	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}
	
	
}
