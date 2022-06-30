package clases;

public class ElementoEnvejecimientoProgramado extends Elemento {

	Elemento referencia;
	int cantMeses;
	double porcentajeValor;
	double porcentajeCobro;
	
	
	public ElementoEnvejecimientoProgramado(int codigoId, Elemento referencia, int cantMeses, double porcentajeValor,
			double porcentajeCobro) {
		super(codigoId);
		this.referencia = referencia;
		this.cantMeses = cantMeses;
		this.porcentajeValor = porcentajeValor; //0.5
		this.porcentajeCobro = porcentajeCobro;
	}

	public boolean obsoleto() {
		return referencia.getAntig() > cantMeses;
		
	}
	@Override
	public double getValor() {
		double valor = referencia.getValor();
		if(obsoleto()) {
			return valor * porcentajeValor;
		}
		return valor;
		
	}

	@Override
	public int getAntig() {
		return referencia.getAntig();
	}

	@Override
	public double getMontoAlquiler() {
		return 0;
	}

}
