package Criterio;

import java.util.Comparator;

import clases.Cliente;

public class CriterioCompuesto implements Comparator<Cliente> {
	Comparator c1, c2;

	
	public CriterioCompuesto(Comparator c1, Comparator c2) {
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public int compare(Cliente o1, Cliente o2) {
		int res = c1.compare(o1, o2);
		if(res == 0) {
			return c2.compare(o1, o2);
		}
		return res;
	}
	



}
