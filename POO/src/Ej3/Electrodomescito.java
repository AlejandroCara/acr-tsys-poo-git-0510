package Ej3;
	
public class Electrodomescito {
	
	private final int PRECIODEFECTO = 100;
	private final colores COLORDEFECTO = colores.blanco;
	private final consumos CONSUMODEFECTO = consumos.F;
	private final double PESODEFECTO = 5;
	
	public static enum consumos {
		A, B, C, D, E, F;
	};
	
	public static enum colores {
		blanco, rojo, azul, gris
	}
	
	private double precioBase = PRECIODEFECTO;
	public colores color = COLORDEFECTO;
	public consumos consumo = CONSUMODEFECTO;
	private double peso = PESODEFECTO;
	
	
	public Electrodomescito() {
		
	}
	
	public Electrodomescito(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomescito(double precioBase, colores color, consumos consumo, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public colores getColor() {
		return color;
	}

	public consumos getConsumo() {
		return consumo;
	}

	public double getPeso() {
		return peso;
	}
	
	
}
