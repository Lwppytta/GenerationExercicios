package Ex14;

import java.util.List;

public class Cliente {
	private String n, g;
	private float p;
	private int i;
	private boolean d;
	
	public Cliente(String n, String g, float p, int i, boolean d) {
		super();
		this.n = n;
		this.g = g;
		this.p = p;
		this.i = i;
		this.d = d;
	}
	
	public Cliente() {
		super();
	}

	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public String getG() {
		return g;
	}
	public void setG(String g) {
		this.g = g;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public float getP() {
		return p;
	}
	public void setP(float p) {
		this.p = p;
	}
	public boolean getD() {
		return d;
	}
	public void setD(boolean d) {
		this.d= d;
	}
}