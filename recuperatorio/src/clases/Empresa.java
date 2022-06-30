package clases;

import java.util.ArrayList;

import Criterio.Criterio;

public  class Empresa {

	ArrayList<Cliente> clientes;
	
	public ArrayList<Cliente> buscar(Criterio c) {
		ArrayList<Cliente> aux = new ArrayList<>();
		for (int i = 0; i < clientes.size(); i++) {
			if(c.cumple(clientes.get(i))) {
				aux.add(clientes.get(i));
			}
		}
		return aux;
	}
}
