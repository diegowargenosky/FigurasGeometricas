package entidades;

import classesFilhas.Figura3D;

public class Piramide extends Figura3D {

	private double arestas ;
	private double altura ;

	@Override
	public double calcularVolume() {

		return (Math.pow(arestas, 2) * altura) / 3;
	}

	@Override
	public double calcularArea() {

		double g = Math.pow(arestas / 2, 2) + Math.pow(altura, 2);

		return Math.sqrt(g);
	}

	public double AreaTotal() {

		double al = (arestas * calcularArea()) / 2;

		return ((al * 4) + Math.pow(arestas, 2));

	}

	public double getArestas() {
		return arestas;
	}

	public void setArestas(double arestas) {
		this.arestas = arestas;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		
		String p;
		System.out.println("Figura geom�trica pir�mide:"+"\n");
		
		p = "Nome: "+getNome()+"\n";
		p += "Cor: "+getCor()+"\n";
		p += "Volume: "+calcularVolume()+"\n";
		p += "�rea total: "+AreaTotal()+" PI cm�"+"\n";
		return p;
	}
	
	
	
	

}
