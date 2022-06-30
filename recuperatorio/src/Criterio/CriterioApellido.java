package Criterio;

import java.util.Comparator;

import clases.Cliente;

public class CriterioApellido implements Comparator<Cliente> {

	@Override
	public int compare(Cliente o1, Cliente o2) {
		
		return o1.getApellido().compareTo(o2.getApellido());
	}

	
}
