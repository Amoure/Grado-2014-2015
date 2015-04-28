package BolaVersion4;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class AppletBola extends Applet implements Runnable {

	Bola b1, b2;
	private Thread miHilo;
	private Image imagenDB;
	private Graphics gDB;

	@Override
	public void init() {
		setBackground(Color.BLACK);
		b1 = new Bola(100, 200, 10, Color.green, 2, 1);
		b2 = new Bola(200, 200, 5, Color.pink, 3, -2);
	}

	@Override
	public void start() {
		if (miHilo == null) {
			miHilo = new Thread(this);
			miHilo.start();
		}
	}

	@Override
	public void stop() {
		if (miHilo != null) {
			miHilo = null;
		}
	}
	
	@Override
	public void destroy(){
		b1.matar();
		b1=null;
		b2.matar();
		b2=null;	
	}
	
	public void run() {
		Thread hiloActual = Thread.currentThread();
		while (miHilo == hiloActual) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
			repaint();
		}
	}

	
	public void pintar(Bola b, Graphics g) {
		if (b != null) {
			b.pintar(g);
		}
	}

	@Override
	public void paint(Graphics g) {
		pintar(b1,g);
		pintar(b2,g);
	}

	@Override
	public void update(Graphics g) {
		if (imagenDB == null) {
			imagenDB = createImage(getWidth(), getHeight());
			gDB = imagenDB.getGraphics();
		}
		gDB.setColor(getBackground());
		gDB.fillRect(0, 0, getWidth(), getHeight());
		gDB.setColor(getForeground());
		paint(gDB);
		g.drawImage(imagenDB, 0, 0, this);
	}
}
