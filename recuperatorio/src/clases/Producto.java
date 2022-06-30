package clases;

public class Producto extends Elemento {

	double valor;
	int antig;
	String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setAntig(int antig) {
		this.antig = antig;
	}

	public Producto(int cod, String descr, double valor, int antig) {
		super(cod);
		this.descripcion = descr;
		this.valor = valor;
		this.antig = antig;
	}

	@Override
	public double getValor() {
		return valor;
	}

	@Override
	public int getAntig() {
		return antig;
	}

	@Override
	public int getMonto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
