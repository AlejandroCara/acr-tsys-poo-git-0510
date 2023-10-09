package Ej1;

public class Ej1App {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Persona p2 = new Persona("Manolo", 43, 'H');
		
		p1.setNombre("Alejandro");
		System.out.println(p1.getNombre());
		
		System.out.println(p2.getNombre() + " tiene " + p2.getEdad() + " años.");
	}

}
