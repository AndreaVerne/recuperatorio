package calculadorAlquiler;

import clases.Producto;

public abstract class CalculadorAlquiler {
	double montoFijo;
	
	public double getMontoFijo() {
		return montoFijo;
	}

	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}

	public CalculadorAlquiler(double monto) {
		this.montoFijo = monto;
	}

	public abstract double calcularMonto(Producto p);
}
