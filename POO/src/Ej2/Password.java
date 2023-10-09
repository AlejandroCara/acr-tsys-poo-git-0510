package Ej2;

public class Password {
	
	private int longitud = 8;
	private String contraseña = "";
	
	public Password() {
		
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}
	
	private void generarPassword() {
		contraseña = "";
		for(int i = 0; i < longitud; i++) {
			contraseña += String.valueOf((char) Math.round(Math.random() * (122-65) + 65));
		}
	}
	
	public String getContraseña() {
		return this.contraseña;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}
}
