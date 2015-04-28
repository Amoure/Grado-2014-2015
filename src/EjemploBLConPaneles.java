import java.awt.*;
import java.applet.*;

public class EjemploBLConPaneles extends Applet {

        Panel pNorte, pSur, pEste, pOeste, pCentro;

        public void init() {
                setLayout(new BorderLayout());

                Panel pNorte = new Panel(new FlowLayout());
                pNorte.add(new Button("Norte"));

                Panel pSur = new Panel(new FlowLayout());
                pSur.add(new Button("Sur"));

                Panel pEste = new Panel(new FlowLayout());
                pEste.add(new Button("Este"));

                Panel pOeste = new Panel(new FlowLayout());
                pOeste.add(new Button("Oeste"));

                Panel pCentro = new Panel(new FlowLayout());
                pCentro.add(new Button("Centro"));

                add(pNorte, BorderLayout.NORTH);
                add(pSur, BorderLayout.SOUTH);
                add(pEste, BorderLayout.EAST);
                add(pOeste, BorderLayout.WEST);
                add(pCentro, BorderLayout.CENTER);
        }
}