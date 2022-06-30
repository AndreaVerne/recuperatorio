package calculadorAlquiler;

import clases.Producto;

//Cuando se pueden combinar los distintos tipos de calculadores
public class CalculadorCombinado extends CalculadorAlquiler{
	CalculadorAlquiler c1 , c2;
	
	public CalculadorCombinado(CalculadorAlquiler c1, CalculadorAlquiler c2) {
		this.c1 = c1;
		this.c2 = c2;
	}



	@Override
	public double calcularMonto(Producto p) {
	
		return c1.calcularMonto(p) + c2.calcularMonto(p);
	}
	
	
	
}
