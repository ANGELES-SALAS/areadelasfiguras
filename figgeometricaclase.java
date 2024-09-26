package clases;

public class figgeometricaclase {

	public String nombre;
	public float base;
	public float altura;
	public float radio;
	
	public figgeometricaclase (String nombre, float base, float altura, float radio) {
		this.nombre=nombre;
		this.base=base;
		this.altura=altura;
		this.radio=radio;
	}
	
	public figgeometricaclase() {
		
	}
	public float calcularAreaCuadrado (double d, double e) {	
	  float Resultado = (float)(d * e);
	      return Resultado;
	}
	public float calcularAreaRectangulo (double a, double b) {	
		  float ResultadoRec = (float)(a * b);
		      return ResultadoRec;
}
	
}

