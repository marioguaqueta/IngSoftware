package presentacion;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.Sistema;

public class PForm extends JPanel implements Observer {
	
	private JTextField tValor;
	private JTextField tArea;
	private JTextField tPerimetro;

	public PForm() {
		this.setLayout(new GridLayout(3,1));
		JLabel label;
		label = new JLabel("Valor");
		tValor = new JTextField();
		this.add(label);
		this.add(this.tValor);

		label = new JLabel("Area");
		tArea = new JTextField();
		this.add(label);
		this.add(this.tArea);

		label = new JLabel("Perimetro");
		tPerimetro = new JTextField();
		this.add(label);
		this.add(this.tPerimetro);
	}

	public JTextField gettValor() {
		return tValor;
	}

	public JTextField gettArea() {
		return tArea;
	}

	public JTextField gettPerimetro() {
		return tPerimetro;
	}

	@Override
	public void update(Observable arg0, Object obj) {	
		this.tArea.setText(String.valueOf( ((Sistema)obj).getFigura().getArea() ));
		this.tPerimetro.setText(String.valueOf( ((Sistema)obj).getFigura().getPerimetro() ));		
	}
	
	

}
