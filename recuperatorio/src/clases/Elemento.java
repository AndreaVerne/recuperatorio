package clases;

public abstract class Elemento {

	int codigoId;
	
	public int getCodigoId() {
		return codigoId;
	}
	public void setCodigoId(int codigoId) {
		this.codigoId = codigoId;
	}
	
	
	public Elemento(int codigoId) {
		this.codigoId = codigoId;
	}
	
	public abstract double getValor();
	public abstract int getAntig();
	
	//Alquiler
	public abstract double getMontoAlquiler();
	
	
	@Override
	public boolean equals(Object o) {
		Paquete c = (Paquete)o;
		return c.getCodigoId() == this.getCodigoId();
	}
	
}
