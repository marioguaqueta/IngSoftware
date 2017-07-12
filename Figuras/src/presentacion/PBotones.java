package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PBotones extends JPanel implements ActionListener{
	
	private JButton bCuadrado;
	private JButton bCirculo;
	private FPlrincipal fPrincipal;

	public PBotones(FPlrincipal fPlrincipal) {
		this.fPrincipal = fPlrincipal;
		this.setLayout(new GridLayout(1,2));
		bCuadrado = new JButton("Cuadrado");
		bCirculo = new JButton("Circulo");
		this.add(this.bCuadrado);
		this.add(this.bCirculo);
		this.bCuadrado.addActionListener(this);
		this.bCirculo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.bCuadrado){
			this.fPrincipal.calcularCuadrado();
		}else if(e.getSource()==this.bCirculo){
			this.fPrincipal.calcularCirculo();			
		}
	}
}
