import java.applet.*;
import java.awt.*;

public class EjemploPaneles extends Applet{
	Button bEsteSup,bEsteInf,b1Sur,b2Sur,b3Sur;
	TextField tf1Norte,tf2Norte;
	Panel pNorte,pEste,pOeste,pSur,pCentro;
	public void init(){
 
		setLayout(new BorderLayout());

		//Botones del este
		bEsteSup=new Button("BOTON ESTE SUP");
		bEsteInf=new Button("BOTON ESTE INF");
		pEste=new Panel(new BorderLayout());

		//Agrega botones al panel pEste
		pEste.add(bEsteSup,BorderLayout.NORTH);
		pEste.add(bEsteInf,BorderLayout.SOUTH);

		//Botones del sur
		b1Sur=new Button("BOTON SUR 1");
		b2Sur=new Button("BOTON SUR 2");
		b3Sur=new Button("BOTON SUR 3");
		pSur=new Panel();

		//Agregar botones al panel pSur
		pSur.add(b1Sur);
		pSur.add(b2Sur);
		pSur.add(b3Sur);

		//Cuadros de texto del norte
		tf1Norte=new TextField(20);
		tf2Norte=new TextField(20);
		pNorte=new Panel();

		//Agregar cuadros de texto al panel pNorte
		pNorte.add(tf1Norte);
		pNorte.add(tf2Norte);

		pOeste=new Panel();
		pOeste.setBackground(Color.cyan);

		pCentro=new Panel();
		pCentro.setBackground(Color.pink);

		//Agregar todos los paneles al contenedor principal (el applet)
		add(pNorte,BorderLayout.NORTH);
		add(pSur,BorderLayout.SOUTH);
		add(pEste,BorderLayout.EAST);
		add(pOeste,BorderLayout.WEST);
		add(pCentro,BorderLayout.CENTER);
	}
}