package controlador;

import logica.Sistema;
import presentacion.FPlrincipal;

public class Control {

	//private FPlrincipal fPrincipal;
	private Sistema sistema;

	public Control(Sistema sistema) {
		this.sistema = sistema;
	}

//	public Control(FPlrincipal fPlrincipal, Sistema sistema) {
//		this.fPrincipal = fPlrincipal;
//		this.sistema = sistema;
//	}
	
	public void calcular() {
		//this.fPrincipal.getpForm().gettArea().setText(String.valueOf(this.sistema.getFigura().calcularArea()));
		//this.fPrincipal.getpForm().gettPerimetro().setText(String.valueOf(this.sistema.getFigura().calcularPerimetro()));		
		this.sistema.calcular();
	}

	
}
