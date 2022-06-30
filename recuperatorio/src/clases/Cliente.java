package clases;

import java.util.ArrayList;

public class Cliente{

	String nombre;
	String apellido;
	int dni;
	ArrayList<Elemento> alquiler;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public ArrayList<Elemento> getAlquiler() {
		ArrayList<Elemento> aux = new ArrayList<>();
		for (int i = 0; i < alquiler.size(); i++) {
			aux.add(alquiler.get(i));
		}
		return aux;
	}
	
	public void addAlquiler(Elemento alq) {
		if(!alquiler.contains(alq)) {
			alquiler.add(alq);
		}
	}
	
	
	
	public Cliente(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.alquiler = new ArrayList<>();
	}
	public int cantidadAlquileres() {
		return this.getAlquiler().size();
	}

	
	
}
