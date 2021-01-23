package entidades;

import classesFilhas.Figura3D;

public class Cubo extends Figura3D  

{
	
	private double aresta;

	@Override
	public double calcularVolume() {
		
		return Math.pow(aresta, 3);
	}

	@Override
	public double calcularArea() {
		
		return Math.pow(aresta, 2) * 6;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public String toString() {
		
		String cb;
		System.out.println("Figura geom�trica cubo: "+"\n");
		cb = "Nome: "+getNome()+"\n";
		cb += "Cor: "+getCor()+"\n";
		cb += "C�lculo do volume: "+calcularVolume()+"\n";
		cb += "�rea total: "+calcularArea()+" PI cm�"+"\n";
		
		return cb;
	}
	
	
	
	

	

}
