package calculadorAlquiler;

import clases.Producto;

public class CalculadorPorcentajeValor extends CalculadorAlquiler {

	double porcentaje;

	public CalculadorPorcentajeValor(double monto, double porcentaje) {
		super(monto);
		this.porcentaje = porcentaje;
	}


	@Override
	public double calcularMonto(Producto p) {
		
		return p.getValor() * this.porcentaje;
	}

}
