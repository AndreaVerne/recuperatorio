package Criterio;

import java.util.Comparator;

import clases.Cliente;

public class CriterioAlquiler implements Comparator<Cliente>{

	
	@Override
	public int compare(Cliente o1, Cliente o2) {
		return o1.cantidadAlquileres() - o2.cantidadAlquileres();
	}

}
