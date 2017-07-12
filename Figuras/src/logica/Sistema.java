package logica;

import java.util.Observable;

public class Sistema extends Observable {

	private Figura figura;
	
	public void crearCirculo(double radio){
		this.figura = new Circulo(radio);
	}

	public void crearCuadrado(double lado){
		this.figura = new Cuadrado(lado);
	}

	public Figura getFigura() {
		return figura;
	}
	
	public void calcular(){
		this.figura.calcular();
		this.notificar();
	}

	public void notificar(){
		this.setChanged();
		this.notifyObservers(this);
	}
}
