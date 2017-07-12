package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import controlador.Control;
import logica.Sistema;

public class FPlrincipal extends JFrame {
	
	private Sistema sistema;
	private PForm pForm;
	private Control control;

	public FPlrincipal() {
		this.sistema = new Sistema();
		this.control = new Control(sistema);
//		this.control = new Control(this, sistema);
		this.setSize(300, 150);
		this.setLayout(new BorderLayout());
		pForm = new PForm();
		PBotones pBotones = new PBotones(this);
		this.add(pForm, BorderLayout.CENTER);
		this.add(pBotones, BorderLayout.SOUTH);
		
		this.sistema.addObserver(this.pForm);
	}

	public void calcularCuadrado() {
		this.sistema.crearCuadrado(Double.parseDouble(this.pForm.gettValor().getText()));
		control.calcular();
	}

	public void calcularCirculo() {
		this.sistema.crearCirculo(Double.parseDouble(this.pForm.gettValor().getText()));
		control.calcular();
	}
	
	public static void main(String[] args) {
		FPlrincipal fpPlrincipal = new FPlrincipal();
		fpPlrincipal.setVisible(true);
	}

	public Sistema getSistema() {
		return sistema;
	}

	public PForm getpForm() {
		return pForm;
	}
	
	
}
