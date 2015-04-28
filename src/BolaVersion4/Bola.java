package BolaVersion4;

import java.awt.Color;
import java.awt.Graphics;

public class Bola implements Runnable {

	int x, y, radio, dx, dy;
	Color c;
	Graphics g;
	private Thread miHilo;
	private int velocidad = 100;

	Bola() {
		miHilo = new Thread(this);
		miHilo.start();
	}

	public void run() {
		while (miHilo != null) {
			try {
				Thread.sleep(velocidad);
			} catch (InterruptedException e) {
			}
			mover();
		}
	}

	public void matar() {
		miHilo = null;
	}

	Bola(int x, int y, int radio, Color c) {
		this();
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.c = c;
	}

	Bola(int x, int y, int radio, Color c, int dx, int dy) {
		this(x, y, radio, c);
		this.dx = dx;
		this.dy = dy;
	}

	Bola(int x, int y, int radio, Color c, Graphics g) {
		this(x, y, radio, c);
		this.g = g;
	}

	Bola(int x, int y, int radio, Color c, int dx, int dy, Graphics g) {
		this(x, y, radio, c, dx, dy);
		this.g = g;
	}

	void pintar(Graphics g) {
		if (g != null) {
			g.setColor(c);
			g.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);
		}
	}

	void pintar() {
		pintar(g);
	}

	void mover() {
            if(x+radio!=0)
		y = y + dy;
            else
                y= y - dy;
            if (y+radio!=0)
                x = x + dx;
            else   
                x = x - dx;
	}

}
