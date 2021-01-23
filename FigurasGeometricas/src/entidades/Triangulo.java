package entidades;

import classesFilhas.Figura2D;

public class Triangulo extends Figura2D  {
	
	private double altura;
	private double base ;
	
	

	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	@Override
	public double calcularArea() {
	
		return (base * altura) / 2;
	}



	@Override
	public String toString() {
		
		String t;
		System.out.println("Figura geom�trica tri�ngulo:"+"\n");
		t = "Nome: "+getNome()+"\n";
		t += "Cor: "+getCor()+"\n";
		t += "C�lculo da �rea: "+calcularArea()+" cm"+"\n";
		
		
		
		return t;
	}
	
	

	

}
