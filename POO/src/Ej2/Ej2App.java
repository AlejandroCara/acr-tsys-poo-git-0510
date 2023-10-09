package Ej2;

public class Ej2App {

	public static void main(String[] args) {
		
		Password pwd = new Password(8);
		
		System.out.println(pwd.getContraseña());
		pwd.setLongitud(10);
		System.out.println(pwd.getContraseña());
	}

}
