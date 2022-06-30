package calculadorAlquiler;

import clases.Producto;

public class CalculadorMontoFijo extends CalculadorAlquiler {

	public CalculadorMontoFijo(int monto){
		super(monto);
	}

	@Override
	public double calcularMonto(Producto p) {
		return this.montoFijo;
	}
	
	
}
