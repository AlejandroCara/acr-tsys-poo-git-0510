package Ej4;

public class Ej4App {

	public static void main(String[] args) {

		Serie anillosDePoder = new Serie("Señor de los anillos anillos de poder", 1, Serie.generos.fantasia, "Alguien");
		Serie houseOfDragons = new Serie("Juego de tronos house of dragons", "Otro alguien");
		
		anillosDePoder.setEntregado(true);
		houseOfDragons.setEntregado(true);
		
		System.out.println("Los titulos de las series son");
		System.out.println(anillosDePoder.getTitulo());
		System.out.println(houseOfDragons.getTitulo());
		
		System.out.println("El genero de la serie de anillos de poder es: " + anillosDePoder.getGenero());
	}

}
