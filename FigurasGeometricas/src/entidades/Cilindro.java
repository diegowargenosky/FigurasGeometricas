package entidades;

import classesFilhas.Figura3D;

public class Cilindro extends Figura3D {

	
	private double altura ;
	private double raio ;
	
	@Override
	public double calcularVolume() {
		
		return Math.pow(raio, 2) * altura;
	}

	public double soma() {
		
		return raio + raio;
	}
	@Override
	public double calcularArea() {
		
		return (2 * raio) * (altura + raio);
	
		
	}
	
	public double AreaBase() {
		
		return  Math.pow(raio, 2);
		
	}
	
	public double AreaLateral() {
		
		return (2 * raio) * altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		
		String c;
		System.out.println("Figura geom�trica cilindro:"+"\n");
		c = "Nome: "+getNome()+"\n";
		c += "Cor: "+getCor()+"\n";
		c += "C�lculo do volume: "+calcularVolume()+"\n";
		c += "�rea total: "+calcularArea()+" PI cm�"+"\n";
		return c;
	}
	
	
	

	
}
