package clases;

import calculadorAlquiler.CalculadorAlquiler;

public class Producto extends Elemento {

	double valor;
	int antig;
	String descripcion;
	CalculadorAlquiler calculador;

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

	public Producto(int cod, String descr, double valor, int antig, CalculadorAlquiler calc) {
		super(cod);
		this.descripcion = descr;
		this.valor = valor;
		this.antig = antig;
		this.calculador = calc;  //RECORDAR AGREGARLO!!
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
	public double getMontoAlquiler() {
		
		return calculador.calcularMonto(this);
	}

}
