package entidades;

import classesFilhas.Figura2D;

public class Quadrado extends Figura2D {
	
	private double lado ;
	
	

	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double calcularArea() {
		
	
		return Math.pow(lado, 2);
	}



	@Override
	public String toString() {
		
		String s;
		System.out.println("Figura geom�tica quadrado:"+"\n");
		s ="Nome: "+ getNome()+"\n";
		s+= "Cor: "+getCor()+"\n";
		s+= "C�lculo da �rea: "+calcularArea()+" cm"+"\n";
		
		
		return s;
	}
	
	

	

}
