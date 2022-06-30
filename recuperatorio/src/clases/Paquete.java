package clases;

import java.util.ArrayList;

public class Paquete extends Elemento{

	ArrayList<Elemento> elems;
	
	public Paquete(int cod) {
		super(cod);
		this.elems = new ArrayList<>();
	}

	public ArrayList<Elemento> getElementos(){
		ArrayList<Elemento> aux = new ArrayList<>();
		for (int i = 0; i < elems.size(); i++) {
			aux.add(elems.get(i));
		}
		return aux;
	}
	
	public void addElemento(Elemento e) {
		if(!elems.contains(e)) {
		elems.add(e);
		}
	}

	@Override
	public double getValor() {
		double suma = 0.0;
		for (int i = 0; i < elems.size(); i++) {
			suma +=  elems.get(i).getValor();
		}
		return suma;
	}

	@Override
	public int getAntig() {
		int mayor = 0;
		
		for (int i = 0; i < elems.size(); i++) {
			int actual = elems.get(i).getAntig();
			if( actual > mayor) {
				mayor = actual;
			}
		}
		return mayor;
	}

	@Override
	public int getMonto() {
		// TODO Auto-generated method stub
		return 0;
	}
}
