package entidades;

import classesFilhas.Figura2D;

public class Circulo extends Figura2D  {
	
	private double raio;
	
	
	

	public double getRaio() {
		return raio;
	}




	public void setRaio(double raio) {
		this.raio = raio;
	}




	@Override
	public double calcularArea() {
	
		return Math.PI * Math.pow(raio, 2);
	}




	@Override
	public String toString() {
		
		String c;
		System.out.println("Figura geom�trica c�rculo: "+"\n");
		
		c = "Nome: "+getNome()+"\n";
		c += "Cor: "+getCor()+"\n";
		c += "C�lculo da �rea: "+calcularArea()+" cm"+"\n";	
		return c ;
	}
	
	


}
