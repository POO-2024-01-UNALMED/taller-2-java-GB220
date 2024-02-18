package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	public void cambiarColor(String color) {
		
		if (color.equalsIgnoreCase("Rojo")) {
			this.color = color;
		}
		else if (color.equalsIgnoreCase("Verde")) {
			this.color = color;
		}
		else if (color.equalsIgnoreCase("Amarillo")) {
			this.color = color;
		}
		else if (color.equalsIgnoreCase("Negro")) {
			this.color = color;
		}
		else if (color.equalsIgnoreCase("Blanco")) {
			this.color = color;
		}
	}
}
