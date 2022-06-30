package calculadorAlquiler;

import clases.Producto;

public class CalculadorPorcentaje extends CalculadorAlquiler {

	double porcentaje;

	public CalculadorPorcentaje(double monto, double porcentaje) {
		super(monto);
		this.porcentaje = porcentaje;
	}

	@Override
	public double calcularMonto(Producto p) {
		return this.montoFijo * this.porcentaje;
	}



}
